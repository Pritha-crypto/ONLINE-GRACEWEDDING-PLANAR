package com.wedapp.service;

import java.util.ArrayList;

import com.wedapp.model.Payment;
import com.wedapp.util.OTPUtil;
import com.wedapp.validator.PaymentValidator;

public class PaymentManager {

	public static String generateOTP(Payment user) {
		String otp = null;
		ArrayList<String> errorsLists = PaymentValidator.errorsList(user);
		
		if (!errorsLists.isEmpty()) {
			throw new IllegalArgumentException("Invalid card details");
		} else {
			otp = OTPUtil.generateOTP();		

		}
		return otp;
	}

	

}
