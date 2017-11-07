package com.cg.complaint.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.complaint.dao.IComplaintDao;
import com.cg.complaint.model.ComplaintDetails;

@Service
@Transactional
public class ComplaintServiceImpl implements IComplaintService{

	@Autowired
	IComplaintDao dao;
	
	@Override
	public void addComplaint(ComplaintDetails complaint) {
		
		complaint.setPriority("high");
		complaint.setStatus("open");
		dao.addComplaint(complaint);
		
	}

	@Override
	public ComplaintDetails getStatusById(int id) {
		
		return dao.getStatusById(id);
	}

	@Override
	public List<String> getAllPrior() {

		return dao.getAllPrior();
	}



	
}
