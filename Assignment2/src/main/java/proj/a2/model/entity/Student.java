package proj.a2.model.entity;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

	@Id
    @Column(name = "studentId", nullable = false)
    private int studentId;

    @Column(name = "userId")
    private int userId;
    
    @Column(name = "studName")
    private String studName;
  
    @Column(name = "matricol")
    private int matricol;

	@Column(name = "studGroup")
    private int studGroup;
	
	 public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

	public Student(int studentId, int userId, String studName, int matricol, int studGroup) {
		super();
		this.studentId = studentId;
		this.userId = userId;
		this.studName = studName;
		this.matricol = matricol;
		this.studGroup = studGroup;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getMatricol() {
		return matricol;
	}

	public void setMatricol(int matricol) {
		this.matricol = matricol;
	}

	public int getStudGroup() {
		return studGroup;
	}

	public void setStudGroup(int studGroup) {
		this.studGroup = studGroup;
	}
	 //override tostring?
}
