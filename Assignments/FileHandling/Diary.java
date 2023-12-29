package FileHandling;

import java.awt.Desktop;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Diary {

	public static String folderName = "Diary";
	public static String fileName = "diary";
	public static String fileType = ".txt";

	public static void main(String[] args) {

		Path path = Paths.get("D://" + folderName);
		if (!(Files.isDirectory(path))) {
			try {
				Files.createDirectory(path);
				System.out.println("Done");
				checkFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			checkFile();
		}

	}

	public static void checkFile() {
		String name = fileName;
		Path path = Paths.get("D://" + folderName + "/" + name + fileType);
		try {
			Files.createFile(path);
			addTexts();
		} catch (FileAlreadyExistsException e) {
			try {
				Desktop.getDesktop().open(path.toFile());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		System.out.println(name);
	}

	public static void addTexts() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write notes...");
		
		
	}
	
}
