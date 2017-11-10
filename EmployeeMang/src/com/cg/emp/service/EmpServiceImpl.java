package com.cg.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.emp.dao.IEmpDAO;
import com.cg.emp.dto.DetailsBean;


@Service
public class EmpServiceImpl implements IEmpService{

	@Autowired
	private IEmpDAO empDao;
	
	@Override
	public DetailsBean addDetails(DetailsBean cust) {
		
		return empDao.addDetails(cust);
	}

	@Override
	public List<DetailsBean> displayAll() {
		// TODO Auto-generated method stub
		return empDao.displayAll();
	}

}
