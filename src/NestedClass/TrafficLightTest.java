package NestedClass;

import java.util.Arrays;

public class TrafficLightTest {

	public static void main(String[] args) {
//		TrafficLight DataTypes သည် Enum ဖြစ်နေတယ် enum သည် java ထဲက object တစ်ခုအနေနဲ့လုပ်ဆောက်သွားသည့်အတွက် object ထဲက method တွေအများကြီးကိုအသုံးပြုနိုင်တယ်
		TrafficLight light = TrafficLight.GREEN;
//		အောက်မှာ print ထုတ်တဲ့အခါ GREEN ဆိုပြီး output ထွက်သွားခြင်းသည် enum object ထဲမှ toSting() method ကိုယူသုံးသွားခြင်းဖြစ်တယ်
		System.out.println(light);
//		ordinal သည် constant တွေရဲ့ position တွေကိုထုတ်ပေးသည် array ရဲ့ index တွေနဲ့တူတယ်
		System.out.println(light.ordinal());
//		name သည် object ရဲ့ နာမည်ကို String အနေနဲ့ဆွဲထုတ်တယ် ပြီးမှ charAt နဲ့ character ကိုပြန်ထုတ်တယ်
		System.out.println(light.name().charAt(0));
//		values သည် TrafficLight array ပုံစံ return ပြန်ပေးသည်
		TrafficLight[] lights = TrafficLight.values();
		System.out.println(Arrays.toString(lights));

//		Run တဲ့အခါမှာ Run Time Error ကို handle လုပ်ဖို့အတွက် Try Catch သုံး
//		Enum မှာ valueOf ကိုသုံးတဲ့အခါ try catch ကိုနဲ့စစ်ပေးသင့်တယ် valueOf သည် String ကနေ enum constant ကိုပြောင်းခြင်းဖြစ်တယ်
		try {
			TrafficLight l2 = TrafficLight.valueOf("Orange");
			System.out.println(l2.ordinal());
//			catch(exception e) ဆိုတာ ဘာ error ပဲလာလာဆိုတဲ့ သဘောဖြစ်တယ်
		} catch (IllegalArgumentException e) {
//			console တွေမှာ error ကို သိသိသာသာ print ထုတ်ချင်ရင် System.err ကိုသုံး
			System.err.println("Input Wrong!");
		}

	}

}
