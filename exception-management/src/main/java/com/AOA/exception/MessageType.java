package com.AOA.exception;

import lombok.Getter;

@Getter
public enum MessageType {
	
	NO_RECORD_EXIST("1001", "No record could be found"),
	GENERAL_EXCEPTİON("9999", "An error occured");
	
	private String code;
	
	private String message;
	
	MessageType(String code, String message){
		this.code = code;
		this.message = message;
	}

}
