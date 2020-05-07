package com.cg.exception;

public class ProductDuplicacyException extends Exception{
	String msg;

	public ProductDuplicacyException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
