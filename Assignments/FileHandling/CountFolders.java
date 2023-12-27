package FileHandling;

import java.io.File;
import java.util.Scanner;

public class CountFolders {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int countFolder = 0;
		int countFile = 0;

		System.out.print("Please enter your path : ");
		String inputPath = sc.nextLine();
		File dir = new File(inputPath);
		if (dir.isDirectory()) {
			File[] folders = dir.listFiles();
			if(folders.length==0 | folders == null) System.out.println("There is nothing!");
			else {
				for (File folder : folders) {
					if (folder.exists() | folder.isDirectory()) {
						if (folder.isDirectory()) {
							countFolder++;
						} else {
							countFile++;
						}
					} else {
						System.out.println("There is empty...");
					}
				}
			}
		} else {
			System.err.println("Invalid Directory! Please try again...");
		}

		if (countFolder != 0 | countFile != 0) {
			System.out.println("Total folder = " + countFolder);
			System.out.println("Total file = " + countFile);
		}

		sc.close();

	}

}
