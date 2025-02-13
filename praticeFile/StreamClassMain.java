
package praticeFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClassMain {

	public static void main(String[] args) {

		/*
		 * List<Integer> numbers = Arrays.asList(9,7,6,3,8,67,34,2);
		 * 
		 * int num =
		 * numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).
		 * findFirst().orElse(0); System.out.println("Secound longest number : "+num);
		 * List<Integer> numberse = Arrays.asList(1, 2, 3, 4, 5); boolean anyEven =
		 * numbers.stream().anyMatch(n -> n % 2 == 0);
		 * System.out.println("anymath number : "+anyEven);
		 * 
		 * 
		 * Integer[] array = numberse.stream().toArray(Integer[]::new);
		 * numbers.stream().forEach(n -> System.out.println(n));
		 * System.out.println(Arrays.toString(array)); int sum =
		 * numbers.stream().reduce(8, (a, b) -> a+b); // Sum of all numbers
		 * System.out.println(sum);
		 */
		
		
		/*int[][] intarr = new int[2][2];
         intarr[0][0] = 10;	
         intarr[0][1] = 20;		
         intarr[1][0] = 30;		
         intarr[1][1] = 40;		*/
		int[][] intarr = {{1,2},{3,4}};
        System.out.println(Arrays.toString(intarr));
          
        Stream<int[]> streamArray = Arrays.stream(intarr);
        
        List<Integer> listint = streamArray
        		.flatMap(x -> Arrays.stream(x).boxed())
        		.map(e -> 3*e)
        		.collect(Collectors.toList());
     
          listint.forEach(System.out::print);
          
          System.out.println(listint);
          int[] arr = {1,3,6,3,8};
          List<Integer> intList = Arrays.asList(1,5,3,9,3,6,4);

         int max =  Collections.max(intList);
          System.out.println(max);
          
          List<EmployeeClass> employeeList = new ArrayList<EmployeeClass>();
          employeeList = StreamClassMain.createEmployeeList();
          List filerEmpList= employeeList.stream()
        		  .filter(s1 -> s1.getEmpName().equalsIgnoreCase("Ajith"))
        		 // .findAny()
        		  //.orElse(null)
        		  .collect(Collectors.toList());
          
          System.out.println("filerEmpList :"+filerEmpList);
          
	}
	public static List<EmployeeClass> createEmployeeList() {

		List<EmployeeClass> empList = new ArrayList<>();
		EmployeeClass emp1 = new EmployeeClass("Sam", 23);
		EmployeeClass emp2 = new EmployeeClass("Nega", 23);
		EmployeeClass emp3 = new EmployeeClass("Ajith", 23);
		EmployeeClass emp4 = new EmployeeClass("rithwin", 23);
		EmployeeClass emp5 = new EmployeeClass("Ajith", 22);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		return empList;
	}

}
