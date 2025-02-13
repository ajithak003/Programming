package m2p;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class M2PMainClass {

	public static void main(String args[]) {
		
		String url ="a/b/c/d/e/f/g/h";
		
		LinkedList<String> list = (LinkedList<String>) Stream.of(url.split("/")).collect(Collectors.toList());
		System.out.println(list);
	}
	
}
