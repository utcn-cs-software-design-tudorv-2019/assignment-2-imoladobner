package proj.a2.model.entity;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="course")
public class Course {

	@Id
	@Column(name="courseId", nullable=false)
	private int courseId;
	
	@Column(name="courseName")
	private String courseName;
	@Column(name="exam")
	private Date exam;
	@Column(name="enrollkey")
	private String enrollkey;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseId, String courseName, Date exam, String enrollkey) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.exam = exam;
		this.enrollkey = enrollkey;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return courseName;
	}
	public void setName(String name) {
		this.courseName = name;
	}
	public Date getExam() {
		return exam;
	}
	public void setExam(Date exam) {
		this.exam = exam;
	}
	public String getEnrollkey() {
		return enrollkey;
	}
	public void setEnrollkey(String enrollkey) {
		this.enrollkey = enrollkey;
	}
	
	
}
