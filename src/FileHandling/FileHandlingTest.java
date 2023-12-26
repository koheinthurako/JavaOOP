package FileHandling;

import java.awt.Desktop;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

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
//		String data = "";
//		String line = "";
//		for(int i = 0; i < 20; i++) {
//			data = (char) (i + 'a') + "  ";
////			data.repeat() က string method တစ်ခု စာလုံးတစ်ခုကို ၅ ခါရိုက်ဆိုသည့်သဘောမျိုးဖြစ်တယ်
////			System.lineSeparator() က လိုင်းတစ်ကြောင်းဆင်းချင်ရင် သုံးပေးရတယ်
//			line += data.repeat(5) + System.lineSeparator();
//		}
//		try {
////			file တွေကိုတစ်ခါတည်းဖန်တီးပြီး data တစ်ခါတည်းထည့်ခြင်း write() method ကိုသုံးတယ်
////			path, bytes, openOption ထည့်ပေးရတယ် ထည့်လိုက်တဲ့ path ထဲကို အရင်သွားပြီး နောက်က bytes နေရာက data ကိုထည့်တယ်
////			သူ့ထဲက openOption မှာ StandardOpenOption.CREATE ကိုသုံးရင် Files.createFile() လို ရှိပြီးသားဖြစ်နေရင်
////			error မတက်တော့ပဲ open ပဲလုပ်သွားတယ် data တွေကိုပြင်လိုက်ရင်လည်း auto update ပြန်ပြင်ပေးတယ်
////			ဒါက String ကို getBytes() ဆိုပြီး byte ပြန်ပြောင်းပေးရတဲ့ Java 1.8 ပုံစံဖြစ်တယ်
////			Files.write(path, line.getBytes(), StandardOpenOption.CREATE);
//			
////			နောက်တစ်နည်းကတော့ Java 11 မှာထပ်ထည့်လိုက်တဲ့ Files.writeString() ဆိုတဲ့ method
////			သူ့ထဲမှာ path, charSequence, charSet, openOption ဆိုပြီး ဘယ် path မှာ ဘယ် data ကို ဘယ်လို format နဲ့ရိုက်မလဲဆိုတဲ့ပုံစံဖြစ်တယ်
////			String ကိုတိုက်ရိုက်ရိုင်နိုင်ပြီးတော့ charSet နေရာမှာက forName() နဲ့ UTF character code length format တွေကိုလည်းကြေညာလို့ရတယ်
//			Files.writeString(path, line, Charset.forName("UTF-8"), StandardOpenOption.CREATE);
//			Desktop.getDesktop().open(path.toFile());
//		} catch (IOException e) { 
//			e.printStackTrace();
//		}
		
		
//		ဖန်တီးထားတဲ့ files ထဲက data တွေကို console မှာထုတ်ပြီးဖတ်ချင်တယ်ဆိုရင်
//		Files.readAllLines() ဆိုတဲ့ method ကိုသုံးတယ် return ပြန်လာတာက String DataType List collection တစ်ခု ပြန်လာမယ်
//		try {
////			ပြန်လာတဲ့ return ကို String Collection ထဲထည့်လိုက်ပြီးတော့ forEach နဲ့ ထုတ်ပြမယ်
//			List<String> texts = Files.readAllLines(path);
//			texts.stream().forEach(System.out::println);
//		} catch (NoSuchFileException e) {
//			System.err.println("There is no file!");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		
//		File copy ဆို openOption ENUM ထဲမှာ သုံးမျိုးပဲရှိတယ် REPLACE_EXISTING, COPY_ATTRIBUTES, ATOMIC_MOVE
//		REPLACE_EXISTING ကတော့ target ထဲမှာ file ရှိပြီးသားဆို အဟောင်းကိုဖျက်ပြီး အသစ်ကို update ပြန်လုပ်တယ်
//		COPY_ATTRIBUTES ဆိုရင်တော့ file ရှိပြီးသားဖြစ်နေရင် ရှိပြီးသားဆိုတဲ့ message မျိုးကိုပြချင်ရင်သုံးနိုင်တယ်
//		ATOMIC_MOVE ကတော့အရမ်းများတဲ့ data တွေကို အလုပ်လုပ်နေတုန်း စက်တစ်ခုခုဟမ်းသွားရင် undo လုပ်ပြီးမူရင်းအတိုင်း auto ပြန်ထားချင်ရင် သုံးတယ်
//		abcd.txt ထဲက data တွေကို နောက် text file တစ်ခု auto ပွားပြီး abcd.txt ထဲက data တွေထပ်ထည့်ချင်တယ်ဆိုရင်
		Path source = Paths.get("D:\\abcd.txt");
		Path target = Paths.get("D:\\ef.txt");
		Path target2 = Paths.get("D:\\gh.txt");
		try {
//			copy မယ်ဆိုရင် copy(source, target, openOption)
//			Files.copy(source, target, StandardCopyOption.COPY_ATTRIBUTES);
			
			
//			move မယ်ဆိုရင် move(source, target, openOption(ATOMIC_MOVE)) ကိုသုံးလိုက်တာနဲ့
//			target နေရာက file အသစ်တစ်ခုကိုအရင်ဖန်တီးလိုက်ပြီး အဲ့ထဲကို source နေရာက data တွေကို copy မဟုတ်ပဲ တစ်ခါတည်း move လိုက်လို့
//			source နေရာက file က ပျက်သွားပြီး source ထဲက data တွေက target နေရာက file အသစ်ထဲကိုပဲရောက်သွားမယ်
			Files.move(target2, target, StandardCopyOption.ATOMIC_MOVE);
			System.out.println("moved");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
