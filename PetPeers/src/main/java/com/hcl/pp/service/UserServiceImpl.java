package com.hcl.pp.service;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.pp.dao.UserDAO;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public User addUser(User user) {
		return userDAO.addUser(user);
	}

	@Override
	public User updateUser(User user) {
		return null;
	}

	@Override
	public Set<User> listUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findByUserName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pet buyPet(Pet pet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Pet> getMyPets() {
		// TODO Auto-generated method stub
		return null;
	}

}
