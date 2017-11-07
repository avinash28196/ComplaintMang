package com.cg.complaint.dao;

import java.util.List;

import com.cg.complaint.model.ComplaintDetails;

public interface IComplaintDao {

	void addComplaint(ComplaintDetails complaint);

	ComplaintDetails getStatusById(int id);

	List<String> getAllPrior();

}
