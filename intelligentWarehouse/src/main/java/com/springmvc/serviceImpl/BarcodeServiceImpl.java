package com.springmvc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.BarcodeDao;
import com.springmvc.model.Barcode;
import com.springmvc.service.BarcodeService;

@Service
public class BarcodeServiceImpl implements BarcodeService{
	@Autowired
	private BarcodeDao barcodeDao;

	public Barcode getBarcode(Barcode barcode) {
		
		return barcodeDao.getBarcode(barcode);
	}

	public int addBarcode(Barcode barcode) {
		
		return barcodeDao.addBarcode(barcode);
	}

	public int updateBarcode(Barcode barcode) {
		
		return barcodeDao.updateBarcode(barcode);
	}

	public int deleteBarcode(Integer barcodeId) {
		
		return barcodeDao.deleteBarcode(barcodeId);
	}

	public List<Barcode> getAllBarcode() {
		
		return barcodeDao.getAllBarcode();
	}

}
