package leetCode;

import java.util.HashMap;

public class RomanToInt {

	public static void main(String[] args) {

		RomanToInt row = new  RomanToInt();
		System.out.println("Total : "+ row.romanToInt("CMCMXCIV"));
		
		
	}
	
	 public int romanToInt(String s) {
	        
	        
		    HashMap<Character, Integer> values = new HashMap<>();
		    values.put('I', 1);
		    values.put('V', 5);
		    values.put('X', 10);
		    values.put('L', 50);
		    values.put('C', 100);
		    values.put('D', 500);
		    values.put('M', 1000);
		    
		    char c = s.charAt(0);
		    int total = values.get(c);
		    
		    for(int i = 1; i < s.length(); i++){
		        total = total + values.get(s.charAt(i));
		        if(values.get(c) < values.get(s.charAt(i))){
		            total = total - (values.get(c)*2);
		        }
		        c = s.charAt(i);
		    }
		    return total;
		  
		    }   

}
