package ObjectTestAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class OTPCodeChecker {

	public static List<Object> mainList = new ArrayList<Object>();

	public static void main(String[] args) throws InterruptedException {
		
		programStart();
		System.out.println(sendOTPCode());
		Thread.sleep(5000);
		OTPDelete();
		requestUserOTP();
		
	}
	
	public static List<Object> generateOTPCode() {
		List<Object> dataAcceptList = new ArrayList<Object>(); 
		Random rCode = new Random();
		for(int i = 0; i < 6; i++) {
			if(i > 3) {
				dataAcceptList.add(rCode.nextInt(10));
			} else {
				dataAcceptList.add((char) (rCode.nextInt(26) + 'a'));
			}
		}
		return dataAcceptList;
	}
	
	public static void programStart() {
		for(int i = 0; i < 10; i++) {
			mainList.add(generateOTPCode());
		}
	}
	
	public static String sendOTPCode() {
		System.out.print("Here is your OTP Code : ");
		List<Object> shuffledList = new ArrayList<>(mainList);
        Collections.shuffle(shuffledList);
        @SuppressWarnings("unchecked")
        // shuffledList.get() က object return ပြန်တာကို List<Object> အနေနဲ့ type casting ပြန်လုပ်
		List<Object> result = (List<Object>) shuffledList.get(0);
        StringBuilder otpStringBuilder = new StringBuilder();
        for(Object otp : result) {
        	otpStringBuilder.append(otp);
        }
        return otpStringBuilder.toString();
	}
	
	public static void OTPDelete() {
		for(int i = 0; i < 30; i++) {
			System.out.println("");
		}
	}
	
	public static void confirmation() {
		System.out.println("True");
	}
	
	public static void requestUserOTP() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your OTP Code : ");
		try {
			while(!mainList.isEmpty()) {
				for(Object checkOTP : mainList) {
					if(sc.nextLine().equals(checkOTP)) {
						confirmation();
						break;
					}
				}
			}
		} catch (Exception e) {
			
		}
	}
	
}
