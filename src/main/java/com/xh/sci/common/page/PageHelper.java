package com.xh.sci.common.page;


/*
	The MIT License (MIT)

	Copyright (c) 2014 abel533@gmail.com

	Permission is hereby granted, free of charge, to any person obtaining a copy
	of this software and associated documentation files (the "Software"), to deal
	in the Software without restriction, including without limitation the rights
	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the Software is
	furnished to do so, subject to the following conditions:

	The above copyright notice and this permission notice shall be included in
	all copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
	THE SOFTWARE.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ResultMap;
import org.apache.ibatis.mapping.ResultMapping;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

/**
 * Mybatis - ͨ�÷�ҳ������
 *
 * @author liuzh/abel533/isea533
 * @version 3.2.1
 * @url http://git.oschina.net/free/Mybatis_PageHelper
 */
@Intercepts(@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}))
public class PageHelper implements Interceptor {
    private static final ThreadLocal<Page> localPage = new ThreadLocal<Page>();

    private static final List<ResultMapping> EMPTY_RESULTMAPPING = new ArrayList<ResultMapping>(0);
    
    public static Integer total = 0;
    
    //���ݿⷽ��
    private String dialect = "";
    //RowBounds����offset��ΪPageNumʹ�� - Ĭ�ϲ�ʹ��
    private boolean offsetAsPageNum = false;
    //RowBounds�Ƿ����count��ѯ - Ĭ�ϲ���ѯ
    private boolean rowBoundsWithCount = false;

    /**
     * ��ʼ��ҳ
     *
     * @param pageNum
     * @param pageSize
     */
    public static void startPage(Integer pageNum, Integer pageSize) {
    	if(pageNum==null){
    		pageNum = 1;
    	}
        startPage(pageNum, pageSize, true);
    }
    
//    public static void startPage(String pageNum, Integer pageSize) {
//    	int iPageNum = 1;
//    	if(pageNum==null){
//    		pageNum = "1";
//    	}
//    	try {
//			iPageNum = Integer.parseInt(pageNum);
//		} catch (NumberFormatException e) {
//			iPageNum = 1;
//		}
//        startPage(iPageNum, pageSize, true);
//    }

    /**
     * ��ʼ��ҳ
     *
     * @param pageNum
     * @param pageSize
     */
    public static void startPage(int pageNum, int pageSize, boolean count) {
        localPage.set(new Page(pageNum, pageSize, count ? Page.SQL_COUNT : Page.NO_SQL_COUNT));
    }

    public Object intercept(Invocation invocation) throws Throwable {
        final Object[] args = invocation.getArgs();
        RowBounds rowBounds = (RowBounds) args[2];
        if (localPage.get() == null && rowBounds == RowBounds.DEFAULT) {
            return invocation.proceed();
        } else {
            //����RowBounds-��������Mybatis�Դ����ڴ��ҳ
            args[2] = RowBounds.DEFAULT;
            MappedStatement ms = (MappedStatement) args[0];
            Object parameterObject = args[1];
            BoundSql boundSql = ms.getBoundSql(parameterObject);

            //��ҳ��Ϣ
            Page page = localPage.get();
            //�Ƴ����ر���
            localPage.remove();

            if (page == null) {
                if (offsetAsPageNum) {
                    page = new Page(rowBounds.getOffset(), rowBounds.getLimit(), rowBoundsWithCount ? Page.SQL_COUNT : Page.NO_SQL_COUNT);
                } else {
                    page = new Page(rowBounds, rowBoundsWithCount ? Page.SQL_COUNT : Page.NO_SQL_COUNT);
                }
            }
            MappedStatement qs = newMappedStatement(ms, new BoundSqlSqlSource(boundSql));
            //�������е�MappedStatement�滻Ϊ�µ�qs����ֹ�����쳣
            args[0] = qs;
            MetaObject msObject = SystemMetaObject.forObject(qs);
            String sql = (String) msObject.getValue("sqlSource.boundSql.sql");
            //�򵥵�ͨ��total��ֵ���ж��Ƿ����count��ѯ
            if (page.getTotal() > Page.NO_SQL_COUNT) {
                //��count - ��дsql
                msObject.setValue("sqlSource.boundSql.sql", getCountSql(sql));
                //��ѯ����
                Object result = invocation.proceed();
                int totalCount = (Integer) ((List) result).get(0);
                page.setTotal(totalCount);
                int totalPage = totalCount / page.getPageSize() + ((totalCount % page.getPageSize() == 0) ? 0 : 1);
                page.setPages(totalPage);
                //��ҳsql - ��дsql
                msObject.setValue("sqlSource.boundSql.sql", getPageSql(sql, page));
                //�ָ�����
                msObject.setValue("resultMaps", ms.getResultMaps());
                //ִ�з�ҳ��ѯ
                result = invocation.proceed();
                //�õ�������
                page.addAll((List) result);
                //��¼����
                total = totalCount;
                //���ؽ��
                return page;
            } else {
                //��ҳsql - ��дsql
                msObject.setValue("sqlSource.boundSql.sql", getPageSql(sql, page));
                //�ָ�����
                msObject.setValue("resultMaps", ms.getResultMaps());
                //ִ�з�ҳ��ѯ
                Object result = invocation.proceed();
                //�õ�������
                page.addAll((List) result);
                //���ؽ��
                return page;
            }
        }
    }

