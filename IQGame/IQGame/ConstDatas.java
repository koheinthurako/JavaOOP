package IQGame;

import java.util.Random;
import java.util.Scanner;

public interface ConstDatas {

	Scanner sc = new Scanner(System.in);
	char[] ANSWERS = { 'a', 'b', 'c', 'd' };
	String SPACING = "   ";
	Random RANDOM = new Random();
	int INITIAL_NUMBER_RANGE = 5;
	int SKIP_COUNT = 10;

	// For choice
	int ANS_RANGE = 20;

}
