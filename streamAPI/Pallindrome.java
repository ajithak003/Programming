package streamAPI;

import java.util.stream.IntStream;

public class Pallindrome {

	public static void main(String[] args) {

		String str = "ROTATOR";
		
		//boolean isPalindrome = IntStream.range(0, str.length()/2).allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
		boolean isPalindrome = IntStream.range(0, str.length()/2).noneMatch(i-> str.charAt(i) != str.charAt(str.length()-1-i));
		System.out.println("Is Pallindriom : "+isPalindrome);
	}

}
