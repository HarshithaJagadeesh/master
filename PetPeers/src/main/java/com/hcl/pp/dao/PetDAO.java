package com.hcl.pp.dao;

import java.util.Set;

import com.hcl.pp.model.Pet;

public interface PetDAO {
	
	public Pet getPetById(long id);
	public Pet savePet(Pet pet);
	public Set<Pet> fetchAll();

}
