package com.springmvc.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.model.Barcode;
import com.springmvc.model.Ma;
import com.springmvc.model.User;

@Repository
public interface MaDao {
	
	@Autowired
	
	public List<Ma> getAll();
	public Ma getMa(Ma ma);
	public int addMa(Ma ma);
	public int updateMa(Ma ma);
	public int deleteMa();
	

}
