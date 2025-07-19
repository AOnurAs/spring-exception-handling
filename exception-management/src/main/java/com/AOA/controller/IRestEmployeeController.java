package com.AOA.controller;

import com.AOA.dto.DtoEmployee;
import com.AOA.model.RootEntity;

public interface IRestEmployeeController {
	
	public RootEntity<DtoEmployee> findEmployeeById(Long id);
	
}
