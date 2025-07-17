package com.AOA.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AOA.dto.DtoDepartment;
import com.AOA.dto.DtoEmployee;
import com.AOA.model.Department;
import com.AOA.model.Employee;
import com.AOA.repository.EmployeeRepository;
import com.AOA.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public DtoEmployee findEmployeeById(Long id){
		DtoEmployee dtoEmployee = new DtoEmployee();
		DtoDepartment dtoDepartment = new DtoDepartment();
		
		Optional<Employee> optional = employeeRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		
		Employee employee = optional.get();
		Department department = employee.getDepartment();

		BeanUtils.copyProperties(employee,  dtoEmployee);
		BeanUtils.copyProperties(department,  dtoDepartment);
		
		dtoEmployee.setDtoDepartment(dtoDepartment);
		
		return dtoEmployee;
	}
}
