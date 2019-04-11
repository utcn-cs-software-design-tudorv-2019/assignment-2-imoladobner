package proj.a2.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proj.a2.model.entity.Course;

public interface CouseDAO extends JpaRepository<Course, Integer> {

}
