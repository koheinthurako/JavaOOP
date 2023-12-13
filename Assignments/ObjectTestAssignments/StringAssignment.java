package ObjectTestAssignments;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringAssignment {

	public static void main(String[] args) {
		
	/*
		"Create a string and store the following data, “east, west, north, south”. 
		Then show the output with the following view.
		EasT
		wEsT
		norTh
		souTh"
	*/

		String direction = "east, west, north, south";
		String[] directionTexts = direction.split(", ");
		for (String text : directionTexts) {
			System.out.println(text.replace("e", "E").replace("t", "T"));
		}
		
		
	/*
		"Accept a string via Scanner. Then count how many words are there in that string.
		Create at least two difference ways to get that result."
	*/
		
		Scanner sc = new Scanner(System.in);
		
//		Method 1.
		System.out.print("Please enter a string : ");
		int words = 0;
		for(String input : sc.nextLine().trim().split(" ")) {
			if(!(input.isEmpty())) words++;
		}
		System.out.println("Total number of words : " + words + "\n");
		
		
//		Method 2.
		System.out.print("Please enter a string : ");
		StringTokenizer wordToken = new StringTokenizer(sc.nextLine());
        System.out.println("Total number of words : " + wordToken.countTokens() + "\n");
        
        
//    	Method 3.
        System.out.print("Please enter a string : ");
        String input3 = sc.nextLine().trim();
        int words2 = 0;
        if (!input3.isEmpty()) {
        	boolean spaceChecker = false;
            for (int i = 0; i < input3.length(); i++) {
            	if(input3.charAt(i)==' ') {
            		if(!spaceChecker) {
            			spaceChecker = true;
            			words2++;
            		}
            	} else {
            		spaceChecker = false;
            	}
            }
            words2++;
        }
        
        System.out.println("Total number of words : " + words2);
        
		sc.close();

	}

}
