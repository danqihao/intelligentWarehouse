package com.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.model.Report;



@Repository
public interface ReportDao {
	@Autowired
	
	public List<Report> getAll();

}
