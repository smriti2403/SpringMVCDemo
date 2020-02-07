package com.accenture.lkm.dao;

import java.util.List;

import com.accenture.lkm.business.bean.EmployeeBean;

public interface EmployeeDAO {

	Integer addEmployee(EmployeeBean employeeBean) throws Exception;

	EmployeeBean getEmployeeDetails(Integer id) throws Exception;

	EmployeeBean updateEmployeeDetails(EmployeeBean employeeBean) throws Exception;

	EmployeeBean deleteEmployeeDetails(Integer id) throws Exception;

	List<EmployeeBean> getEmployeeList() throws Exception;

}