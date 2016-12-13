package hello;



import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springmvc.model.Ma;
import com.springmvc.service.MaService;
import com.springmvc.util.DbContextHolder;



 
//@RunWith(SpringJUnit4ClassRunner.class)
public class MaTest{
	
	private MaService maService;
	@Before
	public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        maService = (MaService) context.getBean("maServiceImpl");
    }
	

	
	@Test
	public void getAll(){//查询所有记录
		DbContextHolder.setDbType("dataSource2");
		List<Ma> maList = maService.getAll();		
		System.out.println(maList);
		
		DbContextHolder.setDbType("dataSource1");
		maService.deleteMa();
		for(int i=0;i<maList.size();i++){
			maService.addMa(maList.get(i));
		}
		
		
	}
	@Test
	public void getAllLocal(){//查询所有记录
		
		DbContextHolder.setDbType("dataSource2");
		
		List<Ma> maList = maService.getAll();		
		System.out.println(maList);
			
	}
	
	@Test
	public void getMa(){
		DbContextHolder.setDbType("dataSource2");
		Ma ma=new Ma();
		Ma ma2=new Ma();		
		ma.setM001("s");				
		ma2=maService.getMa(ma);
		System.out.println(ma2);
		
		DbContextHolder.setDbType("dataSource1");
		maService.addMa(ma2);
		//System.out.println(maService.addMa(maService.getMa(ma)));
	}
	
	@Test
	public void addMa(){
		DbContextHolder.setDbType("dataSource1");
		Ma ma=new Ma();
		ma.setM001("3");
		ma.setM002("3");
		ma.setM003("3");
		maService.addMa(ma);
	}
	@Test
	public void deleteMa(){
		DbContextHolder.setDbType("dataSource1");
		maService.deleteMa();
	}



}
