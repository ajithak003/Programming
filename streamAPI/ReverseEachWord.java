package streamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWord {

	public static void main(String[] args) {
        String str = "Java Concept Of The Day";

       String result = Stream.of(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));

       System.out.println("Result : "+result);
       
	}

}
