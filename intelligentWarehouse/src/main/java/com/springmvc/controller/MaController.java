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

import com.springmvc.model.Ma;
import com.springmvc.service.MaService;
import com.springmvc.util.DbContextHolder;

 
@Controller
@RequestMapping("/")
public class MaController {
 
	@Resource
	
	private MaService maService;
    private static final Logger logger = Logger.getLogger(MaController.class);  
     
    @RequestMapping(value="/getAllMa.do",produces = "application/json;charset=UTF-8")  	
    public @ResponseBody
    ModelAndView getAllReport(){		
		ModelAndView modelAndView = new ModelAndView(); 
	    
        return modelAndView;
	}
    
    @RequestMapping(value="/getAllMatList.do",produces = "application/json;charset=UTF-8")  	
    public @ResponseBody
    List<Ma> getAllReportList(){
    	DbContextHolder.setDbType("dataSource2");
		List<Ma> maList = maService.getAll();
		DbContextHolder.setDbType("dataSource1");
		maService.deleteMa();
		for(int i=0;i<maList.size();i++){
			maService.addMa(maList.get(i));
		}
		List<Ma> reportsList = maService.getAll();
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