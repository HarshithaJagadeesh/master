package com.hcl.pp.service;

import java.util.Set;

import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

public interface UserService {

	User addUser(User user);
	User updateUser(User user);
	Set<User> listUser();
	User getUserById(long id);
	boolean removeUser(User user);
	User findByUserName(String name);
	Pet buyPet(Pet pet);
	Set<Pet> getMyPets();
	
}
