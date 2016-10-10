package com.springmvc.controller;
import java.util.ArrayList;  
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;
  



import org.apache.log4j.Logger;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.bind.annotation.ResponseBody;  
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.Report;
import com.springmvc.service.ReportService;
import com.springmvc.util.DbContextHolder;

 
@Controller
@RequestMapping("/")
public class ReportController {
 
	@Resource
	
	private ReportService reportService;
    private static final Logger logger = Logger.getLogger(ReportController.class);  
     
    @RequestMapping(value="/getAllReport.do",produces = "application/json;charset=UTF-8")  	
    public @ResponseBody
    ModelAndView getAllReport(){		
		ModelAndView modelAndView = new ModelAndView(); 
		DbContextHolder.setDbType("dataSource2");
		List<Report> reportsList = reportService.getAll();
		modelAndView.addObject("report", reportsList);	    
        return modelAndView;
	}
    
    @RequestMapping(value="/getAllReportList.do",produces = "application/json;charset=UTF-8")  	
    public @ResponseBody
    List<Report> getAllReportList(){
    	DbContextHolder.setDbType("dataSource2");
		List<Report> reportsList = reportService.getAll();
        return reportsList;
	}
    
//    @RequestMapping(value="/ErpQuery.do",produces = "application/json;charset=UTF-8")  	
//    public @ResponseBody
//    ModelAndView ErpQuery(){		
//		ModelAndView modelAndView = new ModelAndView(); 
//		DbContextHolder.setDbType("dataSource2");
//		List<Report> reportsList = reportService.getAll();
//		modelAndView.addObject("report", reportsList);	    
//        return modelAndView;
//	}
         
     
}