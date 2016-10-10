package hello;



import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springmvc.model.Report;
import com.springmvc.service.ReportService;
import com.springmvc.util.DbContextHolder;



 
//@RunWith(SpringJUnit4ClassRunner.class)
public class ReportTest{
	
	private ReportService reportService;
	@Before
	public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        reportService = (ReportService) context.getBean("reportServiceImpl");
    }
	

	
	@Test
	public void getAll(){//查询所有记录
		DbContextHolder.setDbType("dataSource2");
		List<Report> report = reportService.getAll();
		System.out.println(report);
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
