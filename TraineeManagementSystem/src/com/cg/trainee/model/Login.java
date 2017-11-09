package com.cg.trainee.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "login")
@NamedQueries(@NamedQuery(name = "getLogin", 
	query = "SELECT log FROM Login log WHERE log.username=:user AND log.password=:pass"))
public class Login {

	@Id
	@NotEmpty(message = "Invalid Username")
	private String username;
	@NotEmpty(message = "Invalid Password")
	private String password;
	
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	Login()
	{
		super();
	}
	
}
