package OOPProject;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public interface Constant {
	
	Set<Character> CHOICE_NO = new HashSet<Character>();
	Random random = new Random();
	int Initial_Number_Range = 5;
	int SKIP_COUNT = 10;
	int LOOP_COUNT = 4;
	String SPACING = "   ";
	String BLANK = "(-------)";
	
	// For alphabet
	int CONVERT_CHAR = 65;
	
	// For choice
	int ANS_RANGE = 20;
	
}
	
