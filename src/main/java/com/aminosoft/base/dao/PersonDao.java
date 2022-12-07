package com.aminosoft.base.dao;

import java.util.UUID;

import com.aminosoft.base.model.Person;

public interface PersonDao {
	
	int insertPerson(UUID id,Person person);
	
	default int addPerson(Person person) {
		UUID id=UUID.randomUUID();
		return insertPerson(id, person);
	}
	
	

}
