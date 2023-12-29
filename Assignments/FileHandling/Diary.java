package FileHandling;

import java.awt.Desktop;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
//		D://Diary/diary.txt
		Path path = Paths.get("D://" + folderName + "/" + fileName + fileType);
		try {
			Files.createFile(path);
		} catch (FileAlreadyExistsException e) {
			addTexts(path);
			try {
				Desktop.getDesktop().open(path.toFile());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

	public static void addTexts(Path path) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program Start! Write notes...");
		LocalDate date = LocalDate.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy (E)");
		String formattedDate = date.format(dateFormatter);
		try {
			int no = 1;
			Files.writeString(path, formattedDate + System.lineSeparator(), Charset.forName("UTF-8"), StandardOpenOption.CREATE);
			while(true) {
				String input = sc.nextLine();
				Files.writeString(path, no + ". " + input + System.lineSeparator(), Charset.forName("UTF-8"), StandardOpenOption.APPEND);
				++no;
//				System.out.println("Wanna stop writting? Y/N : ");
//				if(sc.nextLine().toLowerCase().equals("y")) {
//					System.out.println("Program Ended!");
//					break;
//				};
			}
			
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		sc.close();
	}
	
}
