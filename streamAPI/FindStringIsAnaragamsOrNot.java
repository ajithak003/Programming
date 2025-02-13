package streamAPI;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindStringIsAnaragamsOrNot {

	public static void main(String[] args) {
		
		 String s1 = "RacedCar";
	        String s2 = "CdarRace";
		
		s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		
		s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		
		if(s1.equals(s2)) {
			System.out.println("The Strings are Anaragams");
		}else {
			System.out.println("The Strings are not a Anaragams");
		}

	}

}
