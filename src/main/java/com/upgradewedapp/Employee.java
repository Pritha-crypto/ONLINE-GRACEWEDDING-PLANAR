package com.upgradewedapp;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Employee {
	

		private Integer id;
		
		public String department;
		
		public String title;
		
		public String description;
		
		public LocalDateTime createdDate;
	
		public String expectedDate;
		
		public String status ;
		
		public ArrayList<String> assignees;
		
		public ArrayList<String> labels;
		
		private Integer salary;
	

//Encapsulation for salary
	public void setSalary(Integer salary ) {
		this.salary = salary;
	}

	public Integer getSalary() {
		return salary;
	}
//Encapsulation for ID	
	
	public void setEmpId(Integer id ) {
		this.id = id;
	}

	public Integer getEmpId() {
		return id;
	}
}
	



