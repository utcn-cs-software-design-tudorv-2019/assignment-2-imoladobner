package proj.a2.model.entity;

import javax.persistence.*;

@Entity
@Table(name="person")
public class Person {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name="personId",nullable = false)
	private int personId;
	
	@Column(name="studentId")
	private int studentId;
	
	@Column(name="cnp")
	private int cnp;
	
	@Column(name="serie")
	private String serie;
	
	@Column(name="address")
	private String address;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int personId, int studentid, int cnp, String serie, String address) {
		super();
		this.personId = personId;
		this.studentId = studentId;
		this.cnp = cnp;
		this.serie = serie;
		this.address = address;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentid(int studentId) {
		this.studentId = studentId;
	}

	public int getCnp() {
		return cnp;
	}

	public void setCnp(int cnp) {
		this.cnp = cnp;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
