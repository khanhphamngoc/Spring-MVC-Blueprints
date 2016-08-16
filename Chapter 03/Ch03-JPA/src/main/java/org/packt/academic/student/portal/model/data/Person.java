package org.packt.academic.student.portal.model.data;
// Generated 03 14, 16 11:36:05 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * Person generated by hbm2java
 */
@Entity
@Table(name = "person", catalog = "smp")
public class Person implements java.io.Serializable {

	private Long id;
	private long version;
	private String firstName;
	private String lastName;
	private int personId;
	private double salary;

	public Person() {
	}

	public Person(String firstName, String lastName, int personId, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.personId = personId;
		this.salary = salary;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Version
	@Column(name = "version", nullable = false)
	public long getVersion() {
		return this.version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "person_id", nullable = false)
	public int getPersonId() {
		return this.personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	@Column(name = "salary", nullable = false, precision = 22, scale = 0)
	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}