package FileHandling;

import java.awt.Desktop;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FileHandlingWithLocalDateTime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please type file name : ");
		String fileName = sc.nextLine();
		String fileType = ".txt";
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH-mm-ss-ms");
        String formattedDate = date.format(dateFormatter);
        String formattedTime = time.format(timeFormatter);
		
		Path path = Paths.get("D://" + fileName + "-" + formattedDate + "-" + formattedTime + fileType);

		try {
            Files.createFile(path);
            Desktop.getDesktop().open(path.toFile());
        } catch (FileAlreadyExistsException e) {
            System.err.println("File already exists!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
		
		sc.close();

	}

}
