package TestAssignments;

import java.util.Arrays;

// "Declare the array recorded with 10 values (3,5,2,7,9,10,15,7,0,4). Sort the array by using Selection algorithms."

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] nums = {3, 5, 2, 7, 9, 10, 15, 7, 0, 4};
		int minValue = 0;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = minValue; j < nums.length - 1; j++) {
				if(nums[minValue] > nums[j+1]) {
					int buffer = nums[minValue];
					nums[minValue] = nums[j+1];
					nums[j+1] = buffer;
				}
			}
			minValue++;
		}
			System.out.println(Arrays.toString(nums));
	}
}
