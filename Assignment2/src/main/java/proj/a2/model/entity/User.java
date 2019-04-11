package proj.a2.model.entity;

import javax.persistence.*;

@Entity
@Table(name="userAccount")
public class User {
	@Id
	@Column(name = "userId", nullable = false)
    private int userId;

	@Column(name = "userName")
    private String userName;
	
	@Column(name = "passwordUser")
    private String passwordUser;
	
	@Column(name = "userType")
	private int userType;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, String password, int userType) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.passwordUser = password;
		this.userType = userType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return passwordUser;
	}

	public void setPassword(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}
	
}
