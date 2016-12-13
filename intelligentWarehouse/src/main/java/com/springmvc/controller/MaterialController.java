package com.springmvc.controller;
import java.util.ArrayList;  
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;
  



import org.apache.log4j.Logger;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.bind.annotation.ResponseBody;  
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.Material;
import com.springmvc.model.User;
import com.springmvc.service.MaterialService;
import com.springmvc.util.DbContextHolder;
 
@Controller
@RequestMapping("/")
public class MaterialController {
 
	@Resource
	
	private MaterialService materialService;
    private static final Logger logger = Logger.getLogger(MaterialController.class);  
     
//    @RequestMapping(value="/getAllMaterial.do",produces = "application/json;charset=UTF-8")  	
//    public @ResponseBody
//    ModelAndView getAllMaterial(){		
//		ModelAndView modelAndView = new ModelAndView(); 
//		//DbContextHolder.setDbType("dataSource2");
//		List<Material> materialList = materialService.getAll();
//		modelAndView.addObject("allMaterial", materialList);	    
//        return modelAndView;
//	}
    
    @RequestMapping(value="/getAllMaterialList.do",produces = "application/json;charset=UTF-8")  	
    public @ResponseBody
    List<Material> getAllMaterialList(){
    	//DbContextHolder.setDbType("dataSource2");
		List<Material> materialList = materialService.getAll();

        return materialList;
	}
    
    @RequestMapping(value="/ErpQuery.do",method=RequestMethod.GET,produces = "application/json;charset=UTF-8")  	
    public @ResponseBody
    ModelAndView erpQueryGet(){		
		ModelAndView modelAndView = new ModelAndView(); 
		//DbContextHolder.setDbType("dataSource2");
//		List<Material> materialList = materialService.getAll();
//		modelAndView.addObject("allMaterial", materialList);	    
        return modelAndView;
	}
    @RequestMapping(value="/ErpQuery.do",method=RequestMethod.POST,produces = "application/json;charset=UTF-8")  	
    public @ResponseBody
    List<Material> erpQueryPost(String th005){
    	
    	
    	List<Material> materialList = materialService.selectByName(th005);
    	System.out.println(materialList);
		return materialList;
	}
     
     
}