package interviewProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import interviewProject.objectClass.Employee;


public class StreamAPI {

	public static void main(String[] args) {
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		employeeList.add(new Employee(278, "Ajith", 24, "Male", "", 2021, 88700.0));


		//findMaxAndMinSalary(employeeList);
		//findMaleAndFemaleCount(employeeList);
		//printAllDepartmentName(employeeList);
		//getMaleAndFemaleAvgAge(employeeList);
		//getHighestPaidEmaployee(employeeList);
		//getEmployeeNameJoinAfter2015(employeeList);
		//countNoOfEmployeeEachDepartment(employeeList);
		//avgSalaryOfEachDepartment(employeeList);
		//youngestEmployeeOfProductTeam(employeeList);
		//mostWorkingExperienceEmployee(employeeList);
		//maleAndFemeleEmployeesInSalesAndMarketting(employeeList);
		//avgSalaryOfMaleAndFemaleEmployee(employeeList);
		//listOfEachDeparmentEmployeeName(employeeList);
		//avgAndTotalSalaryOfOrg(employeeList);
		//separateYougerOrEqueal25Year(employeeList);
		//findOldestEmployee(employeeList);
		//soryByFirstAgeAndDepartment(employeeList);
		//groupByDepartmentAndCount(employeeList);
		getDistinctString();
	}
	
	public static void findMaxAndMinSalary(ArrayList<Employee> employeeList) {
		
		//Double maxSalary = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get().getSalary();
		Optional<Employee> maxSalary = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println("Maximim employee salary : "+maxSalary);
		
		Double minSalary = employeeList.stream().min(Comparator.comparingDouble(Employee::getSalary)).get().getSalary();
		System.out.println("Minimum employee salary : "+minSalary);

	}
	
	public static void findMaleAndFemaleCount(ArrayList<Employee> employeeList) {
		
		Map<String, Long> countofMaleFemaleEmployee =
				employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		System.out.println(countofMaleFemaleEmployee);
		System.out.println(" Male employee Count :"+countofMaleFemaleEmployee.get("Male"));
		System.out.println(" Female employee Count :"+countofMaleFemaleEmployee.get("Female"));

	}
	
	public static void printAllDepartmentName(ArrayList<Employee> employeeList) {
		
		List<String> departmentNames = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		
		System.out.println("Department Name : "+departmentNames);
	}
	
	public static void getMaleAndFemaleAvgAge(ArrayList<Employee> employeeList) {
		
		Map<String,Double> averageAge = employeeList.stream()
		                     .collect(Collectors.groupingBy(Employee::getGender,
		                    		  Collectors.averagingInt(Employee::getAge)));
		
		System.out.println(averageAge);
	}
	
	public static void getHighestPaidEmaployee(ArrayList<Employee> employeeList) {
		
		Optional<Employee> higestSalaryEmployee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		
		if(higestSalaryEmployee.isPresent())
			System.out.println("Highest Paid Emaployee : "+higestSalaryEmployee.get());
	}
	
	public static void getEmployeeNameJoinAfter2015(ArrayList<Employee> employeeList) {
		
		List<String> employeeNames = employeeList.stream()
		                     .filter(emp -> emp.getYearOfJoining()>2015)
		                     .map(Employee::getName)
		                     .collect(Collectors.toList());
		System.out.println(employeeNames);
	}
	
