package interviewProject.objectClass;

import java.util.Objects;

public class UserClass {

	private String name;
	private int age;
	private String gender;
	
	public UserClass() {
		
	}
	
	public UserClass(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, gender, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserClass other = (UserClass) obj;
		return age == other.age && Objects.equals(gender, other.gender) && Objects.equals(name, other.name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserClass [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
}
