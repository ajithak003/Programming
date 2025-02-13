package streamAPI;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingFrequencyOfString {

	public static void main(String[] args) {


		String str = "aykvgfhsijfstewgljdeiythl;kcsdafdzjggffjhb";
		
		Map<Character, Long> map = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		//System.out.println(map.toString());
		
		Set<Entry<Character, Long>> entries = map.entrySet();
		
		for(Entry<Character, Long> entry: entries) {
			
			System.out.println(entry.getKey() +"  :  "+entry.getValue());
			
		}
	}

}
