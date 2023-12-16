package ObjectTestAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class OTPCodeChecker {

	public static List<List<Object>> mainList = new ArrayList<List<Object>>();
	public static int userOTPCount = 1;

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Please log in your account with OTP code...");
		programStart();

	}

	public static void continueOrNot() throws InterruptedException {
		System.out.print("Wrong! Do you want to get another OTP code? Y/N : ");
		Scanner sc = new Scanner(System.in);
		if (sc.nextLine().toLowerCase().equals("y")) {
			System.out.println("---------------------------------------------------");
			if (userOTPCount > 3) {
				System.out.println("Sorry! There are more than 3 times. Try next day.");
			} else {
				programStart();
			}
		} else {
			System.out.println("Program Ended! Enjoy your day!");
		}
		sc.close();
	}

	public static void checkOTP(String inputOTP) throws InterruptedException {
		for (List<Object> otpList : mainList) {
			StringBuilder otpToString = new StringBuilder();
			for (Object otp : otpList) {
				otpToString.append(otp);
			}
			String result = otpToString.toString();
			if (inputOTP.equals(result)) {
				System.out.println("Correct! You haved logged in to your account");
				return;
			}
		}
		continueOrNot();
	}

	public static void requestUserOTP() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your OTP Code : ");
		String inputOTP = sc.nextLine();
		checkOTP(inputOTP);
		sc.close();
	}

	public static void OTPDelete() {
		for (int i = 0; i < 30; i++) {
			System.out.println("");
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
		for (Object otp : result) {
			otpStringBuilder.append(otp);
		}
		return otpStringBuilder.toString();
	}

	public static List<Object> generateOTPCode() {
		List<Object> dataAcceptList = new ArrayList<Object>();
		Random rCode = new Random();
		for (int i = 0; i < 6; i++) {
			if (i > 3) {
				dataAcceptList.add(rCode.nextInt(10));
			} else {
				dataAcceptList.add((char) (rCode.nextInt(26) + 'a'));
			}
		}
		return dataAcceptList;
	}

	public static void programStart() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			mainList.add(generateOTPCode());
		}
		System.out.println(sendOTPCode());
		userOTPCount++;
		Thread.sleep(5000);
		OTPDelete();
		requestUserOTP();
	}

}
