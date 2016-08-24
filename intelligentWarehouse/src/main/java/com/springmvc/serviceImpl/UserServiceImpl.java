package com.springmvc.serviceImpl;

import com.springmvc.dao.UserDAO;
import com.springmvc.model.User;
import com.springmvc.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

@Service
public class UserServiceImpl implements UserService {
	

	@Autowired
    private UserDAO userDAO;
     
	public int insertUser(User user) {
      
        return userDAO.addUser(user);
    }

	public User getUser(User user) {
		return userDAO.getUser(user);
	}

	public int updateUser(User user) {
		return userDAO.updateUser(user);
	}

	public int deleteUser(Integer UserId) {
		return userDAO.deleteUser(UserId);
	}

	public List<User> getAll() {
		return userDAO.getAll();
	}

}
