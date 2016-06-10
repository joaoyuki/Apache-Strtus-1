package com.wordpress.joaoyuki.form;

import org.apache.struts.action.ActionForm;

public class HelloWorldForm extends ActionForm{
	
	private static final long serialVersionUID = 2949126494357452116L;
	
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
		

}
