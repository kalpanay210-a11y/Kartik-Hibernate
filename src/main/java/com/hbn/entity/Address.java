package com.hbn.entity;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int add_id;
	private String city, state;
	
	@ManyToMany
	@JoinColumn(name = "Emp_id")
	List<Employee> employee;

}
