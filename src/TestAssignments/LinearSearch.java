package TestAssignments;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] nums = {3, 5, 2, 7, 9, 10, 15, 7, 0, 4};
		
		System.out.println("Let's find the numbers from an array!");
		
		ArrayList<Integer> dataList = new ArrayList<>();
		
		boolean checker = true;
		
		while(checker) {
			System.out.println("Please type a number...");
			if(sc.hasNextInt()) {
				int input = sc.nextInt();	
				for(int i = 0; i < nums.length; i++) {
					if(input == nums[i]) {
						System.out.println(input + " is founded at array index : " + i);
						dataList.add(nums[i]);
					}
				}
				if(dataList.isEmpty()) {
					System.out.println(-1);
					System.out.println("Do you want to search the program? Y/N : ");
					sc.nextLine();
					String yesOrNo = sc.nextLine().toLowerCase();
					if(yesOrNo.equals("y")) checker = true;
					else {
						checker = false;
						System.out.println("Have a nice day!");
						System.out.println("--- Program End ---");
					};
				};
			} else {
				System.out.println("Invalid Value! Please type numbers only...");
				System.out.println("Do you want to restart the program? Y/N : ");
				sc.nextLine();
				String yesOrNo = sc.nextLine().toLowerCase();
				if(yesOrNo.equals("y")) checker = true;
				else {
					checker = false;
					System.out.println("Have a nice day!");
					System.out.println("--- Program End ---");
				};
			}
		}
		
		
		
		
		
//		if(sc.hasNextInt()) {
//			while(checker) {
//				int input = sc.nextInt();	
//				for(int i = 0; i < nums.length; i++) {
//					if(input == nums[i]) {
//						System.out.println(input + " is founded at array index : " + i);
//						dataList.add(nums[i]);
//					}
//				}
//				if(dataList.isEmpty()) System.out.println(-1);
//			}
//		} else {
//			System.out.println("Invalid Value! Please type numbers only...");
//			System.out.println("Do you want to restart the program? Y/N : ");
//			sc.nextLine();
//			String yesOrNo = sc.nextLine().toLowerCase();
//			if(yesOrNo.equals("y")) checker = true;
//			else {
//				checker = false;
//				System.out.println("Have a nice day!");
//				System.out.println("--- Program End ---");
//			};
//		}
		sc.close();
	}
}
