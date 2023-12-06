package EmployeeInfo;

public class Employee {

	private String id;
	private String name;

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String userInformation(String id) {

		class ID {

			private char countryCode = id.charAt(0);
			private char gender = id.charAt(1);
			private String entrance_no = id.substring(2);

			public boolean checkEntranceNo() {
				return entrance_no.length() == 4;
			}

			public void checkGender(String country) {
				String confirmGender;
				switch (Character.getNumericValue(gender)) {
				case CompanyData.MALE:
					confirmGender = "MALE";
					if (checkEntranceNo())
						show_Employee_Information(country, confirmGender);
					else
						System.out.println(CompanyData.INVALID_USER_INF());
					break;
				case CompanyData.FEMALE:
					confirmGender = "FEMALE";
					if (checkEntranceNo())
						show_Employee_Information(country, confirmGender);
					else
						System.out.println(CompanyData.INVALID_USER_INF());
					break;
				default:
					System.out.println(CompanyData.INVALID_USER_INF());
				}
			}

			public boolean checkID() {
				System.out.println("Name : " + name);
				String country;
				switch (Character.getNumericValue(countryCode)) {
				case CompanyData.JAPAN:
					country = "JAPAN";
					break;
				case CompanyData.MYAN:
					country = "MYANMAR";
					break;
				case CompanyData.OTHER:
					country = "Other countries...";
					break;
				default:
					System.out.println(CompanyData.INVALID_USER_INF());
					return false;
				}
				checkGender(country);
				return true;
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
		return "-------------------------";
	}

}
