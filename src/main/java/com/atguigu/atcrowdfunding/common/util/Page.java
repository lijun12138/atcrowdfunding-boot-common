package com.atguigu.atcrowdfunding.common.util;

public class Page<T> {

	private Integer pageno;
	private Integer pagesize;
	private Integer totalpage;
	private Integer totalcount;
	private Object datas;

	public Page(Integer pageno, Integer pagesize) {
		super();
		if (pageno <= 0) {
			this.pageno = 1;
		} else {
			this.pageno = pageno;
		}
		if (pagesize <= 0) {
			this.pagesize = 10;
		} else {
			this.pagesize = pagesize;
		}
	}

	public Integer getPageno() {
		return pageno;
	}

	public void setPageno(Integer pageno) {
		this.pageno = pageno;
	}

	public Integer getPagesize() {
		return pagesize;
	}

	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}

	public Integer getTotalpage() {
		return totalpage;
	}

	public void setTotalpage(Integer totalpage) {
		this.totalpage = totalpage;
	}

	public Integer getTotalcount() {
		return totalcount;
	}

	private Integer totalpage() {
		return totalcount;
	}

	public void setTotalcount(Integer totalcount) {
		this.totalpage = totalcount % this.pagesize == 0 ? (totalcount / this.pagesize)
				: (totalcount / this.pagesize + 1);
		this.totalcount = totalcount;
	}

	public Object getDatas() {
		return datas;
	}

	public void setDatas(Object datas) {
		this.datas = datas;
	}

	public Integer startindex() {
		return (this.pageno - 1) * pagesize;
	}
}
