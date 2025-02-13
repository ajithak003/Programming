/**
 * 
 */
package praticeFile;

import java.util.Objects;

/**
 * 
 */
public class EmployeeClass {
	
	private String empName;
	private int age;
	protected String str1;
	public String str2;
	String str3;
	static String str4;
	//private final String department;
	
	public static String getStr4() {
		return str4;
	}
	public static void setStr4(String str4) {
		EmployeeClass.str4 = str4;
	}
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	public String getStr3() {
		return str3;
	}
	public void setStr3(String str3) {
		this.str3 = str3;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public EmployeeClass(String empName, int age) {
		super();
		this.empName = empName;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, empName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeClass other = (EmployeeClass) obj;
		return age == other.age && Objects.equals(empName, other.empName);
	}
	@Override
	public String toString() {
		return "EmployeeClass [empName=" + empName + ", age=" + age + "]";
	}
	
	public static void employeeStaticMethod() {
		System.out.println("calling employeeStaticMethod");
		//You can not user This and Super keyword in the static method.
	}

}
