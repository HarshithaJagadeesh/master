package com.hcl.pp.dao;

import java.util.Set;

import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

public interface UserDAO{

	public User addUser(User user);
	User updateUser(User user);
	Set<User> listUser();
	User getUserById(long id);
	boolean removeUser(User user);
	User findByUserName(String name);
	Pet buyPet(Pet pet);
	Set<Pet> getMyPets();
	public Boolean authenticateUser(User user);
	
	

}
