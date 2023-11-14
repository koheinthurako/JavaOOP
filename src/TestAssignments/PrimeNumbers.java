package TestAssignments;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Let's check prime numbers! Program start...");
		
		Scanner sc = new Scanner(System.in);
		boolean checker = true;
		
		while(checker) {
			if(sc.hasNextInt()) {
				int userInput = sc.nextInt();
				boolean result = false;
				
				for(int i = 3; i < 11; i++) {
					
					if(userInput==i) {
						continue;
					} else if(userInput%i==0) {
						System.out.println(userInput + " is not prime number!");
						checker = false;
						return;
					} else {
						result = true;
					}
				}
				
				if(result) System.out.println("Yes! " + userInput + " is prime number!");
				
			} else {
				System.out.println("Invalid Value!");
				break;
			}
		}
	}

}
