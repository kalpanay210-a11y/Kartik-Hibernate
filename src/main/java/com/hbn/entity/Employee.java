package com.hbn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
	private String emp_name;
	private String emp_gender;
	private String emp_address;
	private int emp_salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String emp_name, String emp_gender, String emp_address, int emp_salary) {
		super();
		this.emp_name = emp_name;
		this.emp_gender = emp_gender;
		this.emp_address = emp_address;
		this.emp_salary = emp_salary;
	}


	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_gender() {
		return emp_gender;
	}
	public void setEmp_gender(String emp_gender) {
		this.emp_gender = emp_gender;
	}
	public String getEmp_address() {
		return emp_address;
	}
	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}


	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_gender=" + emp_gender + ", emp_address="
				+ emp_address + ", emp_salary=" + emp_salary + "]";
	}
	
	
	
	
}