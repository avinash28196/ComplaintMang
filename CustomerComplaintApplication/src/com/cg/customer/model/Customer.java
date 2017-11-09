package com.cg.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


/* Add the below sequence in the database.
 * SEQUENCE
 * -------------------------------------------------------------------
 * CREATE SEQUENCE CUSTOMER_COMPLAINT_SEQ START WITH 1 INCREMENT BY 1;
 * -------------------------------------------------------------------
 */

@Entity
@Table(name = "complaint")
@NamedQueries(@NamedQuery(name = "getCustomerDetails", 
		query = "SELECT cust FROM Customer cust WHERE cust.complaintId=:cId"))
public class Customer {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE2")
	@SequenceGenerator(name="SEQUENCE2", sequenceName="CUSTOMER_COMPLAINT_SEQ", allocationSize=10)
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "complaintid")
	private int complaintId;
	@Pattern(regexp="[0-9]{10}",message="Account Id should be of 10 digits")
	@Column(name = "accountid")
	private String accountId;
	@NotEmpty(message = "Should not be empty")
	@Column(name = "branchcode")
	private String branchCode;
	@NotEmpty(message = "Should not be empty")
	@Email(message = "Enter valid mail Id")
	@Column(name = "emailid")
	private String email;
	@NotEmpty(message = "Should not be empty")
	@Column(name = "category")
	private String category;
	@NotEmpty(message = "Should not be empty")
	@Column(name = "description")
	private String description;
	@Column(name = "priority")
	private String priority;
	@Column(name = "status")
	private String status;
	
	public int getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
