package com.AOA.dto;

import com.AOA.model.Department;

import lombok.Data;

@Data
public class DtoEmployee {

	private Long id;
	
	private String name;
	
	private DtoDepartment dtoDepartment;


}
