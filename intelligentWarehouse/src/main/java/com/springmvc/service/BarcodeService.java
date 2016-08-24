package com.springmvc.service;

import java.util.List;

import com.springmvc.model.Barcode;

public interface BarcodeService {
	public Barcode getBarcode(Barcode barcode);
	public int addBarcode(Barcode barcode);
	public int updateBarcode(Barcode barcode);
	public int deleteBarcode(Integer barcodeId);
	public List<Barcode> getAllBarcode();

}
