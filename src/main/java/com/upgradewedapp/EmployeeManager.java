package com.upgradewedapp;


import java.util.ArrayList;



public class EmployeeManager {

	private static ArrayList<Employee> AssignList = new ArrayList<Employee>();

		
			
			//plan 1 assigned */
			

			/*Employee assign2 = new Employee();
			assign2.setEmpId(2);
			assign2.title = "Theme : Delicate White Florals ";
			assign2.department="DECORATION";
			assign2.description = "For this theme, I should be able to get all products";
			assign2.createdDate = LocalDateTime.now();
			assign2.expectedDate ="2021-07-05";
			ArrayList<String> assignees2 = new ArrayList<String>();
			assignees2.add("Karthikeyan");
			assignees2.add("Pritha");
			assignees2.add("Vignesh");
			assign2.assignees = assignees;

			ArrayList<String> labels2 = new ArrayList<String>();
			labels2.add("Decoration Theme Plan");
			assign2.labels = labels;
			assign2.status = "ACTIVE";
			assign2.setSalary(15000);
			//plan2 assigned
			AssignList.add(assign2);*/

		


		public static ArrayList<Employee> getAllProjects(){
			return AssignList;
		}
		

//		public static ArrayList<Employee> getOpenedStatus() {
//			ArrayList<Employee> list = new ArrayList<Employee>();
//			for (Employee assign : AssignList) {
//				if (assign.status.equalsIgnoreCase(MessageConstants.OPENED)) {
//					list.add(assign);
//					System.out.println(list);
//				}
//			}
//			return list;
//		}
//
//		public static ArrayList<Employee> getActiveStatus() {
//			ArrayList<Employee> list = new ArrayList<Employee>();
//			for (Employee assign : AssignList) {
//				if (assign.status.equalsIgnoreCase(MessageConstants.ACTIVE)) {
//					list.add(assign);
//					System.out.println(list);
//				}
//			}
//			return list;
//		}
		
		/*
		 * public static void convertToCurrentStatus(String newStatus){ for (Employee
		 * assign : AssignList) { assign.status = newStatus;
		 * 
		 * } }
		 * 
		 * public static boolean currentStatusUpdateCheck(String newStatus) { boolean
		 * isUpdate = false; for(Employee assign : AssignList) {
		 * if(newStatus.equals(assign.status)) { isUpdate = true; } } return isUpdate; }
		 */
		
		
	
}
		

