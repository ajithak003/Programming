package zoho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecodeSecretMessage {

	public static void main(String[] args) {
		
		Map<Integer,Character> encodeMap = new HashMap<>();
		int i = 1;
		for(char c = 'z'; c>='a'; c--) {
			encodeMap.put(i, c);
			i++;
		}
		
		System.out.println(encodeMap);
		
		System.out.println(decode(encodeMap,"1123"));
	}
	
	public static List<String> decode (Map<Integer,Character> encodeMap, String input){
		
		ArrayList<String> result = new ArrayList<>();
		
		decodeHandler(encodeMap,input,result,"");
		
		return result;
	}

	private static void decodeHandler(Map<Integer,Character> encodeMap, String input,ArrayList<String> result,String decode) {
		
		
		if(input.isEmpty()) {
			result.add(decode);
			return;
		}
		
		if(input.length()>=1) {
			int number = Integer.parseInt(input.substring(0,1));
			if(number >=1 && number<=26) {
			Character oneChar = encodeMap.get(number);
			decodeHandler(encodeMap, input.substring(1), result, decode+oneChar);
			}
		}
		
		if(input.length()>=2) {
			int number = Integer.parseInt(input.substring(0,2));
			if(number >=1 && number<=26) {
				Character towChar = encodeMap.get(number);
				decodeHandler(encodeMap, input.substring(2), result, decode+towChar);
			}
		}
		
		
	}

}
