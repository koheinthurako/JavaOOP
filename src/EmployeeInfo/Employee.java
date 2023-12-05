package EmployeeInfo;

public class Employee implements CompanyData {

	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String userInformation() {
		return id + " : " + name;
	}

	class ID {
		private int countryCode;
		private int gender;
		private String entrance_no;

		public boolean checkID() {
			return true;
		}

		public String show_Employee_Information() {
			return "";
		}
	}

	@Override
	public String toString() {
		return "";
	}

}
