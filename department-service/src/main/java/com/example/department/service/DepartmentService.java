package com.example.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;

@Service
public class DepartmentService {

@Autowired
	DepartmentRepository departmentRepository;

public Department saveDepartment(Department d)
{
	System.out.println("inside dept service of save department");
	 departmentRepository.save(d);
	 return d;
}
public Department getDepartmentById(Long deptid)
{
	return departmentRepository.findByDepartmentId(deptid);
}
}
