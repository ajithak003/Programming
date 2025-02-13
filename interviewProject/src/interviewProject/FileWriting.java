package interviewProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {

		String path = "C:\\Users\\ajit2916\\Downloads\\sample file writer - 09-01-2025.txt";
	
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(path)) ){
			
			writer.write("This is first line");
			writer.newLine();
			writer.write("I worked there for 14 months, continuously on night shifts, which led to serious health issues during that period. Due to my health condition, I discussed the situation with Neeyamo’s HR and my manager, requesting an early release or else any compensation. However, their HR policy did not permit early release. Considering my health, I had to leave the company imidiately without proper notice period, which is why I was not get with an experience and reliving letter.");
			writer.newLine();
			writer.write("This is secound line");
			System.out.println("File Successfully Written");
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
