package com.cg.trainee.dao;

import java.util.List;

import com.cg.trainee.model.Login;
import com.cg.trainee.model.Trainee;

public interface ITraineeDao {

	Login getLoginDetails(String username, String password);

	void addDetails(Trainee trainee);

	List<Integer> retrieveIds();

	void deleteTrainee(int traineeId);

	List<Trainee> retrieveDetails();

}
