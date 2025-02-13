package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringUsingDelimiters {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn"));
		
		String result = list.stream().sorted().collect(Collectors.joining(", ","[ "," ]"));
		
		System.out.println("Result String : "+result);
		
	}

}
