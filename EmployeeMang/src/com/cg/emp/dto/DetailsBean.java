package com.cg.emp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="EMPLOYEEDETAIL")
@NamedQueries({
	@NamedQuery(name="getAll", query="SELECT cust FROM DetailsBean cust")

})
public class DetailsBean {
	
	@Id
	@Column(name="NAME")
	@NotBlank(message="Enter Name")
	private String name;
	
	
	@Column(name="AGE")
	@NotBlank(message="enter age")
	private int age;
	
	@NotNull(message="Enter Date of birth")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Past
	@Column(name="DOB")
	private Date dateOfBirth;
	
	@Column(name="COURSE")
	private String course;
	
	@Column(name="DESIGNATION")
	private String desgination;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDesgination() {
		return desgination;
	}

	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}

	@Override
	public String toString() {
		return "DetailsBean [name=" + name + ", age=" + age + ", dateOfBirth="
				+ dateOfBirth + ", course=" + course + ", desgination="
				+ desgination + "]";
	}
	
	
	



	
}
