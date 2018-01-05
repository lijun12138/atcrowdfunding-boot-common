package com.atguigu.atcrowdfunding.common;

import com.atguigu.atcrowdfunding.common.util.AjaxResult;

public class BaseController {
	private ThreadLocal<AjaxResult> results = new ThreadLocal<AjaxResult>();

	protected void start() {
		results.set(new AjaxResult());
	}

	protected void data(Object data) {
		results.get().setData(data);
	}

	protected void success() {
		success(true);
	}

	protected void success(boolean flg) {
		results.get().setSuccess(flg);
	}

	protected void fail() {
		success(false);
	}
	
	protected void message(String message) {
		results.get().setMessage(message);
	}

	protected Object end() {
		Object result = results.get();
		results.remove();
		return result;
	}

}
