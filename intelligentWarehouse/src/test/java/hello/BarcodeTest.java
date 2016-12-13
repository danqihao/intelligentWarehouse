package hello;

import com.springmvc.model.Barcode;
import com.springmvc.service.BarcodeService;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


 

public class BarcodeTest{
	
	private BarcodeService barcodeService;
	@Before
	public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        barcodeService = (BarcodeService) context.getBean("barcodeServiceImpl");
    }
	
	@Test
	public void getBarcode(){
		Barcode barcode = new Barcode();
		barcode.setBarcodeId(4);
		
        System.out.println(barcodeService.getBarcode(barcode));
       
    }
	
	@Test
	public void addBarcode(){
		Barcode barcode = new Barcode();
		barcode.setBarcodeName("0096");
		barcode.setBarcodeIntime("20160820100828");
		barcode.setBarcodeRfcode("E2005104070B025821503612");
		barcode.setBarcode1("00000000000000000001");
		barcode.setBarcode2("00000000000000000002");
		barcode.setBarcode3("00000000000000000003");
		barcode.setBarcode4("00000000000000000004");
		barcode.setBarcode5("00000000000000000005");
		barcode.setBarcode6("00000000000000000006");
        System.out.println(barcodeService.addBarcode(barcode));
    }
	
	@Test
	public void updateBarcoder(){
		Barcode barcode = new Barcode();
		barcode.setBarcodeId(3);
        barcode.setBarcodeName("dfug");
		barcode.setBarcodeIntime("20160820100828");
		barcode.setBarcodeRfcode("E2005104070B025821503612");
		barcode.setBarcode1("00000000000000000001");
		barcode.setBarcode2("00000000000000000002");
		barcode.setBarcode3("00000000000000000003");
		barcode.setBarcode4("00000000000000000004");
		barcode.setBarcode5("00000000000000000005");
		barcode.setBarcode6("00000000000000000006");
        System.out.println(barcodeService.updateBarcode(barcode));
    }

	@Test
	public void deleteBarcode(){
		Barcode barcode = new Barcode();
       
        System.out.println(barcodeService.deleteBarcode(1));
    }
	
	@Test
	public void getAllBarcode(){//查询所有记录
		List<Barcode> barcode = barcodeService.getAllBarcode();
		System.out.println(barcode);
		 
	}
	

	@Test
	public void print(){
		System.out.print("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
