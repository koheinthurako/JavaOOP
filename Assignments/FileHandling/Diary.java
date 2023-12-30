package FileHandling;

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
	public static String date;
	public static int num = 1;

	public static void main(String[] args) {

		Path path = Paths.get("D://" + folderName);
		if (!(Files.isDirectory(path))) {
			try {
				Files.createDirectory(path);
				checkFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			checkFile();
		}

	}

	public static void checkFile() {
		Path path = Paths.get("D://" + folderName + "/" + fileName + fileType);
		LocalDate now = LocalDate.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy (E)");
		String formattedDate = now.format(dateFormatter);
		try {
			Files.createFile(path);
			Files.writeString(path, formattedDate + System.lineSeparator(), Charset.forName("UTF-8"),
					StandardOpenOption.CREATE);
			addTexts(path);
		} catch (FileAlreadyExistsException e) {
			addMoreTexts(path);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

	public static void addTexts(Path path) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program Start! Write notes...");
		try {
			while (true) {
				String input = sc.nextLine();
				Files.writeString(path, num + ". " + input + System.lineSeparator(),
						Charset.forName("UTF-8"),StandardOpenOption.APPEND);
				++num;
			}
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		sc.close();
	}
	
	public static void addMoreTexts(Path path) {
		LocalDate now = LocalDate.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy (E)");
		String formattedDate = now.format(dateFormatter);
		try {
			Files.writeString(path, System.lineSeparator() + formattedDate + System.lineSeparator(),
					Charset.forName("UTF-8"), StandardOpenOption.APPEND);
			addTexts(path);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

}
