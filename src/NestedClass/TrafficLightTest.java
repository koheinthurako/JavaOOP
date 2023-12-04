package NestedClass;

import java.util.Arrays;

public class TrafficLightTest {

	public static void main(String[] args) {
		TrafficLight light = TrafficLight.GREEN;
//		အောက်မှာ print ထုတ်တဲ့အခါ GREEN ဆိုပြီး output ထွက်သွားခြင်းသည် enum object ထဲမှ method တွေကိုယူသုံးသွားခြင်းဖြစ်တယ်
		System.out.println(light);
//		ordinal သည် constant တွေရဲ့ position တွေကိုထုတ်ပေးသည်
		System.out.println(light.ordinal());
//		name သည် object ရဲ့ နာမည်ကို String အနေနဲ့ဆွဲထုတ်ခြင်း 
		System.out.println(light.name().charAt(0));
//		values သည် TrafficLight array ပုံစံ return ပြန်ပေးသည်
		TrafficLight [] lights = TrafficLight.values();
		System.out.println(Arrays.toString(lights));
		
	}

}
