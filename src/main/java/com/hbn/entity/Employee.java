package com.hbn.entity;

import java.util.List;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
	private String emp_name;
	private String emp_gender;
	private String emp_address;
	private int emp_salary;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
	private List<Address> address;
	
	
	
	}