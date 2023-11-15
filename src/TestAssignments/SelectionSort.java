package TestAssignments;

import java.util.Arrays;

// "Declare the array recorded with 10 values (3,5,2,7,9,10,15,7,0,4). Sort the array by using Selection algorithms."

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] nums = {3, 5, 2, 7, 9, 10, 15, 7, 0, 4};
		
//		for(int i = 0; i < nums.length - 1; i++) {
//			if(nums[i] > nums[i+1]) {
//				int temp = nums[i];
//				nums[i] = nums[i+1];
//				nums[i+1] = temp;
//			}
//		}
		
		for(int i = 0; i <= nums.length - 1; i++) {
			System.out.print(i + " ");
		}		
		
//		System.out.println(Arrays.toString(nums));
		
	}

}