	public static void countNoOfEmployeeEachDepartment(ArrayList<Employee> employeeList) {
		
	Map<String,Long> countOfEmployee = 
			employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
			
	countOfEmployee.entrySet().stream().sorted(Map.Entry.comparingByKey())
	.forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));
	}
	
	public static void avgSalaryOfEachDepartment(ArrayList<Employee> employeeList) {
		
		Map<String,Double> avgSalary = employeeList.stream()
		                     .collect(Collectors.groupingBy(Employee::getDepartment, 
		                    		 Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalary);
	}
	
	public static void youngestEmployeeOfProductTeam(ArrayList<Employee> employeeList) {
		
		Optional<Employee> youngEmployee = 
				employeeList.stream().filter(emp -> emp.getDepartment() == "Product Development" && emp.getGender() == "Male")
			                         .collect(Collectors.maxBy(Comparator.comparing(Employee::getYearOfJoining)));
		
		System.out.println(youngEmployee.get());
	}
	
	public static void mostWorkingExperienceEmployee(ArrayList<Employee> employeeList) {
		
		Optional<Employee> mostWorkingExp = 
				employeeList.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining)));
		
		System.out.println(mostWorkingExp.get());
	}
	
	public static void maleAndFemeleEmployeesInSalesAndMarketting(ArrayList<Employee> employeeList) {
		
		Map<String,Long> maleAndFemaleEmpCount =
				employeeList.stream().filter(emp -> emp.getDepartment() == "Sales And Marketing")
				                     .collect(Collectors.groupingBy(Employee::getGender,
				                    		 Collectors.counting()));
		
		System.out.println(maleAndFemaleEmpCount);
	}
	
	public static void avgSalaryOfMaleAndFemaleEmployee(ArrayList<Employee> employeeList) {
		
		Map<String, Double> avgSalaryOfMaleAndFemaleEmployee =
				employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
						                      Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(avgSalaryOfMaleAndFemaleEmployee);
	}
	
	public static void listOfEachDeparmentEmployeeName(ArrayList<Employee> employeeList) {
		
		Map<String,List<Employee>> employeenameByEachDepartment = 
				employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		Set<Entry<String,List<Employee>>> entries = employeenameByEachDepartment.entrySet();
		
		for(Entry<String,List<Employee>> entry : entries) {
			
			System.out.println("--------------------------------------");
            
		    System.out.println("Employees In "+entry.getKey() + " : ");
		             
		    System.out.println("--------------------------------------");
		    
		    List<Employee> employees = entry.getValue();
		    for(Employee emp : employees) {
		    	System.out.println(emp.getName());
		    }
		}
	}
	
	public static void avgAndTotalSalaryOfOrg(ArrayList<Employee> employeeList) {
		
		DoubleSummaryStatistics summary =
				employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		
		System.out.println("Average salary of organization : "+summary.getAverage());
		System.out.println("Total salary of organization : "+summary.getSum());
		System.out.println("Count : "+summary.getCount());


	}
	
	public static void separateYougerOrEqueal25Year(ArrayList<Employee> employeeList) {
		
		Map<Boolean, List<Employee>> yougerOrEqual25Year = 
				employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() > 25));
		
		Set<Entry<Boolean, List<Employee>>> entries = yougerOrEqual25Year.entrySet();
		
		for(Entry<Boolean, List<Employee>> entry : entries) {
			System.out.println("-------------------------------------");
			if(entry.getKey()) {
				System.out.println("Older Than 25 Years Employee");
			}else {
				System.out.println("Younger or Equeal to 25 Years Employee");
			}
			System.out.println("-------------------------------------");
			
		
			List<Employee> employees = entry.getValue();
			for(Employee emp : employees) {
				System.out.println("Name :"+emp.getName() +"  Age : "+emp.getAge());
			}
		}
				
	}
	
	public static void findOldestEmployee(ArrayList<Employee> employeeList) {
		
		Optional<Employee> oldestEmployee = 
				employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
		
		System.out.println("Name : "+oldestEmployee.get().getName());
		System.out.println("Age : "+oldestEmployee.get().getAge());
		System.out.println("Department : "+oldestEmployee.get().getDepartment());

	}
	
	public static void soryByFirstAgeAndDepartment(ArrayList<Employee> employeeList) {
		
		List<Employee> employees = 
				employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge)
						.thenComparing(Employee::getDepartment)
						.thenComparingInt(Employee::getYearOfJoining)).toList();
		
		employees.forEach(System.out::println);
	}
	
	public static void groupByDepartmentAndCount(ArrayList<Employee> employeeList) {
		
		Map<String, Long> employeeCount = 
				employeeList.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment() == null || emp.getDepartment() == ""
				? "UnDefined":emp.getDepartment(), Collectors.counting()));
		
		System.out.println(employeeCount);
		
		
	}
	
	public static void getDistinctString() {
		
		//Asking Terralogic company
		List<String> list = new ArrayList<>();

		list.add("Ajith");
		list.add("kumar");
		list.add("Madurai");
		list.add("Ajith");
		list.add("Madurai");
		list.add("Ajith");

		Map<String, Long> result = list.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		// System.out.println(result);

		result.entrySet().stream().filter(entry -> entry.getValue() == 1)
				.forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
	}

}
