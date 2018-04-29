package com.pmobile.tutorial.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "owner")
public class Owner extends Person {

 
	@Column(name = "address")
	private String address;

	@Column(name = "city")
    private String city;
	
	@Column(name = "phone")
	private String phone;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	private List<Pet> pets = new ArrayList<>();

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

}