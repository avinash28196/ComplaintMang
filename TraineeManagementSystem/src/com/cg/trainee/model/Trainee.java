package com.cg.trainee.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name = "trainee")
@NamedQueries({
	@NamedQuery(name = "deleteTraineeById", query = "DELETE FROM Trainee t WHERE t.traineeId=:tId"),
	@NamedQuery(name = "getTraineeIds", query = "SELECT traineeId FROM Trainee t"),
	@NamedQuery(name = "getAllTrainees", query = "SELECT t FROM Trainee t")
})
public class Trainee {

	@Id
	@NotNull
	private int traineeId;
	@NotEmpty
	private String traineeName;
	private String traineeCity;
	private String traineeDomain;
	
	
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeCity() {
		return traineeCity;
	}
	public void setTraineeCity(String traineeCity) {
		this.traineeCity = traineeCity;
	}
	public String getTraineeDomain() {
		return traineeDomain;
	}
	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}
}
