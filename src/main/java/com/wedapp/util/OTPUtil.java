package com.wedapp.util;

public class OTPUtil {

	public static String generateOTP() {
		int randomPin = (int) (Math.random() * 9000) + 1000;
		String otp = String.valueOf(randomPin);
		System.out.println("Your otp for your transaction is " + otp);
		return otp;
	}
}
