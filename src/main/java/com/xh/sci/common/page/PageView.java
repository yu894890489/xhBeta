package com.xh.sci.common.page;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @author dell2
 * @Description: 分页页面数据封装
 * @param <T>
 */
public class PageView<T> {
	public static PageView getPageView(Page page){
		if(page!=null){
			PageView pageView = new PageView(page.getPageNum());
//			pageView.currentpage(page.getPageNum());
//			pageView.setPageSize(page.getPageSize());
//			pageView.setStartRow(page.getStartRow());
//			pageView.setEndRow(page.getEndRow());
			pageView.setTotalrecord(page.getTotal());
			pageView.setTotalpage(page.getPages());	
			pageView.pageindex = PageIndex.getPageIndex(pageView.getPagecode(), page.getPageNum(), page.getPages());
//			pageView.setQueryResult(new QueryResult1<Object>(page,page.getTotal()));
			return pageView;
		}
		return null;
	}
	public static PageView getPageView2(Page page,int pagecode){
		if(page!=null){
			PageView pageView = new PageView(page.getPageNum());
//			pageView.currentpage(page.getPageNum());
//			pageView.setPageSize(page.getPageSize());
//			pageView.setStartRow(page.getStartRow());
//			pageView.setEndRow(page.getEndRow());
			pageView.setTotalrecord(page.getTotal());
			pageView.setTotalpage(page.getPages());	
			pageView.pageindex = PageIndex.getPageIndex(pagecode, page.getPageNum(), page.getPages());
//			pageView.setQueryResult(new QueryResult1<Object>(page,page.getTotal()));
			return pageView;
		}
		return null;
	}
	
//	/**
//	 * @Fields records :�?要分页显示的结果�?
//	 */
//	private List<T> records;
	
	/**
	 * @Fields pageindex :显示的页码数据封�?
	 */
	private PageIndex pageindex;
	
	/**
	 * @Fields totalpage :总页码数
	 */
	private long totalpage = 1;
	
//	/**
//	 * @Fields maxresult :每页显示的记录数
//	 */
//	private int maxresult = 12;
	
	/**
	 * @Fields currentpage :当前页码�?
	 */
	private int currentpage = 1;
	
	/**
	 * @Fields totalrecord :总记录数
	 */
	private long totalrecord;
	
	/**
	 * @Fields pagecode :显示多少个页�?
	 */
	private int pagecode = 10;
	
//	/**
//	 * 得到数据库分页的�?始索引�??
//	 * @return
//	 */
//	public int getFirstResult() {
//		return (this.currentpage-1)*this.maxresult;
//	}
//	/**
//	 * 得到数据库分页的结束索引�?
//	 * @return
//	 */
//	public int getEndResult() {
//		return (this.currentpage-1)*this.maxresult + this.maxresult ;
//	}
	
	public int getPagecode() {
		return pagecode;
	}

	public void setPagecode(int pagecode) {
		this.pagecode = pagecode;
	}

	public PageView(int currentpage) {
//		this.maxresult = maxresult;
		this.currentpage = currentpage;
	}
	
	public long getTotalrecord() {
		return totalrecord;
	}
	public void setTotalrecord(long totalrecord) {
		this.totalrecord = totalrecord;
//		setTotalpage(this.totalrecord%this.maxresult==0? this.totalrecord/this.maxresult : this.totalrecord/this.maxresult+1);
	}
//	public List<T> getRecords() {
//		return records;
//	}
//	public void setRecords(List<T> records) {
//		this.records = records;
//	}
	public PageIndex getPageindex() {
		return pageindex;
	}
	public long getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(long totalpage) {
		this.totalpage = totalpage;
		this.pageindex = PageIndex.getPageIndex(pagecode, currentpage, totalpage);
	}
//	public int getMaxresult() {
//		return maxresult;
//	}
	public int getCurrentpage() {
		return currentpage;
	}

//	/**
//	 * 设置查询结果
//	 * @param qr 查询结果封装的对�?
//	 */
//	public void setQueryResult(QueryResult1<T> qr){
//		setTotalrecord(qr.getResultTotal());
//		setRecords(qr.getResultList());
//	}
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
    }
}
