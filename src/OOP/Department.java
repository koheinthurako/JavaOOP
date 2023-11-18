package OOP;

public class Department {
	
	private String name;
	private int age;
	private boolean gender;
	
	public Department(int a, String name, boolean gender) {
		this.age = a;
		this.name = name;
		this.gender = gender;
	}

	public int getA() {
		return age;
	}

	public void setA(int a) {
		this.age = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Department - 1 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
