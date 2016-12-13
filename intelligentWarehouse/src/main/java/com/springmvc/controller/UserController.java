package com.springmvc.controller;
import java.util.ArrayList;  
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;
  



import org.apache.log4j.Logger;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.User;
import com.springmvc.service.UserService;



 
@Controller
@RequestMapping("/")
@SessionAttributes({"user","username"})
public class UserController {
 
	@Resource
	private UserService userService ;
    private static final Logger logger = Logger.getLogger(UserController.class);  
  
//    @RequestMapping(value = "/hello", produces = "text/plain;charset=UTF-8")  
//    public @ResponseBody  
//    String hello() {  
//        return "你好hello";  
//       
//    }  
    
	  @RequestMapping(value = "/test", produces = "text/plain;charset=UTF-8")  
	  public @ResponseBody  
	  String hello() {  
	      return "send http success:hello, you send the message";  
	     
	  }  
	  
  @RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")  
    public @ResponseBody  
    ModelAndView index() {  
    	ModelAndView modelAndView=new ModelAndView();
    	modelAndView.setViewName("/warehouse");
    
        return modelAndView;  
       
    }   
	  
    @RequestMapping(value = "/index", produces = "text/plain;charset=UTF-8")  
    public @ResponseBody  
    ModelAndView welcome() {  
    	ModelAndView modelAndView=new ModelAndView();
    	modelAndView.setViewName("/warehouse");
        return modelAndView;  
       
    }  
        
    @RequestMapping(value = "/ajaxtest", produces = "text/plain;charset=UTF-8")  
    public @ResponseBody  
    ModelAndView ajaxtest() {  
    	ModelAndView modelAndView=new ModelAndView();
    	modelAndView.setViewName("/ajaxtest");
        return modelAndView;  
       
    }      
     
    @RequestMapping(value = "/say/{msg}",  method = RequestMethod.GET,produces = "application/json;charset=UTF-8")  
    public @ResponseBody  
    String say(@PathVariable(value = "msg") String msg) {  
        return "{\"msg\":\"you say:'" + msg + "'\"}";  
    }  
    
    @RequestMapping(value = "/say2/{msg}", produces = "application/json;charset=UTF-8")  
    public @ResponseBody  
    ModelAndView say2(@PathVariable(value = "msg") String msg) {  
    	ModelAndView modelAndView=new ModelAndView();
    	modelAndView.setViewName("3");
    	modelAndView.addObject("msg", "\"you say:'" + msg + "'\"");
        return modelAndView;  
    } 
    
    
  
    @RequestMapping(value = "/person/{id:\\d+}", method = RequestMethod.GET)  
    public @ResponseBody  
    User getPerson(@PathVariable("id") int id) {  
        logger.info("id=" + id);  
        User person = new User(); 
        person.setId(id);      
        return person;  
    }  
  
    @RequestMapping(value = "/person/{id:\\d+}", method = RequestMethod.DELETE)  
    public @ResponseBody  
    Object deletePerson(@PathVariable("id") int id) {  
        logger.info("id=" + id);  
        JSONObject jsonObject = new JSONObject();  
        jsonObject.put("msg", "message");  
        return jsonObject;  
    }  
  
    @RequestMapping(value = "/person", method = RequestMethod.POST)  
    public @ResponseBody  
    Object addPerson(User person) {  
        logger.info(person.getId());  
        JSONObject jsonObject = new JSONObject();  
        jsonObject.put("msg", "xiao");  
        return jsonObject;  
    }
    
  
  
    @RequestMapping(value = "/person", method = RequestMethod.PUT)  
    public @ResponseBody  
    Object updatePerson(User person) {  
        logger.info("id=" + person.getId());  
        JSONObject jsonObject = new JSONObject();  
        jsonObject.put("msg", "xiao");  
        return jsonObject;  
    }  
  
    @RequestMapping(value = "/person", method = RequestMethod.PATCH)  
    public @ResponseBody  
    List<User> listPerson(@RequestParam(value = "name", required = false, defaultValue = "") String name) {  
  
        logger.info("name like " + name);  
        List<User> lstPersons = new ArrayList<User>();  
  
        User person = new User();  
        person.setId(101);  
        lstPersons.add(person);  
  
        User person2 = new User();  
        person2.setId(102);  
        lstPersons.add(person2);  
  
        User person3 = new User();  
        person3.setId(103);  
        lstPersons.add(person3);  
  
        return lstPersons;  
    } 
    
   
      	    
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public @ResponseBody  
    ModelAndView loginGET() {  
    	ModelAndView modelAndView=new ModelAndView();
    	modelAndView.setViewName("/login");
        return modelAndView;  
       
    }
    
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String login(User user,ModelMap map) { 
       // map.addAttribute("username", user.getUsername()); 
        if(userService.getUser(user)!=null){
        	return "redirect:main";
        }     	 
        else{
        	return null;
        }
    } 
    

    
    @RequestMapping(value = "/main", produces = "text/plain;charset=UTF-8")  
    public @ResponseBody  
    ModelAndView main() {  
    	ModelAndView modelAndView=new ModelAndView();
    	modelAndView.setViewName("/main");
        return modelAndView;  
       
    } 
     
    @RequestMapping(value="/fail")
    public @ResponseBody  
    ModelAndView success() {  
    	ModelAndView modelAndView=new ModelAndView();
    	modelAndView.setViewName("/fail");
        return modelAndView;  
       
    } 
    
}