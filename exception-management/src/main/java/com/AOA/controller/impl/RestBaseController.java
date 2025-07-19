package com.AOA.controller.impl;

import com.AOA.model.RootEntity;

public class RestBaseController {
	
	public <T> RootEntity<T> ok(T data){
		return RootEntity.ok(data);
	}
	
	public <T> RootEntity<T> Error(String errorMessage){
		return RootEntity.error(errorMessage);
	}

}
