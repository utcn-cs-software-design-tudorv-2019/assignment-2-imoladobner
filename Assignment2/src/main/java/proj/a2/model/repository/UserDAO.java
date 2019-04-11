package proj.a2.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proj.a2.model.entity.User;


public interface UserDAO extends JpaRepository<User, Integer> {
	public User findByUserName(String userName);
}
