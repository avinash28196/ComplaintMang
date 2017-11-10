package com.cg.emp.dao;

import java.util.List;

import com.cg.emp.dto.DetailsBean;

public interface IEmpDAO {

	public DetailsBean addDetails(DetailsBean cust);

	public List<DetailsBean> displayAll();

}
