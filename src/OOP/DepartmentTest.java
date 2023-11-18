package OOP;

public class DepartmentTest {

	public static void main(String[] args) {
		
		Department dp1 = new Department(20, "Thet Zaw Hein", true);
//		ဒီနေရာမှာ အရင် CheckeDept ကို obj ဆောက်လိုက်တယ် 
		CheckeDept checkDp = new CheckeDept();
		System.out.println("Additional age = " + checkDp.getPlusAge());
		
/*
		အဲ့ဒီ့ object checkDp ထဲက dp ဆိုတဲ့ constructor ကိုသွားခေါ်ပြီး 
		Department ထဲကိုဆက်ဆင်းသွားပြီး department ထဲက method ကိုအလုပ်လုပ်
*/
		System.out.println(checkDp.dp.changeAge(checkDp.getPlusAge()));
		
		System.out.println(dp1.getA());
		System.out.println(dp1.getName());
		System.out.println(dp1);
		
	}
	
}
