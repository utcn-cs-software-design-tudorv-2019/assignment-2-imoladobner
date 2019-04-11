package proj.a2.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proj.a2.model.entity.Enrollment;

public interface EnrollmentDAO extends JpaRepository<Enrollment, Integer>{

}
