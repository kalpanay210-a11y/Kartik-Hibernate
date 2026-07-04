package com.hbn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "employee")
public class Address {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int add_id;
	private String city, state;
	
	@ManyToOne
    private Employee employee;
}