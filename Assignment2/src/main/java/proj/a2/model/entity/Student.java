package proj.a2.model.entity;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentid", nullable = false)
    private int studentId;

    @Column(name = "userid")
    private int userId;
    
    @Column(name = "studname")
    private String studName;
  
    @Column(name = "matricol")
    private int matricol;

	@Column(name = "studgroup")
    private int studGroup;
	
	 public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

	public Student( int userId, String studName, int matricol, int studGroup) {
		super();
		this.userId = userId;
		this.studName = studName;
		this.matricol = matricol;
		this.studGroup = studGroup;
	}
	
	public Student(int studentId, int userId, String studName, int matricol, int studGroup) {
		this.studentId = studentId;
		this.userId = userId;
		this.studName = studName;
		this.matricol = matricol;
		this.studGroup = studGroup;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", userId=" + userId + ", studName=" + studName + ", matricol="
				+ matricol + ", studGroup=" + studGroup + "]";
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

	public Student clone(){
	 	Student student  = new Student();
	 	student.setStudentId(this.studentId);
	 	student.setUserId(this.userId);
	 	student.setStudName(this.studName);
	 	student.setMatricol(this.matricol);
	 	student.setStudGroup(this.studGroup);
	 	return student;
	}
}
