package com.springmvc.service;

import java.util.List;

import com.springmvc.model.Material;

public interface MaterialService {
	public List<Material> selectByName(String th005);
	public List<Material> getAll();

}
