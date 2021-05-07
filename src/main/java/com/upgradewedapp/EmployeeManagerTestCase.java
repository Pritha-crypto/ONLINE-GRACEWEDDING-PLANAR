package com.upgradewedapp;


import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.Test;

public class EmployeeManagerTestCase {

	/**
	 * This method checks incremented salary of the employer
	 */
	@Test
	public void salaryIncreementTest() {
		Employee employee1 = new Employee();
		employee1.setEmpId(1);
		employee1.title = "Theme : Floral Vintage ";
		employee1.department = "DECORATION";
		employee1.description = "For this theme, I should be able to get all products";
		employee1.createdDate = LocalDateTime.now();
		employee1.expectedDate = "2021-06-05";
		ArrayList<String> assignees = new ArrayList<String>();
		assignees.add("Karthikeyan");
		assignees.add("Pritha");
		assignees.add("Hari");
		employee1.assignees = assignees;

		ArrayList<String> labels = new ArrayList<String>();
		labels.add("Decoration Theme Plan");
		employee1.labels = labels;
		employee1.status = "COMPLETED";
		employee1.setSalary(10000);
		int incrementalSalary = SalaryUpdate.getSalaryUpdate(employee1);
		assertEquals(incrementalSalary, 10500);
	}
	
	// get the number of projects
	/*
	 * @Test public void testListAllAssignedProjects() { ArrayList<Employee>
	 * allAssignedPlans = EmployeeManager.getAllProjects(); // returns the obj of
	 * that list assertEquals(2, allAssignedPlans.size()); }
	 */
//status convert
	/*
	 * @Test public void checkUpdateNewStatus1() {
	 * EmployeeManager.convertToCurrentStatus("COMPLETED"); boolean isUpdate =
	 * EmployeeManager.currentStatusUpdateCheck("COMPLETED"); assertTrue(isUpdate);
	 * }
	 * 
	 * @Test public void checkUpdateNewStatus2() {
	 * EmployeeManager.convertToCurrentStatus("ON HOLD"); boolean isUpdate =
	 * EmployeeManager.currentStatusUpdateCheck("COMPLETED"); assertFalse(isUpdate);
	 * }
	 */

	/*
	 * @Test public void checkSalaryUpdate1() {
	 * EmployeeManager.convertToCurrentStatus("COMPLETED"); boolean isUpdate =
	 * EmployeeManager.currentStatusUpdateCheck("COMPLETED"); assertTrue(isUpdate);
	 * int actualSalary = SalaryUpdate.getSalaryUpdate(1);
	 * assertEquals(actualSalary,10500);
	 * 
	 * }
	 */

	/*
	 * //get the number of Active, Opened, Completed, Canceled. //@Test public void
	 * testListOpenedStatus() {
	 * 
	 * ArrayList<Employee> allAssignedPlans = EmployeeManager.getOpenedStatus();
	 * assertEquals(1, allAssignedPlans.size()); Employee assign =
	 * allAssignedPlans.get(0); assertEquals(MessageConstants.OPENED,
	 * assign.status); }
	 * 
	 * @Test public void testListActiveStatus() {
	 * 
	 * ArrayList<Employee> allAssignedPlans = EmployeeManager.getActiveStatus();
	 * assertEquals(1, allAssignedPlans.size()); Employee assign =
	 * allAssignedPlans.get(0); assertEquals(MessageConstants.ACTIVE,
	 * assign.status); }
	 */

}
