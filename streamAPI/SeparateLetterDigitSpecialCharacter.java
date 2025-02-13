package streamAPI;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SeparateLetterDigitSpecialCharacter {

	public static void main(String[] args) {
		String str = "f2' k^dj33&Uk3*Tdf330 i3i'3 3474*ejfke";
		
		Map<String, Long> letters = str.chars().filter(Character::isLetter).mapToObj(c -> String.valueOf((char)c))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println("Letters :"+letters);
		
		String digits = str.chars().filter(c -> Character.isDigit(c)).mapToObj(c -> String.valueOf((char)c))
				.collect(Collectors.joining());
		System.out.println("Digits : "+digits);
		
		Map<String, Long> specialCharacter = str.chars().filter(c -> !Character.isLetterOrDigit(c))
				.mapToObj(c -> String.valueOf((char)c)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Special Characters : "+specialCharacter+" length: "+specialCharacter.size());

		
		String str2 = "ajithkumar";
		
		Map<Character, Long> map =str2.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
				Collectors.counting()));
		System.out.println("map : "+map);
		Map<String, Long> map2 = new LinkedHashMap<>();
		for(Character c : str2.toCharArray()) {
			//System.out.println(c);
			map2.put(String.valueOf(c), map2.getOrDefault(String.valueOf(c), (long) 0)+1);
		}
		System.out.println("map2 : "+map2);

		List<String> list = Arrays.asList("one","two","one","three");
		Map<String, Long> map3 = new LinkedHashMap<>();
		for(String stre : list) {
			map3.put(stre, map3.getOrDefault(stre, (long) 0)+1);
		}
		
		System.out.println(map3);
		
	}

}
