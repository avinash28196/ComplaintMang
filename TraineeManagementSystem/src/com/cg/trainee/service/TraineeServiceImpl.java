package com.cg.trainee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.trainee.dao.ITraineeDao;
import com.cg.trainee.model.Login;
import com.cg.trainee.model.Trainee;

@Service
@Transactional
public class TraineeServiceImpl implements ITraineeService{

	@Autowired
	ITraineeDao dao;
	

	@Override
	public void addDetails(Trainee trainee) {
		// TODO Auto-generated method stub
		dao.addDetails(trainee);
	}

	@Override
	public List<Integer> retrieveIds() {
		// TODO Auto-generated method stub
		return dao.retrieveIds();
	}

	@Override
	public void deleteTrainee(int traineeId) {
		// TODO Auto-generated method stub
		dao.deleteTrainee(traineeId);
	}

	@Override
	public List<Trainee> retrieveDetails() {
		// TODO Auto-generated method stub
		return dao.retrieveDetails();
	}

	@Override
	public Login getLoginDetails(String username, String password) {
		// TODO Auto-generated method stub
		return dao.getLoginDetails(username, password);
	}

}
