package hello;



import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springmvc.model.Material;
import com.springmvc.service.MaterialService;
import com.springmvc.util.DbContextHolder;



 
//@RunWith(SpringJUnit4ClassRunner.class)
public class MaterialTest{
	
	private MaterialService materialService;
	@Before
	public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        materialService = (MaterialService) context.getBean("materialServiceImpl");
    }
	

	
	@Test
	public void getAll(){//查询所有记录
		//DbContextHolder.setDbType("dataSource2");
		List<Material> material = materialService.getAll();
		System.out.println(material);
	}
	
	
	@Test
	public void selectByName(){//查询所有记录
		//Material material=new Material();
		
		List<Material> materialList = materialService.selectByName("套膜机");
		System.out.println(materialList);
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
