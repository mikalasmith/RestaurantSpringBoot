package com.tts.restaurant.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurant {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String owner;
	private String phoneNumber;
	private String address;
	
	public Restaurant() {
		
	}
	
	
	public Restaurant (String name, String owner, String phoneNumber, String address) {
		this.name = name;
		this.owner = owner;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", owner=" + owner + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
	}
	
}
