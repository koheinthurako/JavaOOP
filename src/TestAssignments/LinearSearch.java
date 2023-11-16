package TestAssignments;
import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		System.out.println("Let's find the numbers from an array!");
		
		Scanner sc = new Scanner(System.in);
		
		int [] nums = {3, 5, 2, 7, 9, 10, 15, 7, 0, 4};
		
		boolean mainController = true;
		
		//Start outer loop
		while(mainController) {
			System.out.println("Please type a number...");
			
			// Check integer or not
			if(sc.hasNextInt()) {
				int input = sc.nextInt();	
				boolean checker = false;
				
				// Start inner loop
				for(int i = 0; i < nums.length; i++) {
					if(input == nums[i]) {
						System.out.println(input + " is founded at array index : " + i);
						checker = true;
					}
				}
				
				// Ask user to continue or not
				System.out.println("Do you want to search the program? Y/N : ");
				sc.nextLine();
				String yesOrNo = sc.nextLine().toLowerCase();
				if(yesOrNo.equals("y")) mainController = true;
				else {
					mainController = false;
					System.out.println("Have a nice day!");
					System.out.println("--- Program End ---");
				};
				
				// Print -1 and ask user to continue or not
				if(!checker) {
					System.out.println("-1");
					System.out.println("Do you want to search the program? Y/N : ");
					sc.nextLine();
					yesOrNo = sc.nextLine().toLowerCase();
					if(yesOrNo.equals("y")) mainController = true;
					else {
						mainController = false;
						System.out.println("Have a nice day!");
						System.out.println("--- Program End ---");
					};
				}
				
			// If userInput is not integer, print invalid value and ask user to continue or not
			} else {
				System.out.println("Invalid Value! Please type numbers only...");
				System.out.println("Do you want to restart the program? Y/N : ");
				sc.nextLine();
				String yesOrNo = sc.nextLine().toLowerCase();
				if(yesOrNo.equals("y")) mainController = true;
				else {
					mainController = false;
					System.out.println("Have a nice day!");
					System.out.println("--- Program End ---");
				};
			}
		}
		sc.close();
	}
}
