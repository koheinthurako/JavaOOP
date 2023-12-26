package FileHandling;

import java.awt.Desktop;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.naming.directory.InvalidSearchFilterException;

public class FileHandlingTest {

	public static void main(String[] args) {

//		File Handling အကြောင်းစမယ်

//		FileSystem fs = FileSystems.getDefault();
//		for(FileStore store : fs.getFileStores()) {
//			System.out.println("store.toString() : " + store.toString());
//			System.out.println("store.type() : " + store.type() + " (New Technology File System)");
//			System.out.println("TotalSpace : " + store.getTotalSpace());
//			System.out.println("UsableSpace : " + store.getUsableSpace());
//			System.out.println("UnallocatedSpace : " + store.getUnallocatedSpace());
//		}

//		1. Path - absolute path, relative path
//		absolute path က root directory ကနေစယူပြီး relative path က current path ကနေစယူ
//		try {
//			Path path = Paths.get("D:\\fileHandlingTest.txt");
////			createFile - file တစ်ခုဖန်တီးခြင်း
//			Files.createFile(path);
////			path.toFile() = path မှ file ကိုပြောင်းပြီး getDesktop() နဲ့လှမ်းဖွင့်
////			တစ်ခု create လုပ်ပြီးသားရှိပြီးသားကို ထပ်လုပ်ရင် FileAlreadyExistsException error တက်
//			Desktop.getDesktop().open(path.toFile());
////			IO Exception မရေးခင်မှာမှ catch ထဲမှာ fileAlready...exception ကို အရင်ဖမ်းပေးရမယ် မရေးရင် error ပြ
////			ဘာလို့ဆို IO စစ်ပြီးမှ file ကိုသွားစစ်လို့မရဘူး file ထပ်မထပ်စစ်ပြီးမှ IO အဆင်ပြေမပြေစစ်ပေးရတာမို့လို့
//		} catch (FileAlreadyExistsException e2) {
//			System.err.println("File already exists!");
////			IOException ဆိုတာ create ပေးလိုက်တဲ့/ အလုပ်လုပ်လိုက်တဲ့ path လမ်းကြောင်းတစ်ခုက input/output တွေအဆင်ပြေမပြေကိုပဲဖမ်းပေးတယ်
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
//		ရှိပြီးသား file တစ်ခုကိုနောက်တစ်ခါထပ် create ရင် auto rename လုပ်ပေးတဲ့ program တစ်ခုရေးမယ်
//		int no = 0;
//		String fileName = "aTest";
//		String fileType = ".txt";
//		while(true) {
//			Path path = Paths.get("D:\\" + fileName + fileType);
//			try {
////				Files.exits() က file မရှိဘူးဆိုရင် create လုပ်မယ် ရှိရင်တော့ ဖွင့်ရုံပဲဖွင့်မယ်စတဲ့ condition တွေစစ်လို့ရတယ်
//				if(!Files.exists(path))
//					Files.createFile(path);
//				Desktop.getDesktop().open(path.toFile());
////				break မပါရင် file အများကြီးထွက်လာပြီး စက်ဟမ်းသွားနိုင်တယ် 
//				break;
//			} catch (FileAlreadyExistsException e) {
//				no++;
//				fileName += " (" + no + ")";
//			} catch(IOException e2) {
//				e2.printStackTrace();
//			}
//		}
		
		
//		file တစ်ခုဖန်တီးပြီး အဲ့ထဲကို စာတစ်ခါတည်းထည့်ရိုက်မယ် program တစ်ခုရေးမယ်
		Path path = Paths.get("D:\\abcd.txt");
		String data = "";
		String line = "";
		for(int i = 0; i < 10; i++) {
			data = (char) (i + 'a') + "";
//			data.repeat() က string method တစ်ခု စာလုံးတစ်ခုကို ၅ ခါရိုက်ဆိုသည့်သဘောမျိုးဖြစ်တယ်
//			System.lineSeparator() က လိုင်းတစ်ကြောင်းဆင်းချင်ရင် သုံးပေးရတယ်
			line += data.repeat(5) + System.lineSeparator();
		}
		try {
//			file တွေကိုတစ်ခါတည်းဖန်တီးပြီး data တစ်ခါတည်းထည့်ခြင်း write() method ကိုသုံးတယ် သူ့ထဲက typeOption မှာ StandardOpenOption.CREATE
			Files.write(path, line.getBytes(), StandardOpenOption.CREATE);
			Desktop.getDesktop().open(path.toFile());
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
	}

}
