package com.xh.sci.common.page;

/**
 * @Description: 分页页码封装
 * @author dell2
 *
 */
public class PageIndex {
	/**
	 * @Fields startindex :�?始页�?
	 */
	private long startindex;
	/**
	 * @Fields endindex :结束页码
	 */
	private long endindex;
	
	public PageIndex(long startindex, long endindex) {
		this.startindex = startindex;
		this.endindex = endindex;
	}
	public long getStartindex() {
		return startindex;
	}
	public void setStartindex(long startindex) {
		this.startindex = startindex;
	}
	public long getEndindex() {
		return endindex;
	}
	public void setEndindex(long endindex) {
		this.endindex = endindex;
	}
	 
	/**
	 * 计算�?始页码和结束页码
	 * @param viewpagecount 显示的页码个�?
	 * @param currentPage 当前的页码�??
	 * @param totalpage 总页码数
	 * @return
	 */
	public static PageIndex getPageIndex(long viewpagecount, int currentPage, long totalpage){
			long startpage = currentPage-(viewpagecount%2==0? viewpagecount/2-1 : viewpagecount/2);
			long endpage = currentPage+viewpagecount/2;
			if(startpage<1){
				startpage = 1;
				if(totalpage>=viewpagecount) endpage = viewpagecount;
				else endpage = totalpage;
			}
			if(endpage>totalpage){
				endpage = totalpage;
				if((endpage-viewpagecount)>0) startpage = endpage-viewpagecount+1;
				else startpage = 1;
			}
			return new PageIndex(startpage, endpage);		
	}
}
