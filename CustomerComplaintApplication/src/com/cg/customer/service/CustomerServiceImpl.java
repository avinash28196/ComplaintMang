package com.cg.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.customer.dao.ICustomerDao;
import com.cg.customer.model.Customer;

@Service
@Transactional	//This annotation will make automatic transaction management  
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private ICustomerDao dao;

	@Override
	public Customer addDetails(Customer bean) {
		// TODO Auto-generated method stub
		return dao.addDetails(bean);
	}

	@Override
	public Customer getDetails(int complaintId) {
		// TODO Auto-generated method stub
		return dao.getDetails(complaintId);
	}

	@Override
	public void moreInfo(Customer customer) {
		// TODO Auto-generated method stub
		if(customer.getCategory().equals("Internet Banking")){
			customer.setPriority("High");
			customer.setStatus("Closed");
		}
		else if(customer.getCategory().equals("General Banking")){
			customer.setPriority("Medium");
			customer.setStatus("Closed");
		}
		else {
			customer.setPriority("Low");
			customer.setStatus("Closed");
		}
	}


}
