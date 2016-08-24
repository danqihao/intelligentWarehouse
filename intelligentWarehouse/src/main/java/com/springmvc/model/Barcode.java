package com.springmvc.model;
import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
public class Barcode {
	private Integer barcodeId;
	private String barcodeName;
	private String barcodeIntime;
	private String barcodeRfcode;
	private String barcode1;
	private String barcode2;
	private String barcode3;
	private String barcode4;
	private String barcode5;
	private String barcode6;
		
	public Integer getBarcodeId() {
		return barcodeId;
	}

	public void setBarcodeId(Integer barcodeId) {
		this.barcodeId = barcodeId;
	}

	public String getBarcodeName() {
		return barcodeName;
	}

	public void setBarcodeName(String barcodeName) {
		this.barcodeName = barcodeName;
	}

	public String getBarcodeIntime() {
		return barcodeIntime;
	}

	public void setBarcodeIntime(String barcodeIntime) {
		this.barcodeIntime = barcodeIntime;
	}

	public String getBarcodeRfcode() {
		return barcodeRfcode;
	}

	public void setBarcodeRfcode(String barcodeRfcode) {
		this.barcodeRfcode = barcodeRfcode;
	}

	public String getBarcode1() {
		return barcode1;
	}

	public void setBarcode1(String barcode1) {
		this.barcode1 = barcode1;
	}

	public String getBarcode2() {
		return barcode2;
	}



	public void setBarcode2(String barcode2) {
		this.barcode2 = barcode2;
	}

	public String getBarcode3() {
		return barcode3;
	}

	public void setBarcode3(String barcode3) {
		this.barcode3 = barcode3;
	}

	public String getBarcode4() {
		return barcode4;
	}

	public void setBarcode4(String barcode4) {
		this.barcode4 = barcode4;
	}

	public String getBarcode5() {
		return barcode5;
	}

	public void setBarcode5(String barcode5) {
		this.barcode5 = barcode5;
	}

	public String getBarcode6() {
		return barcode6;
	}

	public void setBarcode6(String barcode6) {
		this.barcode6 = barcode6;
	}

	@Override
	public String toString() {
		return "Barcode [barcodeId=" + barcodeId + ", barcodeName=" + barcodeName+ ", barcodeIntime=" + barcodeIntime + ", barcodeRfcode=" + barcodeRfcode+"，barcode1="+barcode1+"，barcode2="+barcode2+"，barcode3="+barcode3+"，barcode4="+barcode4+"，barcode5="+barcode5+"，barcode6="+barcode6+ "]";
	}
}
