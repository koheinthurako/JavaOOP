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
		try {
			Path path = Paths.get("D:\\fileHandlingTest.txt");
//			createFile - file တစ်ခုဖန်တီးခြင်း
			Files.createFile(path);
//			path.toFile() = path မှ file ကိုပြောင်းပြီး getDesktop() နဲ့လှမ်းဖွင့်
//			တစ်ခု create လုပ်ပြီးသားရှိပြီးသားကို ထပ်လုပ်ရင် FileAlreadyExistsException error တက်
			Desktop.getDesktop().open(path.toFile());
//			IO Exception မရေးခင်မှာမှ catch ထဲမှာ fileAlready...exception ကို အရင်ဖမ်းပေးရမယ် မရေးရင် error ပြ
//			ဘာလို့ဆို IO စစ်ပြီးမှ file ကိုသွားစစ်လို့မရဘူး file ထပ်မထပ်စစ်ပြီးမှ IO အဆင်ပြေမပြေစစ်ပေးရတာမို့လို့
		} catch (FileAlreadyExistsException e2) {
			System.err.println("File already exists!");
//			IOException ဆိုတာ create ပေးလိုက်တဲ့/ အလုပ်လုပ်လိုက်တဲ့ path လမ်းကြောင်းတစ်ခုက input/output တွေအဆင်ပြေမပြေကိုပဲဖမ်းပေးတယ်
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
