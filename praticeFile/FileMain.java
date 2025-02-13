
package praticeFile;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {

		File fileName = new File("C:/Users/ajit2916/Documents/AJITHKUMAR G. S/profile.pdf");
		
		if(fileName.exists()) {
			System.out.println("File is exists");
		}else {
			System.out.println("File not exists");
		}
		
	}

}
