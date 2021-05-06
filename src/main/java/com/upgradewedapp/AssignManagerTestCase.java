package com.WedApp;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.wedapp.Assign;
import com.wedapp.AssignManager;
import com.wedapp.MessageConstants;

public class AssignManagerTestCase {
	//get the number of assigned plans 
	@Test
	public void testListAllAssignedPlans() {
		
		ArrayList<Assign> allAssignedPlans =AssignManager.getAllAssignees();
		//returns the obj of that list
		assertEquals(2, allAssignedPlans.size());
	}
	
	//get the number of  Active, Opened, Completed, Canceled.
	//@Test
	public void testListOpenedStatus() {
		
		ArrayList<Assign> allAssignedPlans = AssignManager.getOpenedStatus();
		assertEquals(1, allAssignedPlans.size());
		Assign assign = allAssignedPlans.get(0);
		assertEquals(MessageConstants.OPENED, assign.status);
	}
	@Test
	public void testListActiveStatus() {
		
		ArrayList<Assign> allAssignedPlans = AssignManager.getActiveStatus();
		assertEquals(1, allAssignedPlans.size());
		Assign assign = allAssignedPlans.get(0);
		assertEquals(MessageConstants.ACTIVE, assign.status);
	}
	@Test
	public void checkUpdateNewStatus() {
		AssignManager.convertToCurrentStatus("ACTIVE","COMPLETED");
		boolean isUpdate = AssignManager.currentStatusUpdateCheck("COMPLETED");
		assertTrue(isUpdate);
	}
	

}
