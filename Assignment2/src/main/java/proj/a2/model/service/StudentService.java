package proj.a2.model.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import proj.a2.model.entity.*;
import proj.a2.model.repository.*;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDao;
	
	@Autowired
	private PersonDAO personDao;
	
	public boolean checkIfExists(Student stud){
		Student student = studentDao.findByStudentId(stud.getStudentId());
		if(student == null) return false;
		return true;
	}

	public Student viewStudent(Student stud){
		return studentDao.findByStudentId(stud.getStudentId());
	}
	
	public void createStudent(Student stud)
	{
		Person pers= new Person();
		studentDao.save(stud);
		personDao.save(pers);
	}
	public void updateStudent(Student stud)
	{
		//Student s=studentDao.findByUserId(stud.getUserId());
		Student s=studentDao.findByStudentId(stud.getStudentId());
		if(s!=null) {
		studentDao.delete(s);
		studentDao.save(stud);
		}
	}
	public void deleteStudent(Student stud)
	{
		Student s=studentDao.findByUserId(stud.getUserId());
		studentDao.delete(s);
		Person p= personDao.findByStudentId(stud.getStudentId());
		if(p!=null)personDao.delete(p);
	}
	public void updatePerson(Person per)
	{
		Person p=personDao.findByStudentId(per.getStudentId());
		if(p!=null) {
		personDao.delete(p);
		personDao.save(per);}
	}
	public void clearPerson(Person per)
	{
		Person p=personDao.findByStudentId(per.getStudentId());
		if(p!=null) {
		p.setAddress(null);
		p.setCnp(0);
		p.setSerie(null);
		personDao.save(p);
		}
	}
}
