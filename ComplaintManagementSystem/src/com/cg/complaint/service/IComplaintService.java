package com.cg.complaint.service;

import java.util.List;

import com.cg.complaint.model.ComplaintDetails;

public interface IComplaintService {

	void addComplaint(ComplaintDetails complaint);

	ComplaintDetails getStatusById(int id1);

	List<String> getAllPrior();

}
