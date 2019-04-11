package proj.a2.model.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proj.a2.model.entity.Student;
import proj.a2.model.entity.User;
import proj.a2.model.repository.StudentDAO;
import proj.a2.model.repository.UserDAO;

@Service
public class UserService {
	@Autowired
	UserDAO userDao;
	@Autowired
	StudentDAO studentDao;
	
	public Boolean checkUser(User user)
	{
		//return false if the user is incorrect
		Boolean correctUser=false;
		User founduser=userDao.findByUserName(user.getUserName());
		if(founduser==null)return correctUser;
		if(founduser.getPassword().equals(user.getPassword()))correctUser=true;
		return correctUser;
	}
	
	//check in controll if not null !!!
	public Student studentUser(User user)
	{
		// student type =1
		
		if(user.getUserType()==1) {Student s=studentDao.findByUserId(user.getUserId());
		if(s!=null)return s;
		}
		return null;
	}
	
	//check in controll if not null !!!
	public List<Student> adminUser(User user)
	{
		List<Student> listStudent=studentDao.findAll();
		if(listStudent.isEmpty())return null;
		return listStudent;
	}

}
