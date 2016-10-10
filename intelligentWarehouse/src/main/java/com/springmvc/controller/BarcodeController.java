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
    
    @RequestMapping(value = "/addBarcode", produces = "text/plain;charset=UTF-8")  
    public @ResponseBody  
    ModelAndView addBarcode() {  
    	ModelAndView modelAndView=new ModelAndView();
    	modelAndView.setViewName("/addBarcode");
        return modelAndView;  
       
    }  
    
    @RequestMapping(value="/addBarcodeData",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
	public @ResponseBody Barcode requestJson(@RequestBody Barcode barcode){
    	Barcode barcode1=new Barcode();
    	barcode1.setBarcodeName(barcode.getBarcodeName());
    	barcode1.setBarcodeIntime(barcode.getBarcodeIntime());
    	barcode1.setBarcodeRfcode(barcode.getBarcodeRfcode());
    	barcode1.setBarcode1(barcode.getBarcode1());
    	barcode1.setBarcode2(barcode.getBarcode2());
    	barcode1.setBarcode3(barcode.getBarcode3());
    	barcode1.setBarcode4(barcode.getBarcode4());
    	barcode1.setBarcode5(barcode.getBarcode5());
    	barcode1.setBarcode6(barcode.getBarcode6());
    	barcodeService.addBarcode(barcode1);
		
		return barcode;
	}
   
    @RequestMapping(value = "/modifyBarcode", produces = "text/plain;charset=UTF-8")  
    public @ResponseBody  
    ModelAndView modifyBarcode() { 
    	Barcode barcode1=new Barcode();
    	
    	ModelAndView modelAndView=new ModelAndView();
    	
    	modelAndView.setViewName("/modifyBarcode");
        return modelAndView;  
       
    } 
    
     
}