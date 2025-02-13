package interviewProject;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReading {

	public static void main(String[] args) {
	 
		String path = "C:\\Users\\ajit2916\\Downloads\\longrunning query - 06-01-2025.txt";
		
		String findingWord = "SALES";
		int wordCount = 0;
		
		try(BufferedReader reader = new BufferedReader(new FileReader(path));){
			String line;
			while((line = reader.readLine()) != null) {
				
				String[] words = line.split("\\s+");
				for(String word : words) {
					if(word.equalsIgnoreCase(findingWord)) {
						wordCount++;
					}
				}
		
			}
			
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("Your workd is "+findingWord+" present in the file is : "+wordCount);

	}

}
