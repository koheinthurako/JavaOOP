package EmployeeInfo;

public class Employee {

	private String id;
	private String name;
	
	public Employee () {};

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String userInformation(String id) {

		class ID {
			private char countryCode = id.charAt(0);
			private char gender = id.charAt(1);
			private String entrance_no = id.substring(2);

			public boolean checkGender(String country) {
				if (gender == CompanyData.MALE) {
					String confirmGender = "MALE";
					show_Employee_Information(country, confirmGender);
				} else if (gender == CompanyData.FEMALE) {
					String confirmGender = "FEMALE";
					show_Employee_Information(country, confirmGender);
				} else {
					toString();
					System.out.println(CompanyData.INVALID_USER_INF());
				}
				return true;
			}

			public boolean checkID() {
				System.out.println("Name : " + name);
				if (countryCode == CompanyData.JAPAN) {
					String country = "JAPAN";
					checkGender(country);
					return true;
				} else if (countryCode == CompanyData.MYAN) {
					String country = "MYANMAR";
					checkGender(country);
					return true;
				} else if (countryCode == CompanyData.OTHER) {
					String country = "Other countries...";
					checkGender(country);
					return true;
				} else {
					System.out.println(CompanyData.INVALID_USER_INF());
					return false;
				}
			}

			public String show_Employee_Information(String country, String gender) {
				System.out.println("Country : " + country);
				System.out.println("Gender : " + gender);
				System.out.println("Entrance_No : " + entrance_no);
				return "";
			}
		}

		ID checkInfo = new ID();
		checkInfo.checkID();

		return toString();
	}

	@Override
	public String toString() {
		return "";
	}

}
