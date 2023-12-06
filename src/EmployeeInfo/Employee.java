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
			
			public boolean checkEntranceNo(String entrance_no) {
				if(entrance_no.length()==4) return true;
				return false;
			}

			public void checkGender(String country) {
				if (Character.getNumericValue(gender) == CompanyData.MALE) {
					String confirmGender = "MALE";
					if(checkEntranceNo(entrance_no)) show_Employee_Information(country, confirmGender);
					else System.out.println(CompanyData.INVALID_USER_INF());
				} else if (Character.getNumericValue(gender) == CompanyData.FEMALE) {
					String confirmGender = "FEMALE";
					if(checkEntranceNo(entrance_no)) show_Employee_Information(country, confirmGender);
					else System.out.println(CompanyData.INVALID_USER_INF());
				} else {
					toString();
					System.out.println(CompanyData.INVALID_USER_INF());
				}
			}
			
			public boolean checkID() {
				System.out.println("Name : " + name);
				if (Character.getNumericValue(countryCode) == CompanyData.JAPAN) {
					String country = "JAPAN";
					checkGender(country);
					return true;
				} else if (Character.getNumericValue(countryCode) == CompanyData.MYAN) {
					String country = "MYANMAR";
					checkGender(country);
					return true;
				} else if (Character.getNumericValue(countryCode) == CompanyData.OTHER) {
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
		return "-------------------------";
	}

}
