package Aggregation;

public class DepartmentTest {

	public static void main(String[] args) {

		TeamUI obj_ui = new TeamUI("Ko Hein", 1, "Figma");
		TeamWeb obj_web = new TeamWeb("Thet Zaw Hein", 2);
		
//		Department.java ထဲမှာ Department ကို object ဆောက်မယ်ဆိုရင် အပေါ်က object နှစ်ခုလိုအပ်သည့်အတွက် အရင်အဲ့တာကိုဆောက်ပေးရတယ်
//		တစ်နည်းပြောရရင် value တွေအရင် ထည့်ပေးလိုက်ခြင်းဖြစ်တယ်
		Department dp = new Department(obj_ui, obj_web);
		System.out.println(dp);
		/* 
			dp ကို print ထုတ်လိုက်ရင် Department ထဲက toString() က အရင်အလုပ်လုပ်ပြီး အဲ့ထဲမှာ return ပြန်ထားတဲ့
			ui & web က obj ဖြစ်နေလို့ သူနဲ့ဆိုင်တဲ့ class ထဲကို ပြန်သွားပြီး အဲ့ထဲက toSting() method တွေပေါင်းပြီး အလုပ်လုပ်သွားခြင်းဖြစ်သည်
		*/
		
	}

}
