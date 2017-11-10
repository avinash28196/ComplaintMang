package com.cg.emp.service;

import java.util.List;

import com.cg.emp.dto.DetailsBean;

public interface IEmpService {

	DetailsBean addDetails(DetailsBean cust);

	List<DetailsBean> displayAll();

}
