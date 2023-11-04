package com.example.department.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.department.entity.Department;
import com.example.department.service.DepartmentService;





@RestController
@RequestMapping("/departments")

public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/addDept")
	public Department saveDepartment(@RequestBody Department dept)
	{
		System.out.println(dept);
	System.out.println("inside dept controller of save department");
		return departmentService.saveDepartment(dept);
		
	}
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") Long deptid)
	{
		return departmentService.getDepartmentById(deptid);
	}

}
