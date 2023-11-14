package TestAssignments;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Let's check prime numbers! Program start...");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			if(sc.hasNextInt()) {
				System.out.println("True");
			} else {
				System.out.println("Invalid Value!");
				break;
			}
		}
	}

}
