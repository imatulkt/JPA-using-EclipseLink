package com.atul.JPA.model;

import jakarta.persistence.*;
import java.util.Date;


@Table(name="employees", schema = "hr")
@Entity //// Define this class as "Mapped Entity" to database
public class Employee {

	@Id // set the primary key
	@Column(name="emp_no") // Map to column (attribute) of table
	private Integer empId;
	
	@Column(name="first_name", length=14)
	private String firstName;
	
	@Column(name="last_name", length=16)
	private String lastName;
	
	@Column(name="hire_date")
	@Temporal(TemporalType.DATE) // Translate the "recorded time value" into "Date"
	private Date hireDate;
	
	@Column(name="birth_date")
	@Temporal(TemporalType.DATE) // Translate the "recorded time value" into "Date"
	private Date birthDate;
	
	@Column(name="gender", length = 1)
	private String gender;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
