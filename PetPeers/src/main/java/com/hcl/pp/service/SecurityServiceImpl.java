package com.hcl.pp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.pp.dao.UserDAO;
import com.hcl.pp.model.User;

@Service
@Transactional
public class SecurityServiceImpl implements SecurityService{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public boolean authenticateUser(User user) {
		return userDAO.authenticateUser(user);
	}

}
