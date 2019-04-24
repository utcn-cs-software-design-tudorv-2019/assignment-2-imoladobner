package proj.a2.model.entity;

import javax.persistence.*;

@Entity
@Table(name="useraccount")
public class UserAccount {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "userid", nullable = false)
    private int userId;

	@Column(name = "username")
    private String userName;
	
	@Column(name = "passworduser")
    private String passwordUser;
	
	@Column(name = "usertype")
	private int userType;

	public UserAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAccount( String userName, String passwordUser, int userType) {
		super();
		this.userName = userName;
		this.passwordUser = passwordUser;
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "UserAccount [userId=" + userId + ", userName=" + userName + ", passwordUser=" + passwordUser
				+ ", userType=" + userType + "]";
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
