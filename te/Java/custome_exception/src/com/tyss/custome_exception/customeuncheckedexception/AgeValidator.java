package com.tyss.custome_exception.customeuncheckedexception;

public class AgeValidator extends RuntimeException {
	
	String msg ;
	public AgeValidator() {
		super();
	}
	
	public AgeValidator(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return this.msg;
	}
	
	
}
