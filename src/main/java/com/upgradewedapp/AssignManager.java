package com.wedapp;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class AssignManager {

	private static ArrayList<Assign> AssignList = new ArrayList<Assign>();

		static {
			Assign assign1 = new Assign();
			assign1.id = 1;
			assign1.title = "Theme : Floral Vintage ";
			assign1.description = "For this theme, I should be able to get all products";
			assign1.createdDate = LocalDateTime.now();
			assign1.modifiedDate = LocalDateTime.now();
			assign1.expectedDate ="2021-06-05";
			ArrayList<String> assignees = new ArrayList<String>();
			assignees.add("Karthikeyan");
			assignees.add("Pritha");
			assignees.add("Hari");
			assign1.assignees = assignees;

			ArrayList<String> labels = new ArrayList<String>();
			labels.add("Decoration Theme Plan");
			assign1.labels = labels;
			assign1.status = "OPENED";
			AssignList.add(assign1);
			/*ArrayList<String> status = new ArrayList<String>();
			status.add("ACTIVE");
			status.add("OPENED");
			status.add("COMPLETED");
			status.add("CANCELLED");
			assign1.status = status;
			//plan 1 assigned */
			

			Assign assign2 = new Assign();
			assign2.id = 1;
			assign2.title = "Theme : Delicate White Florals ";
			assign2.description = "For this theme, I should be able to get all products";
			assign2.createdDate = LocalDateTime.now();
			assign2.modifiedDate = LocalDateTime.now();
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
			//plan2 assigned
			AssignList.add(assign2);

		}


		public static ArrayList<Assign> getAllAssignees(){
			return AssignList;
		}
		

		public static ArrayList<Assign> getOpenedStatus() {
			ArrayList<Assign> list = new ArrayList<Assign>();
			for (Assign assign : AssignList) {
				if (assign.status.equalsIgnoreCase(MessageConstants.OPENED)) {
					list.add(assign);
					System.out.println(list);
				}
			}
			return list;
		}

		public static ArrayList<Assign> getActiveStatus() {
			ArrayList<Assign> list = new ArrayList<Assign>();
			for (Assign assign : AssignList) {
				if (assign.status.equalsIgnoreCase(MessageConstants.ACTIVE)) {
					list.add(assign);
					System.out.println(list);
				}
			}
			return list;
		}
		
		public static void convertToCurrentStatus(String oldStatus, String newStatus){
			for (Assign assign : AssignList) {
				if (assign.status.equalsIgnoreCase(oldStatus)) {
					assign.status = newStatus;
					
				}
			}
		}
		
		public static boolean currentStatusUpdateCheck(String newStatus) {
			boolean isUpdate = false;
			for(Assign assign : AssignList) {
				if(newStatus.equals(assign.status)) {
				 isUpdate = true;
			}
		}
			return isUpdate;
		}
		
		
		
	/*private boolean containsString(String testString, ArrayList<String> list) 
	{
     return list.contains(testString);
	}*/
}
		

