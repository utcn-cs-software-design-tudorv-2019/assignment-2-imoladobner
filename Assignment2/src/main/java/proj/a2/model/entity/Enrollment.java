package proj.a2.model.entity;

import javax.persistence.*;

@Entity
@Table(name="enrollment")
public class Enrollment {
	@Id
	@Column(name="enrollmentId",nullable=false)
	private int enrollmentId;
	
	@Column(name="studentId")
	private int studentId;
	
	@Column(name="couseId")
	private int couseId;
	
	@Column(name="grade")
	private double grade;

	public Enrollment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enrollment(int enrollmentId, int studentId, int couseId, double grade) {
		super();
		this.enrollmentId = enrollmentId;
		this.studentId = studentId;
		this.couseId = couseId;
		this.grade = grade;
	}

	public int getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCouseId() {
		return couseId;
	}

	public void setCouseId(int couseId) {
		this.couseId = couseId;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
}
