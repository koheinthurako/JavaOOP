package StringObjectTest;

public class StringObjectTest {

	public static void main(String[] args) {

		String st = "Ko Hein";
		String st2 = "Thet";
		StringObjectTest stObj = new StringObjectTest();
		
		System.out.println(st.getClass());
		System.out.println(stObj.getClass().getSimpleName());
		
		System.out.println("String charAt : " + st.charAt(1));
		System.out.println("String endsWith : " + st.endsWith("y"));
		System.out.println("String indexOf(subString) : " + st.indexOf(st.substring(5)));
		System.out.println("String indexOf (subString and fromIndex) : " + st.indexOf(st.substring(7), 1));
		
//		Substring beginIndex
		System.out.println("String substring beginIndex : " + st.substring(4));
//		Substring beginIndex and endIndex => 3 လုံးမြောက်ပြည့်တဲ့နေရာထိအရင်ဖြတ်ပြီး ၅ လုံးမြောက်နေရာရဲ့နောက်ပိုင်းကိုအကုန်ဖြတ်ချ
		System.out.println("String substring beginIndex and endIndex : " + st.substring(3, 5));		
		
	}

}
