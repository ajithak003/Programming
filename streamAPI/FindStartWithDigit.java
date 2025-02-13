package streamAPI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindStartWithDigit {
	
	int number = 10;

	public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

		
        listOfStrings.parallelStream().filter(str->Character.isDigit(str.charAt(0))).forEach(System.out::println);
        display();
	}
	  public static void display() {
      	try {
			System.out.println("static method:");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      	FindStartWithDigit obj = new FindStartWithDigit();
      	obj.show();
      }
	  
	  public  void show() {
      	System.out.println("show method: "+number);
      }

}
