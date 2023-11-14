package TestAssignments;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Let's check prime numbers! Program start...");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			if(sc.hasNextInt()) {
				int userInput = sc.nextInt();
				
				for(int i = 3; i < 11; i++) {
					if(userInput%i==0) {
						System.out.println(i + " is not prime number!");
						System.out.println("Even");
					} else {
//						System.out.println("Succeeded!");
//						System.out.println("Odd");
//						System.out.println("--- Program Ended ---");
						
					}
				}
			} else {
				System.out.println("Invalid Value!");
				break;
			}
		}
	}

}
