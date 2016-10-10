package com.springmvc.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.model.Barcode;

@Repository
public interface BarcodeDao {
	@Autowired
	public Barcode getBarcode(Barcode barcode);
	public int addBarcode(Barcode barcode);
	public int updateBarcode(Barcode barcode);
	public int deleteBarcode(Integer barcodeId);
	public List<Barcode> getAllBarcode();

}
