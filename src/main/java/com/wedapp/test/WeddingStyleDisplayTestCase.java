package com.wedapp.test;
import com.wedapp.service.*;


import org.junit.Test;



public class WeddingStyleDisplayTestCase {

	/**
	 * It will show all the lists of Wedding Types stored in hashMap
	 */
	@Test
	public void weddingStylesListDisplay() {
		com.wedapp.service.WeddingStyleDisplay.wedTypeChooser();
	}
	
	/**
	 * It will show all the lists of Location Types stored in hashMap
	 */
	@Test
	public void weddingStyleLocationsListDisplay() {
		com.wedapp.service.WeddingStyleDisplay.locationChooser();
	}
	
	
	

}
