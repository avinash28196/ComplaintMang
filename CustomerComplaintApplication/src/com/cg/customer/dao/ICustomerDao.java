package com.cg.customer.dao;

import com.cg.customer.model.Customer;

public interface ICustomerDao {

	Customer addDetails(Customer bean);

	Customer getDetails(int complaintId);

}
