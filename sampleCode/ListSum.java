package sampleCode;

import java.util.ArrayList;

public class ListSum {

	public static void main(String[] args) {
        int a = 9;
        a  = 9+1;
        String b = Integer.toString(a);
        System.out.println("Output : "+b +" b.length() : "+b.length());
        ArrayList<Integer> output = new ArrayList<>();
        if(b.length() > 1) {
        	for (int i=0; i<b.length(); i++) {        		
        		output.add((int) b.charAt(i));
        	}	
        }
       System.out.println("Output : "+ output.toString());
	}

}
