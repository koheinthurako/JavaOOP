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

			public boolean checkID() {
				if (countryCode == CompanyData.JAPAN) {
					show_Employee_Information(countryCode, gender, entrance_no);
					return true;
				} else if (countryCode == CompanyData.MYAN) {
					show_Employee_Information(countryCode, gender, entrance_no);
					return true;
				} else if (countryCode == CompanyData.OTHER) {
					show_Employee_Information(countryCode, gender, entrance_no);
					return true;
				} else {
					System.out.println(countryCode + " = last condition");
					return false;
				}
			}

			public String show_Employee_Information(char country, char gender, String entrance_no) {
				System.out.println("Country : " + countryCode);
				System.out.println("Gender : " + gender);
				System.out.println("Entrance_No : " + entrance_no);
				return "";
			}
		}
		ID checkInfo = new ID();
		checkInfo.checkID();
//		if (checkInfo.checkID()) {
//			checkInfo.show_Employee_Information();
//			System.out.println("true");
//		} else {
//			CompanyData.INVALID_USER_INF();
//		}
		
		return toString();
		
	}

	@Override
	public String toString() {
		return "";
	}
	
}
