package EmployeeInfo;

public class CompanyDataChecker {

	public static void main(String[] args) {

		Employee emp1 = new Employee("220001", "Thet Zaw Hein");
		System.out.println(emp1.userInformation(emp1.getId()));
		
		Employee emp2 = new Employee("120003", "Ko Hein");
		System.out.println(emp2.userInformation(emp2.getId()));
		
	}

}
