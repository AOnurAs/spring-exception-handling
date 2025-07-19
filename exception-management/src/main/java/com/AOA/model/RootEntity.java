package com.AOA.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RootEntity<T> {
	
	private boolean result; // if the result is Successful or not
	
	private String errorMessage; // if the result is not successful, the error message
	
	private T data; // if successful, the actual result
	
	public static <T> RootEntity<T> ok(T data){
		RootEntity<T> rootEntity = new RootEntity<>();
		rootEntity.setData(data);
		rootEntity.setResult(true);
		rootEntity.setErrorMessage(null);
		return rootEntity;
	}
	
	public static <T> RootEntity<T> error(String errorMessage){
		RootEntity<T> rootEntity = new RootEntity<>();
		rootEntity.setData(null);
		rootEntity.setResult(false);
		rootEntity.setErrorMessage(errorMessage);
		return rootEntity;
	}
}
