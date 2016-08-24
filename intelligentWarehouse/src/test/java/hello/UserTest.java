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
        user.setUsername("肖谦-1");
        user.setPassword("asdf");
        System.out.println(userService.getUser(user));
    }
	
	@Test
	public void addUser(){
        User user = new User();
        user.setUsername("肖谦-2");
        user.setPassword("asdfb");
        System.out.println(userService.insertUser(user));
    }
	
	@Test
	public void updateUser(){
        User user = new User();
        user.setId(4);
        user.setUsername("jieker2");
        user.setPassword("hgdhgh");
        System.out.println(userService.updateUser(user));
    }

	@Test
	public void deleteUser(){
        User user = new User();
       
        System.out.println(userService.deleteUser(1));
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
