package com.hcl.pp.service;

import java.util.Set;

import com.hcl.pp.model.Pet;

public interface PetService {

	public Pet savePet(Pet pet);

	public Set<Pet> getAllPets();

}
