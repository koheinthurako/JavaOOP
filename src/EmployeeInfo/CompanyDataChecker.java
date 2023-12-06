package EmployeeInfo;

public class CompanyDataChecker {

	public static void main(String[] args) {

		System.out.println("Employees' Data \n====================\n");

		Employee emp1 = new Employee("110001", "Thet Zaw Hein"); // JAPAN-MALE Test
		Employee emp2 = new Employee("210002", "Ko Hein"); // MYANMAR-MALE Test
		Employee emp3 = new Employee("310003", "Thura Kyaw"); // OTHER-MALE Test
		Employee emp4 = new Employee("120004", "Sandi Aung"); // JAPAN-FEMALE Test
		Employee emp5 = new Employee("430005", "Hein Thura"); // Invalid Country Test
		Employee emp6 = new Employee("130006", "Hein Ko Ko"); // Invalid Gender Test
		Employee emp7 = new Employee("12007", "Thet Gyi"); // Invalid Entrance_No Test

		Employee[] emps = { emp1, emp2, emp3, emp4, emp5, emp6, emp7 };

		for (Employee emp : emps) {
			System.out.println(emp.userInformation(emp.getId()));
		}

	}

}
