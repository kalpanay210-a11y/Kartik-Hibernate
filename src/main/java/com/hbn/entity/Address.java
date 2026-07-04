package com.hbn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int add_id;
	private String city, state;
	
	
	public Address() {
		super();
	}
	
	public Address(int add_id, String city, String state) {
		
		super();
		this.add_id = add_id;
		this.city = city;
		this.state = state;
	}
	
	public int getAddId() {
		return add_id;
	}
	
	public void setAddId(int add_id) {
		this.add_id = add_id;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [add_id=" + add_id + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
