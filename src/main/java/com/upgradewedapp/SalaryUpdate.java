package com.upgradewedapp;

import com.wedapp.constans.MessageConstants;


public class SalaryUpdate {
	
	/**
	 * This method used to calculate the incremented salary of the employer If the
	 * status of the project is completed, salary will get incremented Otherwise,
	 * there is no incrementation for the employer 
	 * @input object
	 * @return updated salary
	 */
	public static Integer getSalaryUpdate(Employee emp) {
		// Getting salary using getter
		int salary = emp.getSalary();
		int increement = 0;
		// Incrementing salary based on condition
		if (emp.status.equals(MessageConstants.COMPLETED)) {
			// incrementing salary 5%
			increement += (salary * 5) / 100;
			salary = salary + increement;
			//update incremented salary using setter
			emp.setSalary(salary);
		} 
		return salary;
	}

	/*
	 * public static void main(String[] args) {
	 * EmployeeManager.convertToCurrentStatus("COMPLETED"); int sal =
	 * getSalaryUpdate(1); System.out.println(sal); }
	 */
}
