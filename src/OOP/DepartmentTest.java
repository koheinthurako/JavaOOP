package OOP;

public class DepartmentTest {

	public static void main(String[] args) {
		
		Department dp1 = new Department(20, "Thet Zaw Hein", true);
//		ဒီနေရာမှာ အရင် CheckeDept ကို obj ဆောက်လိုက်တယ် 
		CheckeDept checkDp = new CheckeDept();
		System.out.println("Additional age = " + checkDp.getPlusAge());
		
		
		checkDp.dp.changeAge(checkDp.getPlusAge());
/*
		Method Propagation အကြောင်းအတွက်
		အောက်က codeline ကို ရှင်းမယ် အရင်ဆုံး checkDp obj ထဲက getPlusAge() getter method ကိုသွားခေါ်တယ်
		အဲ့ကနေ သူ့ class ထဲမှာရှိတဲ့ plusAge ကို return ပြန်ပေးလို့ 5 ရလာတယ် အဲ့ 5 က checkDp.dp.changeAge(5)
		ဆိုပြီးဖြစ်သွားတယ် changeAge ကိုခေါ်ဖို့အတွက် checkDp ထဲက dp obj ကိုသွားခေါ်တော့ dp က Department class
		ရဲ့ constructor နဲ့ obj အသစ်ဆောက်ထားလို့ dp ရှိတဲ့ Department.java ထဲကိုပြန်ဆင်းသွားပြီး changeAge(5) method
		ကိုသွားခေါ်တယ် parameter ထဲက 5 နဲ့ မူရင်း Department 
		အဲ့ဒီ့ object checkDp ထဲက dp ဆိုတဲ့ constructor ကိုသွားခေါ်ပြီး 
		Department ထဲကိုဆက်ဆင်းသွားပြီး department ထဲက method ကိုအလုပ်လုပ်
*/
		
		System.out.println(checkDp);
		
//		System.out.println(dp1.getA());
//		System.out.println(dp1.getName());
//		System.out.println(dp1);
		
	}
	
}
