package API;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TimeObjectTest {

	public static void main(String[] args) {

//		Java.util.Time အကြောင်းစမယ်
//		1. LocalDate
//		2. Period
//		3.	LocalTime
//		4. Duration 
//		5. DateTimeFormatter
		
//		1. LocalDate အကြောင်းစမယ်
//		LocalDate ကိုသတ်မှတ်ခြင်းသုံးမျိုး of, now, parse
		System.out.println("--- Local Date ---");
		
//		LocalDate.of() သည် ကိုယ်ကြိုက်တဲ့ ရက်စွဲကိုပေးလို့ရတယ်
		LocalDate date = LocalDate.of(2023, 10, 15);
		System.out.println("LocalDate.of() : " + date);
		
//		LocalDate.now() ကတော့ လက်ရှိ date ကိုထုတ်ပေးတယ်
		LocalDate date2 = LocalDate.now();
		System.out.println("LocalDate.now() : " + date2);
		
//		LocalDate.parse() method ထဲတွင် character sequence ကိုထည့်ပေးရတယ် ထည့်တဲ့အခါလည်း
//		LocalDate ရဲ့ syntax (0000-00-00) အတိုင်းပဲလက်ခံတယ် ကြားမှာ "-" မှရမယ်
//		အပေါ်က of မှာတော့ integer တွေထည့်ပေးရတာမို့ syntax ကို localDate က သူ့ဘာသာပြင်ပေးသွားတယ်
		LocalDate date3 = LocalDate.parse("2021-03-12");
		System.out.println("LocalDate.parse() : " + date3);
//		သို့သော် ကိုယ်လိုချင်တဲ့ format အတိုင်းပြောင်းချင်ရင် DateTimeFormatter ကိုသုံးလို့ရတယ် နောက်မှအဲ့တာကိုထပ်ရှင်းမယ်
		
//		getDayOfMonth() သည် integer ကို return ပြန်တယ်
		System.out.println("getDayOfMonth() : " + date2.getDayOfMonth());
		
//		DayOfWeek()
//		ဒီမှာ DayOfWeek သည် java မှရေးထားပြီးသော ENUM class ဖြစ်တယ် အဲ့တာကြောင့် ထည့်လိုက်တဲ့ တန်ဖိုးတစ်ခုကို သူ့ထဲမှာရေးထားပြီးသား
//		MONDAY, TUEDAY... စတဲ့ constant တွေနဲ့တိုက်စစ်ပြီး မှန်တဲ့ constant ကို return ပြန်ပေးတယ်
		DayOfWeek day = date.getDayOfWeek();
		System.out.println("getDayOfWeek() : " + day);
		
//		getDayOfYear() က တစ်နှစ် 365 ရက်ပြည့်ဖို့ လက်ရှိရောက်နေတဲ့ ရက်အရေအတွက်ကို integer return ပြန်ပေးတယ်
		System.out.println("getDayOfYear() : " + date.getDayOfYear());
		
//		getMonth()
//		ဒီနေရာမှာလည်း getMonth() method သည် month ဆိုတဲ့ constant object ကို return ပြန်ပေးတယ်
//		တကယ်တော့ getMonth() method က LocalDate class ထဲမှာ Month ဆိုတဲ့ ENUM Class ထဲက
//		constant တွေကို return ပြန်ပေးတဲ့ method ဖြစ်တယ် Month class ထဲမှာတော့ janToDec constant လတွေ ပါတယ်
		System.out.println("getMonth() : " + date.getMonth());
		
//		getMonthValue() ကတော့ လတစ်လရဲ့ integer တန်ဖိုး(1-12) ကို return ပြန်ပေးတယ်
		System.out.println("getMonthValue() : " + date.getMonthValue());
		
//		getYear() ကတော့ year ကို integer တန်ဖိုး return ပြန်ပေးတယ်
		System.out.println("getYear() : " + date.getYear());
		
//		isLeapYear() ကတော့ leapYear ဟုတ်မဟုတ်ကို boolean return ပြန်ပေးတယ်
		System.out.println("isLeapYear() : " + date.isLeapYear());
		
//		lengthOfMonth() ကတော့ လတစ်လရဲ့ ရက်အရေအတွက်ကို integer return ပြန်ပေးတယ်
		System.out.println("lengthOfMonth() : " + date.lengthOfMonth());
		
//		lengthOfYear() ကတော့ နှစ်တစ်နှစ်ရဲ့ 365 ရက်ကို return ပြန်ပေးတယ် leapYear ဆိုရင်တော့ 366 ပြန်ပေးမယ်
		System.out.println("lengthOfYear() : " + date.lengthOfYear() + "\n");
		
		
//		2. Period အကြောင်းစမယ်
//		Period ကတော့ localDate နှစ်ခုကြားခြားနားချက်ကိုသိချင်ရင် သုံးတယ်
		System.out.println("--- Period ---");
		
//		Period.between()
		LocalDate myBirthday = LocalDate.of(1999, 10, 15);
		Period age = Period.between(myBirthday, LocalDate.now());
		
//		Period ထဲမှာ ရှိတဲ့ method များ getYears(), getMonths(), getDays()
//		getYears() က localDate နှစ်ခုကြားက နှစ်ကွာခြားချက်ကို ထုတ်ပေးလို့ မိမိအသက်ကို integer အနေနဲ့ထုတ်ပေးတယ်
		System.out.println("Period.between(), getYear() : " + (age.getYears() + 1) + " " + myBirthday.getDayOfWeek());
		
//		getMonths() က လနှစ်လအကြား ကွာခြားချက်တန်ဖိုးကို ရက်အလိုက်တွက်ချက်ပြီးမှ integer အနေနဲ့ထုတ်ပေးတယ်
		System.out.println("Period.between(), getMonths() : " + age.getMonths());
		
//		getDays() ကတော့ localDate နှစ်ခုထဲက ရက်အချင်းချင်း ကွာခြားတဲ့ ကြားရက်ပမာဏကို integer အနေနဲ့ ထုတ်ပေးတယ်
//		ဥပမာ - 1 & 12 ဆို 11 ရက်/ 15 & 12 ဆို 31 ရက်ကိုအခြေခံယူပြီး 15 မှ နောက်လ 12 ပြည့်တဲ့အထိလိုအပ်တဲ့ ရက်ပမာဏ ကို return ပြန်ပေးတယ်
		System.out.println("Period.between(), getDays() : " + age.getDays() + "\n");

		
//		LocalTime အကြောင်းစမယ်
		System.out.println("--- Local Time ---");
		
//		LocalTime သတ်မှတ်ခြင်းသုံးမျိုးရှိတယ် of, now, parse
		
//		of(hour, minute, second, nanosecond) nanosecond = 10 power -9 (9လုံး)
		LocalTime time = LocalTime.of(10, 15, 12, 120102012);
		System.out.println("LocalTime.of() : " + time);
		LocalTime time2 = LocalTime.now();
		System.out.println("LocalTime.now() : " + time2);
//		parse လုပ်ရင် ထွက်လာတဲ့ now() ရဲ့ syntax အတိုင်းရေးပေးရမယ်
		LocalTime time3 = LocalTime.parse("12:20:12");
		System.out.println("LocalTime.parse() : " + time3 + "\n");
//		ကြားထဲမှာ LocalTime ရဲ့ method တွေစမ်းပါ
		
//		Duration အကြောင်းစမယ်
		System.out.println("--- Duration ---");
		
//		အချိန်နှစ်ခုရဲ့ကွာခြားချက်ကိုလိုချင်ရင် Duration ကိုသုံးမယ်
		java.time.Duration d = java.time.Duration.between(time, time2);
//		ဒီနေရာမှာ time နှစ်ခုနှိုင်းယှဉ်တော့ () ထဲက အရှေ့က တန်ဖိုးကကြီးနေရင် "-" နဲ့ output ပြန်လာတာကိုသတိထားပါ
		System.out.println("Duration : " + d);
		System.out.println("Duration.between() : " + d.toHours());
		
//		DateTimeFormatter အကြောင်းစမယ် input ထက် output ကို format ကျကျလေးထုတ်ချင်ရင်သုံးတယ်
		LocalDate dtfDate = LocalDate.now();
//		Pattern ထဲက d/MMMM/YYYY စတာလေးတွေကိုလေ့လာပါ
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/-MM/-yyyy" );
		System.out.println("DateTimeFormatter.ofPattern() : " + dtfDate.format(format1));
//		ထပ်သတိပြုစရာ LocalDate တစ်ခုကို parse နဲ့ တည်ဆောက်ရင် သူ့ရဲ့ original format pattern အတိုင်းတည်ဆောက်ရတယ် အဲ့လိုမဟုတ်ပဲ
//		ကိုယ့် format နဲ့ကိုယ်တည်ဆောက်ချင်ရင် အောက်ကလို DateTimeFormatter ကိုတွဲသုံးလို့ရတယ်
		LocalDate dtfTest = LocalDate.parse("25/-10/-2023", format1);
		System.out.println("LocalDate.parse + DateTimeFormatter : " + dtfTest.format(format1));
		
	}

}