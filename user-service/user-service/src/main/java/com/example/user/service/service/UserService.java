package com.example.user.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.service.VO.Department;
import com.example.user.service.VO.ResponseTemplateVO;
import com.example.user.service.entity.User;
import com.example.user.service.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	public User saveUser(User u)
	{
		userRepository.save(u);
		return u;
	}
	
	public ResponseTemplateVO getUserByDepartment(Long userid)
	{
ResponseTemplateVO obj=new ResponseTemplateVO();
User user=userRepository.findByUserId(userid);
System.out.println(user);
//Department department=restTemplate.getForObject("http://localhost:9001/departments/"+user.getDepartmentId(),Department.class);

Department department=restTemplate.getForObject("http://department-service/departments/"+user.getDepartmentId(),Department.class);
System.out.println(department);
obj.setUser(user);
obj.setDepartment(department);

return obj;

}
}
