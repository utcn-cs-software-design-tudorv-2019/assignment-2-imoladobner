package proj.a2.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proj.a2.model.entity.Person;
import proj.a2.model.entity.Student;

public interface PersonDAO extends JpaRepository<Person, Integer>{
	public Person findByStudentId(int studentId);
}
