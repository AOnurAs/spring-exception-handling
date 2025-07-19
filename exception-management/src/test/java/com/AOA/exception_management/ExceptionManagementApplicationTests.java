package com.AOA.exception_management;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.hibernate.sql.results.graph.entity.internal.BatchEntityInsideEmbeddableSelectFetchInitializer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.AOA.dto.DtoEmployee;
import com.AOA.service.IEmployeeService;
import com.AOA.starter.ExceptionManagementStarter;

@SpringBootTest(classes = {ExceptionManagementStarter.class})
class ExceptionManagementApplicationTests {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Inside beforeEach");
	}
	
	@Test
	public void testFindEmployeeById(){
		DtoEmployee dtoEmployee = employeeService.findEmployeeById(1L);
		assertNotNull(dtoEmployee);
		assertNotNull(dtoEmployee.getName(), "Ali");
		if(employeeService != null) {
			System.out.println("İsim : " + dtoEmployee.getName());
		}
	
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("inside afterEach");
	}
	
}
