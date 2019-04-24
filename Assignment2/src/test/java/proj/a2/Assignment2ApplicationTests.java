package proj.a2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import proj.a2.model.entity.*;
import proj.a2.model.repository.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Assignment2ApplicationTests {

	@Autowired
	StudentDAO studentDao;
	@Autowired
	UserDAO userDao;
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testUserDAO()
	{
		UserAccount user= new UserAccount("granini","0987",1);
		System.out.println(user);
		userDao.save(user);
		System.out.println("Added user");
		UserAccount userFind=userDao.findByUserName("granini");
		System.out.println(userFind);
		userDao.delete(userFind);

	}
	@Test
	public void testStudentDAO()
	{
		Student student= new Student(4,"Abu Alabala", 23011,30231);
		System.out.println(student);
		studentDao.save(student);
		System.out.println("Added student");
		Student foundstud=studentDao.findByUserId(student.getUserId());
		System.out.println(foundstud);
		studentDao.delete(foundstud);
	}
}
