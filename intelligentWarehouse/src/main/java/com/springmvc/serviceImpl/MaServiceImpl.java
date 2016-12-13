package com.springmvc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.MaDao;
import com.springmvc.model.Ma;
import com.springmvc.service.MaService;

@Service
public class MaServiceImpl implements MaService{
	@Autowired
	private MaDao maDao;

	public List<Ma> getAll() {
		// TODO Auto-generated method stub
		return maDao.getAll();
	}

	public Ma getMa(Ma ma) {
		// TODO Auto-generated method stub
		return maDao.getMa(ma);
	}

	public int addMa(Ma ma) {
		// TODO Auto-generated method stub
		return maDao.addMa(ma);
	}

	public int updateMa(Ma ma) {
		// TODO Auto-generated method stub
		return maDao.updateMa(ma);
	}

	public int deleteMa() {
		// TODO Auto-generated method stub
		return maDao.deleteMa();
	}

	
	
	

}
