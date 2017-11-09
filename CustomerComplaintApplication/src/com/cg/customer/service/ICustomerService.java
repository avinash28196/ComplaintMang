package com.cg.customer.service;

import com.cg.customer.model.Customer;

public interface ICustomerService {

	Customer addDetails(Customer customer);

	Customer getDetails(int complaintId);

	void moreInfo(Customer customer);

}
