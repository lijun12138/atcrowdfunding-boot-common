package com.atguigu.atcrowdfunding.common.bean;

public class ProjectTicket {

	private Integer id, memberid;
	private String piid, status, pstep;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMemberid() {
		return memberid;
	}

	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
	}

	public String getPiid() {
		return piid;
	}

	public void setPiid(String piid) {
		this.piid = piid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPstep() {
		return pstep;
	}

	public void setPstep(String pstep) {
		this.pstep = pstep;
	}

}
