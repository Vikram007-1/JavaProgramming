package com.bridgelabz.addressbook.model;

import java.util.List;

public class AddressBookModel {
	//public AddressBookModel(ArrayList<PersonModel> persons, String statename) {
//		this.persons = persons;
//		this.statename = statename;
//	}

	private List<Person> persons;

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
}

