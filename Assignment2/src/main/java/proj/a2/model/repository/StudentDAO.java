package proj.a2.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proj.a2.model.entity.Student;

public interface StudentDAO extends JpaRepository<Student, Integer> {
	public Student findByStudentId(int studentId);
	public Student findByUserId(int userId);
}
