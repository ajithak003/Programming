
package praticeFile;

class StringMethodsMain {

	public static void main(String[] args) {
		String str1 = "ajith";
		  byte[] bytes=str1.getBytes();
		 
		  System.out.println(bytes.toString());
		 
		  String origStr1=new String(bytes);
		  System.out.println(origStr1);
		System.out.println("reversed String : "+StringMethodsMain.reversed("aaas"));
		//System.out.println("reversed String : "+StringMethodsMain.reversed("ajithkumar"));
		

	}
		
public static Character reversed(String str) {
	char charaaray[] = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			
			System.out.println("a2 : "+str.indexOf(charaaray[i]));
			System.out.println("a1 : "+str.lastIndexOf(charaaray[i]));
			if(str.lastIndexOf(charaaray[i])== str.indexOf(charaaray[i])) 
				return charaaray[i];
			
		}
		return 'z';
		
		
}

}
