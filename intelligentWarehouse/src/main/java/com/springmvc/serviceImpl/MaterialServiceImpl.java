package com.springmvc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.MaterialDao;
import com.springmvc.model.Material;
import com.springmvc.service.MaterialService;

@Service
public class MaterialServiceImpl implements MaterialService{
	
	@Autowired
	private MaterialDao materialDao;

	

	
	public List<Material> getAll() {
		
		return materialDao.getAll();
	}



	
	public List<Material> selectByName(String th005) {
		// TODO Auto-generated method stub
		return materialDao.selectByName(th005);
	}



	

}
