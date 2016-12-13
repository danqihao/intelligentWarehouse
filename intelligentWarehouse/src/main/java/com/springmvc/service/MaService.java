package com.springmvc.service;

import java.util.List;

import com.springmvc.model.Ma;

public interface MaService {
	public List<Ma> getAll();
	public Ma getMa(Ma ma);
	public int addMa(Ma ma);
	public int updateMa(Ma ma);
	public int deleteMa();
}
