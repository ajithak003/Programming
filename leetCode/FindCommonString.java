package leetCode;

import java.util.Comparator;

public class FindCommonString {

	public static void main(String[] args) {
		FindCommonString str  = new FindCommonString();
		String [] strs = {"cardfdcar","cardfdcdddggg"};
		System.out.println(str.longestCommonPrefix(strs));
	}

	public String longestCommonPrefix(String[] strs) {
	        
		String str = strs[0];
	     for(String stringStr : strs) {
	    	 if(str.length() > stringStr.length() ) {
	    		 str = stringStr;
	    	 }
	     }
   if(strs.length == 0){
       return "";
   }
   else if(str.length() == 1){
          return str;
   }else{
     int i;
     
     for(i=0; i < str.length(); i++){
char c = strs[0].charAt(i);
       if(strs[1].charAt(i) != c){
    	   
            break;
       }
            
     }
      return strs[0].substring(0, i); 
   }
}
}
