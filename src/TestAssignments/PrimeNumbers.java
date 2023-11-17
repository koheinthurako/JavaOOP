package TestAssignments;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Let's check prime numbers! Program start...");
		
		Scanner sc = new Scanner(System.in);
		
		boolean checker = true;
		
		// outer loop
		while(checker) {
			
			System.out.println("Please Enter a number...");
			
			// Check userInput is integer or not
			if(sc.hasNextInt()) {
				int userInput = sc.nextInt();
				boolean result = true;
				
				// inner loop
//				for(int i = 2; i < 11; i++) {
//					// check prime number or not
//					if(userInput==i) {
//						continue;
//					} else if(userInput%i==0 | userInput==1) {
//						System.out.println(userInput + " is not prime number!");
//						result = false;
//						break;
//					} else {
//						result = true;
//					}
//				}
				
			
				// check prime number or not
				if(userInput < 2) {
					result = false;
				} else {
					for(int i = 2; i <= Math.sqrt(userInput); i++) {
						if(userInput % i == 0) {
							result = false;
							break;
						}
					}
				}
				
				if(result) {
					System.out.println("Yes! " + userInput + " is prime number!");
				} else {
					System.out.println(userInput + " is not prime number");
				}
				
				// Ask user to continue or not within the outer loop
				System.out.println("Want to check another Y/N : ");
				sc.nextLine();
				String userInput2 = sc.nextLine().toLowerCase();
				if(userInput2.equals("y")) {
					checker = true;
				} else {
					System.out.println("Thanks for using my program");
					System.out.println("--- Program Ended! ---");
					checker = false;
				}
				
			// If userInput is not integer, print invalid value and ask user to continue or not
			} else {
				System.out.println("Invalid Value! Please type only numbers");
				System.out.println("Want to restart the program? Y/N : ");
				sc.nextLine();
				String userInput2 = sc.nextLine().toLowerCase();
				if(userInput2.equals("y")) {
					checker = true;
				} else {
					System.out.println("Thanks for using my program");
					System.out.println("--- Program Ended! ---");
					checker = false;
				}
			}
			
		}
		
		sc.close();
		
	}

}
