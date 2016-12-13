package hello;

import com.springmvc.model.User;
import com.springmvc.service.UserService;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


 
//@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest{
	
	private UserService userService;
	@Before
	public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }
	
	@Test
	public void getUser(){
        User user = new User();
        user.setUsername("jieder");
        user.setPassword("321");
        
        if(userService.getUser(user)!=null){
        	 System.out.println("取出的值是："+userService.getUser(user));
        }
        else{
        	System.out.println("没有找到该值");
        }
       
    }
	
	@Test
	public void addUser(){
        User user = new User();
        user.setUsername("jie");
        user.setPassword("134");
        userService.insertUser(user);
        System.out.println();
    }
	
	@Test
	public void updateUser(){
        User user = new User();
        user.setId(4);
        user.setUsername("jie");
        user.setPassword("hgdhgh");
    
        System.out.println(userService.updateUser(user));
    }

	@Test
	public void deleteUser(){
        User user = new User();
       
        System.out.println(userService.deleteUser(4));
    }
	
	@Test
	public void getAll(){//查询所有记录
		List<User> user = userService.getAll();
		System.out.println(user);
	}
	

	@Test
	public void print(){
		System.out.print("hello");
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
