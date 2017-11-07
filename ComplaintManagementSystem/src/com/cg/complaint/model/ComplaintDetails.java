package com.cg.complaint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="complaint")
@NamedQueries(
		{
		//@NamedQuery(name = "addComplaint", query = "insert into ComplaintDetails values(complaintId,accountId,branch_code,emailId,category,description,priority,status)"),
		@NamedQuery(name = "getAllPrior", query = "select priority from ComplaintDetails cd")
		}
)

public class ComplaintDetails {

	@Id
	@Column(name="complaint_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int complaintId;
	

	@Pattern(regexp="[0-9]{10}", message = "Should be of 10 digits")
	@Column(name="account_id")
	private String accountId;
	

	@NotEmpty(message = "Should not be empty")
	@Column(name="branch_code")
	private String branchCode;
	
	
	@NotEmpty(message = "Should not be empty")
	@Email(message = "Enter valid email")
	@Column(name="email_id")
	private String emailId;
	
	/*DropdDown, so no validation required*/
	@Column(name="category")
	private String category;
	
	@NotEmpty(message="Should not be empty")
	@Column(name="description")
	private String description;
	
	@Column(name="priority")
	private String priority;
	
	@Column(name="status")
	private String status;
	
	
	
	
	
	public int getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
	
	
	@Override
	public String toString() {
		return "ComplaintDetails [complaintId=" + complaintId + ", accountId="
				+ accountId + ", branchCode=" + branchCode + ", emailId="
				+ emailId + ", category=" + category + ", description="
				+ description + ", priority=" + priority + ", status=" + status
				+ "]";
	}
	
	
	
	
	
}
