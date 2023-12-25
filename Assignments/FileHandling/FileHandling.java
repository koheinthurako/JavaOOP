package FileHandling;

import java.awt.Desktop;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please type file name : ");
		String fileName = sc.nextLine();
		String fileType = ".txt";
		
		try {
			Path path = Paths.get("D://" + fileName + fileType);
			Files.createFile(path);
			Desktop.getDesktop().open(path.toFile());
		} catch (FileAlreadyExistsException e2) {
			System.err.println("File already exists!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		sc.close();
		
	}

}