    /**
     * ��ȡ����sql - ���Ҫ֧���������ݿ⣬�޸�����Ϳ���
     *
     * @param sql
     * @return
     */
    private String getCountSql(String sql) {
        return "select count(0) from (" + sql + ") tmp_count";
    }

    /**
     * ��ȡ��ҳsql - ���Ҫ֧���������ݿ⣬�޸�����Ϳ���
     *
     * @param sql
     * @param page
     * @return
     */
    private String getPageSql(String sql, Page page) {
        StringBuilder pageSql = new StringBuilder(200);
        if ("mysql".equals(dialect)) {
            pageSql.append(sql);
            pageSql.append(" limit " + page.getStartRow() + "," + page.getPageSize());
        } else if ("hsqldb".equals(dialect)) {
            pageSql.append(sql);
            pageSql.append(" LIMIT " + page.getPageSize() + " OFFSET " + page.getStartRow());
        } else if ("oracle".equals(dialect)) {
            pageSql.append("select * from ( select temp.*, rownum row_id from ( ");
            pageSql.append(sql);
            pageSql.append(" ) temp where rownum <= ").append(page.getEndRow());
            pageSql.append(") where row_id > ").append(page.getStartRow());
        } else if("sqlserver".equals(dialect)){
        	//��sql����ȡorder by sql
        	String orderBySql = "";
            //sql��ȥ�� order by sql
        	sql = sql;
        	pageSql.append("SELECT * FROM ( ");
        	pageSql.append("		SELECT ROW_NUMBER() OVER "+orderBySql+" AS Row, T.*  from ");
        	pageSql.append("		( "+sql+" as T) TT ");
        	pageSql.append("		WHERE TT.Row between "+page.getStartRow()+" and "+page.getEndRow()+" ");
        	pageSql.append("		"+orderBySql+" ");
        }
        return pageSql.toString();
    }

    private class BoundSqlSqlSource implements SqlSource {
        BoundSql boundSql;

        public BoundSqlSqlSource(BoundSql boundSql) {
            this.boundSql = boundSql;
        }

        public BoundSql getBoundSql(Object parameterObject) {
            return boundSql;
        }
    }

    /**
     * ����MappedStatement��һ��ȫ�ֹ���Ķ��������Ҫ����һ�����������в�������ֹ�������ʵ��´���
     *
     * @param ms
     * @param newSqlSource
     * @return
     */
    private MappedStatement newMappedStatement(MappedStatement ms, SqlSource newSqlSource) {
        MappedStatement.Builder builder = new MappedStatement.Builder(ms.getConfiguration(), ms.getId() + "_��ҳ", newSqlSource, ms.getSqlCommandType());
        builder.resource(ms.getResource());
        builder.fetchSize(ms.getFetchSize());
        builder.statementType(ms.getStatementType());
        builder.keyGenerator(ms.getKeyGenerator());
        if (ms.getKeyProperties() != null && ms.getKeyProperties().length != 0) {
            StringBuffer keyProperties = new StringBuffer();
            for (String keyProperty : ms.getKeyProperties()) {
                keyProperties.append(keyProperty).append(",");
            }
            keyProperties.delete(keyProperties.length() - 1, keyProperties.length());
            builder.keyProperty(keyProperties.toString());
        }
        builder.timeout(ms.getTimeout());
        builder.parameterMap(ms.getParameterMap());
        //����resultMaps��һ����Ҫ����int���͵Ľ��������������Ҫ����һ��resultMap - ��ֹ��������
        List<ResultMap> resultMaps = new ArrayList<ResultMap>();
        ResultMap resultMap = new ResultMap.Builder(ms.getConfiguration(), ms.getId(), int.class, EMPTY_RESULTMAPPING).build();
        resultMaps.add(resultMap);
        builder.resultMaps(resultMaps);
        builder.resultSetType(ms.getResultSetType());
        builder.cache(ms.getCache());
        builder.flushCacheRequired(ms.isFlushCacheRequired());
        builder.useCache(ms.isUseCache());

        return builder.build();
    }

    /**
     * ֻ����Executor
     *
     * @param target
     * @return
     */
    public Object plugin(Object target) {
        if (target instanceof Executor) {
            return Plugin.wrap(target, this);
        } else {
            return target;
        }
    }

    public void setProperties(Properties p) {
        dialect = p.getProperty("dialect");
        if (dialect == null || dialect.equals("")) {
            throw new RuntimeException("Mybatis��ҳ���PageHelper�޷���ȡdialect����!");
        }
        //offset��ΪPageNumʹ��
        String offset = p.getProperty("offsetAsPageNum");
        if (offset != null && offset.toUpperCase().equals("TRUE")) {
            offsetAsPageNum = true;
        }
        //RowBounds��ʽ�Ƿ���count��ѯ
        String withcount = p.getProperty("rowBoundsWithCount");
        if (withcount != null && withcount.toUpperCase().equals("TRUE")) {
            rowBoundsWithCount = true;
        }
    }
}

