package TestAssignments;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Let's check prime numbers! Program start...");
		
		Scanner sc = new Scanner(System.in);
		boolean checker = true;
		
		while(checker) {
			
			System.out.println("Please Enter a number...");
			
			if(sc.hasNextInt()) {
				int userInput = sc.nextInt();
				boolean result = false;
				
				for(int i = 2; i < 11; i++) {
					
					if(userInput==i) {
						continue;
					} else if(userInput==1) {
						System.out.println("You can't type " + userInput + " please type other numbers");
						break;
					} else if(userInput%i==0) {
						System.out.println(userInput + " is not prime number!");
						result = false;
						break;
					} else {
						result = true;
					}
				}
				
				if(result) System.out.println("Yes! " + userInput + " is prime number!");
				
				System.out.println("Want to check another Y/N : ");
				sc.nextLine();
				String userInput2 = sc.nextLine().toLowerCase();
				if(userInput2.equals("y")) {
					checker = true;
				} else {
					System.out.println("--- Program Ended! ---");
					checker = false;
				}
				
			} else {
				System.out.println("Invalid Value! Please enter only numbers");
				System.out.println("Please type numbers : ");
				sc.nextLine();
				String userInput2 = sc.nextLine().toLowerCase();
				if(userInput2.equals("y")) {
					checker = true;
				} else {
					System.out.println("--- Program Ended! ---");
					checker = false;
				}
				
//				break;
			}
			
		}
		
		sc.close();
		
	}

}
