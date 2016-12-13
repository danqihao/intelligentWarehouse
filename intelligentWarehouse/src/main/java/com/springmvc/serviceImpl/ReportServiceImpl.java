package com.springmvc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.ReportDao;
import com.springmvc.model.Report;
import com.springmvc.service.ReportService;



@Service
public class ReportServiceImpl implements ReportService{
	
	@Autowired
	private ReportDao reportDao;

	
	
	public List<Report> getAll() {
		
		return reportDao.getAll();
	}

}
