package praticeFile.StringFunctions;

public class IndexOfFunction {
	
	 public static void main(String[] args) {
		   String str1 = "Astronet";
	       String str2 = "mastro";
	      
	       str1 = str1.toLowerCase();
	       str2 = str2.toLowerCase();
	       String longestCommonString = "";
	       
	       
	       if(str1.length() > str2.length()) {
	    	   String temp = str1;
	    	   str1 = str2;
	    	   str2 = temp;
	       }
	       System.out.println("str1 : "+str1.length()+" str2 :"+str2.length());
	       
	       for(int i=0; i<str1.length(); i++){
	           for(int j= i+1; j<=str1.length(); j++){
	               
	               String subStr = str1.substring(i,j);
	               if(str2.indexOf(subStr) !=-1){
	                   longestCommonString = subStr;
	               }else{
	                   break;
	               }
	           }
	           
	           if(longestCommonString.length() >= str1.length()-i){
	               break;
	           }
	       }
	       
	       System.out.println("longestCommonString : "+longestCommonString);
	       
	    }

}
