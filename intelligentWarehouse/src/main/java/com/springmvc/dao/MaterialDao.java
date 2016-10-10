package com.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.model.Material;

@Repository
public interface MaterialDao {
	@Autowired
	public List<Material> selectByName(String th005);
	public List<Material> getAll();

}
