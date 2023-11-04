package com.example.user.service.VO;

import com.example.user.service.entity.User;

public class ResponseTemplateVO {
	private User user;
	private Department department;
	public ResponseTemplateVO(User user, Department department) {

		this.user = user;
		this.department = department;
	}
	public ResponseTemplateVO() {}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "RestTemplateVO [user=" + user + ", department=" + department + "]";
	}
	
	

}
