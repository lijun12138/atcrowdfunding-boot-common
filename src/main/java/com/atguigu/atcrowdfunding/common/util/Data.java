package com.atguigu.atcrowdfunding.common.util;

import java.util.List;

import com.atguigu.atcrowdfunding.common.bean.MemberCert;

public class Data {

	private List<Integer> idList;

	private List<MemberCert> mcs;

	public List<MemberCert> getMcs() {
		return mcs;
	}

	public void setMcs(List<MemberCert> mcs) {
		this.mcs = mcs;
	}

	public List<Integer> getIdList() {
		return idList;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}

}
