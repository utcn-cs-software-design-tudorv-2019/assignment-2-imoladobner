package proj.a2.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proj.a2.model.entity.UserAccount;


public interface UserDAO extends JpaRepository<UserAccount, Integer> {
	public UserAccount findByUserName(String userName);

	public UserAccount findByUserNameAndPasswordUser(String userName,String passwordUser);
}
