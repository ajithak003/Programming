package interviewProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import interviewProject.objectClass.Author;

public class TestMainClass {

	public static void main(String[] args) {
		
		String str = "123";
		System.out.println(str.length());

		  Scanner scanner = new Scanner(System.in);
	       
	        String input = scanner.next();
	        
	        String result = removeVowels(input);
	        System.out.println(result);

		
	}
	
	  public static boolean isVowel(char c) {
	        char lowercase = Character.toLowerCase(c);
	        return lowercase == 'a' || lowercase == 'e' || lowercase == 'i' || lowercase == 'o' || lowercase == 'u';
	    }

	    public static String removeVowels(String input) {
	        StringBuilder result = new StringBuilder();
            int count = 0;
	        for(int i = 0; i< input.length()-1; i++) {
	        String word = input.substring(i,i+2);
	        
	        for (char c : word.toCharArray()) {
   	
	            if (isVowel(c)) {
	            	count++;
	            }

	        }
	        if(count == 2) {
           	 result.append(word);
             }else {
            	 result.append(removeChar(word));
             }
	        count = 0;
	        }
	        return result.toString();
	    }
	        
	    public static char removeChar(String str) {
	    	char result =0;
	    	for(char c : str.toCharArray()) {
	    		if(!isVowel(c)) {
	    			result = c;
	    		}
	    	}
			return result;
	    }

}
