package com.hcl.pp.service;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hcl.pp.model.Pet;

@Service
@Transactional
public class PetServiceImpl implements PetService {
	
	@Autowired
	
	
	public Pet savePet(Pet pet) {
		return pet;
	}

	public Set<Pet> getAllPets(){
		return null;
	}
}
