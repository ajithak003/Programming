
package praticeFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Optional use to avoid null pointer exception

public class OptionalMainClass {

	public static void main(String[] args) {

		List<EmployeeClass> employeeList = createEmployeeList();
		Optional<EmployeeClass> employee = findEmpName(employeeList, "Ram");
		if (employee.isPresent()) {
			EmployeeClass employee1 = employee.get();
			System.out.println("Employee Name : " + employee1.getEmpName());
		} else {
			System.out.println("There is no employee match in the list");
		}
	}

	public static Optional<EmployeeClass> findEmpName(List<EmployeeClass> empList, String name) {

		for (EmployeeClass e : empList) {
			if (e.getEmpName().equalsIgnoreCase(name)) {
				return Optional.of(e);
			}
		}
		return Optional.empty();
	}

	public static List<EmployeeClass> createEmployeeList() {

		List<EmployeeClass> empList = new ArrayList<>();
		EmployeeClass emp1 = new EmployeeClass("Sam", 23);
		EmployeeClass emp2 = new EmployeeClass("Nega", 23);
		EmployeeClass emp3 = new EmployeeClass("Ajith", 23);
		EmployeeClass emp4 = new EmployeeClass("rithwin", 23);
		EmployeeClass emp5 = new EmployeeClass("mark", 23);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		return empList;
	}

}

//Normal method to avoid null pointer exception

/*
 * public class OptionalMainClass {
 * 
 * public static void main(String[] args) {
 * 
 * List<EmployeeClass> employeeList = createEmployeeList(); EmployeeClass
 * employee = findEmpName(employeeList, "Ajith"); if(employee != null)
 * System.out.println("Employee Name : "+employee.getEmpName()); else
 * System.out.println("There is no employee match in the list"); }
 * 
 * public static EmployeeClass findEmpName(List<EmployeeClass> empList, String
 * name) {
 * 
 * for (EmployeeClass e : empList) { if (e.getEmpName().equalsIgnoreCase(name))
 * { return e; } } return null; }
 * 
 * public static List<EmployeeClass> createEmployeeList() {
 * 
 * List<EmployeeClass> empList = new ArrayList<>(); EmployeeClass emp1 = new
 * EmployeeClass("Sam", 23); EmployeeClass emp2 = new EmployeeClass("Nega", 23);
 * EmployeeClass emp3 = new EmployeeClass("Ajith", 23); EmployeeClass emp4 = new
 * EmployeeClass("rithwin", 23); EmployeeClass emp5 = new EmployeeClass("mark",
 * 23);
 * 
 * empList.add(emp1); empList.add(emp2); empList.add(emp3); empList.add(emp4);
 * empList.add(emp5);
 * 
 * return empList; }
 * 
 * }
 */
