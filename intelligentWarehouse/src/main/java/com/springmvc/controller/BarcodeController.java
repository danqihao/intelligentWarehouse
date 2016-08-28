package com.springmvc.controller;
import java.util.ArrayList;  
import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONObject;
  



import org.apache.log4j.Logger;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.bind.annotation.ResponseBody;  
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.Barcode;

import com.springmvc.service.BarcodeService;


 
@Controller
@RequestMapping("/")
public class BarcodeController {
 
	@Resource
	
	private BarcodeService barcodeService;
    private static final Logger logger = Logger.getLogger(BarcodeController.class);  
     
    @RequestMapping(value="/getAllBarcode.do",produces = "application/json;charset=UTF-8")  	
    public @ResponseBody
    ModelAndView getAllBarcode(){		
		ModelAndView modelAndView = new ModelAndView(); 		
		List<Barcode> barcodeList = barcodeService.getAllBarcode();
		modelAndView.addObject("allBarcode", barcodeList);	    
        return modelAndView;
	}
    
    @RequestMapping(value="/getAllBarcodeList.do",produces = "application/json;charset=UTF-8")  	
    public @ResponseBody
    List<Barcode> getAllBarcodeList(){		
		List<Barcode> barcodeList = barcodeService.getAllBarcode();
        return barcodeList;
	}
    
    

     
}