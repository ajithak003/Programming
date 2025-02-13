package interviewFiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class InterviewQuestions {

	public static void main(String[] args) { 
		
		InterviewQuestions interview = new InterviewQuestions();
		
		//str1.replaceAll(" ",",");
		//java8Questions();
		//System.out.println(str1);
		//permutation(str.toCharArray(),0);
		interview.insertingString();
	}
    
	public void viceVersa() {
		String str1 = "ABCD";
		String str2 = "CDAB";
		String str3 = str1+str1;
		System.out.println(str3);
		System.out.println((str3).indexOf(str2));
		boolean isPresent = (str3).indexOf(str2) >-1;
		if(isPresent) {
			System.out.println("is vice versa");
		}else {
			System.out.println("not a vice versa");
		}
	}
	
	public void missingNaturalNumberInArray() {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,13,14,15};
		//sum of n natural number n =15
		int totalOfnaturalNumber = (15 * 16)/2;
		int arrayTotal = 0;
		for(int i : arr) {
			arrayTotal = arrayTotal +i;
		}
		int missingNumber = totalOfnaturalNumber - arrayTotal;
		System.out.println("totalOfnaturalNumber : "+ totalOfnaturalNumber);
		System.out.println("arrayTotal : "+ arrayTotal);
		System.out.println("missingNumber : " + missingNumber);
		
	}
	
	public void countSpecialCharacter() {
		String str = "gowtham@#$%      ";
		int specialCharacterCount =0;
		int whiteSpaceCount =0;
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
				specialCharacterCount++;
			}
			if(Character.isWhitespace(str.charAt(i))) {
				whiteSpaceCount++;
			}
		}
		System.out.println("specialCharacterCount : "+specialCharacterCount);
		System.out.println("whiteSpaceCount : "+ whiteSpaceCount);
	}
	
	public void anagram() {
		String str1= "listen";
		String str2= "silent";
		if(str1.length() == str2.length()) {
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			System.out.println("arr1 : "+Arrays.toString(arr1));
			System.out.println("arr2 : "+Arrays.toString(arr2));
			if(Arrays.equals(arr1, arr2)) {
				System.out.println("both the strings are anagram");
			}else {
				System.out.println("both the strings are not a anagram");
			}
		}
		
	}
	
	public void duplicateStringCount() {
		
		String str1 = "This is my house and This is my city";
		String[] arr1 =str1.split(" ");
		List<String> list = Arrays.asList(arr1);
		System.out.println(list);
		Map<String,Integer> map = new HashMap<>();
		for(String word:arr1) {
			if(!map.containsKey(word)) {
				map.put(word, 1);
			}else {
				map.put(word,map.get(word)+1);
			}
		}
		map.entrySet().stream().forEach(map1 -> System.out.println(map1.getKey() +" : "+map1.getValue()));
		
		//by streams 
		// duplicate word 
		Set<String> set = list.stream().filter(words -> Collections.frequency(list, words) >1).collect(Collectors.toSet());
		System.out.println(set);
		//duplicate words and its count
		
		Map<String,Long> map2 = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		map2.entrySet().stream().forEach(map1 -> System.out.println(map1.getKey() +" : "+map1.getValue()));
	}
	
	public void countVowelAndConsonantAndothers() {
		String name = "gowthamsiddharth123#$%";
		int vowels = 0;
		int consonants = 0;
		int others = 0;
		String upperOfName = name.toUpperCase();
		for (int i = 0; i < upperOfName.length(); i++) {
			if (upperOfName.charAt(i) >= 'A' && upperOfName.charAt(i) <= 'Z') {
				if (upperOfName.charAt(i) == 'A' || upperOfName.charAt(i) == 'E' || upperOfName.charAt(i) == 'I'
						|| upperOfName.charAt(i) == 'O' || upperOfName.charAt(i) == 'U') {
					vowels++;
				} else {
					consonants++;
				}

			} else {
				others++;
			}
		}
		System.out.println("vowels count : " + vowels);
		System.out.println("consonants count : " + consonants);
		System.out.println("others count : " + others);
	}
	
	public void removeUnwantedSpace() {
		String quotes = "HardWord     Never       fails";
		boolean isFirstSpace = false;
		for (int i = 0; i < quotes.length(); i++) {
			if(quotes.charAt(i) != ' ') {
				System.out.print(quotes.charAt(i));
				isFirstSpace = true;
			}else if(isFirstSpace == true){
				System.out.print(quotes.charAt(i));
				isFirstSpace = false;
			}
		}
	}
	
	public void secondHighestNumber() {
		List<Integer> list = new ArrayList<>();
	     list.add(34);
	     list.add(67);
	     list.add(98);
	     list.add(54);
	     list.add(77);
	   //with sorting
		//Collections.sort(list,Collections.reverseOrder());
	    //System.out.println("secondLargest : " + list.get(1));
		
		//without sorting
		 int max = Collections.max(list);
	     list.remove(Integer.valueOf(max));
	     int secondLargest = Collections.max(list);
	     System.out.println("secondLargest : " + secondLargest);
	}
	
	public void largestNumberInArraywithOutSorting() {
		int[] arr = {98,65,12,76,54};
		int max =arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		
		
		//by streams
		List<Integer> list = new ArrayList<>();
	     list.add(34);
	     list.add(67);
	     list.add(98);
	     list.add(54);
	     list.add(77);
	     Optional<Integer> max1  = list.stream().max((val1,val2) -> {return val1.compareTo(val2);});
	     Optional<Integer> min1  = list.stream().min((val1,val2) -> {return val1.compareTo(val2);});
	     System.out.println("max : "+max1.get());
		 System.out.println("min : "+min1.get());
		
	}
	
	public void reverseTheNumber() {
		int n = 34523;
		int remainder = 0,sum =0;
		
		while(n>0) {
			remainder = n%10;
			sum = (sum * 10) + remainder;
			n = n/10;
		}
		System.out.println(sum);
	}
	
	public static void arthimaticOperationsInString() {
		String s = "7+3-5+8-2";
		String[] numbers = s.split("[\\+\\-]");
		String[] operators = s.split("[0-9]");
		int result = Integer.valueOf(numbers[0]);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(operators));
		for (int i = 1; i < numbers.length; i++) {
			if (operators[i].equals("+")) {
				result = result + Integer.valueOf(numbers[i]);
			} else {
				result = result - Integer.valueOf(numbers[i]);
			}
		}
		System.out.println(result);
	}
	
	public void arrayReverseInAnotherArray() {
		int[] arr = {45,67,90,43,60};
		int length = arr.length;
		int [] arr1 = new int[length];
		int index =0;
		for(int i = length-1;i>=0;i--) {
			arr1[index] = arr[i];
			index++;
		}
		System.out.println(Arrays.toString(arr1));
	}
	
	public void arrayReverseInSameArray() {
		int [] arr = {55,77,88,22,33};
		int start = 0;
		int end = arr.length-1;
		for(int i=start;i<=end;i++) {
			if(start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void secondLargestUsingSingleForLoop() {
		int[] arr = {55,77,88,22,33};
		int max =arr[0];
		int secondMax = 0;
		for(int num : arr) {
			 if(num > secondMax && num < max) {
				secondMax = num;
			}else if(num > max) {
				secondMax = max;
				max = num;
			}
		}
		System.out.println("max : "+max);
		System.out.println("secondMax : "+secondMax);
	}
	
	public void ThirdLargestNumber() {
		int max = Integer.MIN_VALUE;
    	int sMax = Integer.MIN_VALUE;
    	int tMax = Integer.MIN_VALUE;
    	int[] arr = {45,22,77,90,33,23};
    	for(int num : arr) {
    		if(num > max) {
    			tMax = sMax;
    			sMax = max;
    			max = num;
    		}else if(num > sMax && num < max) {
    			tMax = sMax;
    			sMax = num;
    		}else if(num > tMax && num < sMax) {
    		    tMax = num;
    		}
    	}
    	System.out.println(tMax);
	}
	
	public void stringSort() {
		String name = "gowtham";
		char[] arr = name.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr);
	}
	public void subString() {
		String str = "The Cat";
		List<String> arr = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length()+1; j++) {
				arr.add(str.substring(i, j));
			}
		}
		System.out.println(arr);
		System.out.println(arr.size());
	}
	
	public void insertingString() {
		String originalString = "GeeksGeeks";
		String stringToBeInserted = "For";
		int index = 4;
		String newString = new String();

		/*
		 * for (int i = 0; i < originalString.length(); i++) { newString +=
		 * originalString.charAt(i); if (i == index) { newString += stringToBeInserted;
		 * } }
		 */
		String str1 = originalString.substring(0, 5);
		String str2 = originalString.substring(5, originalString.length());
		newString = str1+stringToBeInserted+str2;
		System.out.println(newString);
	}
	
	public void longestSubstringLengthWithoutRepeatingCharacter() {
		String LongestSubString = null;
		int subStringLength = -1;
		String s = "pwwkew";
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
            }else{
                i = map.get(s.charAt(i));
                map.clear();
            }

             if(map.size() > subStringLength){
                subStringLength = map.size();
                LongestSubString = map.keySet().toString();
            }
        }
        System.out.println("LongestSubstring : "+LongestSubString);
        System.out.println("subStringLength : "+ subStringLength);
	}
	
	private static int removeDuplicatesInUnsortedArray() {
		int[] array = {12,12,42,11,55,23,66,77,88,23,11};
        int length = array.length;

        int uniqueCount = 1;
        for (int i = 1; i < length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                array[uniqueCount] = array[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
	
	public static void removeDuplicatesInsortedArray() {
		int[] arr = {1,2,2,3,3,5,5,7,7,8,8,11,14,14,14};
		int unique =0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] != arr[unique]) {
				unique++;
				arr[unique] = arr[i];
			}
		}
		for(int i=0;i<unique+1;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void sortEvenNumInAssAndOddNumInDescInRespectiveIndex() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers : ");
		String input = sc.nextLine();
		String[] inputString = input.split(",");
		
		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();
		List<Integer> evenIndex = new ArrayList<>();
		List<Integer> oddIndex = new ArrayList<>();
		for(int i=0;i<inputString.length;i++) {
			int n = Integer.parseInt(inputString[i]);
			if(n %2==0) {
				evenList.add(n);
				evenIndex.add(i);
			}else {
				oddList.add(n);
				oddIndex.add(i);
			}
		}
        Collections.sort(evenList);
        Collections.sort(oddList,Collections.reverseOrder());
		int[] outputArray = new int[evenList.size()+oddList.size()];
		for(int i=0;i<evenList.size();i++) {
			
			int num = evenList.get(i);
			outputArray[evenIndex.get(i)] = num;
		}
        for(int i=0;i<oddList.size();i++) {
			
			int num = oddList.get(i);
			outputArray[oddIndex.get(i)] = num;
		}
		System.out.println(Arrays.toString(outputArray));
    }
	
	public static void quickSort(int[] arr, int i, int j) {
		/*int[] arr = {12,42,11,55,23,66,77,88,23,11};
		quickSort(arr,0,arr.length-1);*/
		if (i < j) {
			int mid = (i + j) / 2;
			int pivot = arr[mid];
			int left = i;
			int right = j;
			while (left <= right) {
				while (arr[left] < pivot) {
					left++;
				}
				while (arr[right] > pivot) {
					right--;
				}
				if (left <= right) {
					int temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
					left++;
					right--;
				}
			}

			quickSort(arr, i, right);
			quickSort(arr, left, j);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rotateArray() {
		int k =3;
		String type = "left";
		int[] arr = {1,2,3,4,5};
		k = k % arr.length;
		if(type.equals("left")) {
			rotateReverse(arr,0,k-1);
			rotateReverse(arr,k,arr.length-1);
			rotateReverse(arr,0,arr.length-1);
		}else if(type.equals("right")) {
			rotateReverse(arr,0,arr.length-1);
			rotateReverse(arr,0,k-1);
			rotateReverse(arr,k,arr.length-1);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rotateReverse(int arr[],int start,int end) {
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void permutation(char[] arr,int fi) {
		if(fi == arr.length-1) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int i =fi;i<arr.length;i++) {
			swap(arr,i,fi);
			permutation(arr,fi+1);
			swap(arr,i,fi);
		}
	}
	public static void swap(char[] arr,int i,int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void maxRepeatedCharconsequently() {
		 String str = "AbbccDddD";
		  str = str.toLowerCase();
		  int maxCount = 0;
		  int currentCount = 1;
		  char c = '\0';
		  
		  for(int i=1;i<str.length();i++) {
			 if(str.charAt(i) == str.charAt(i-1)) {
				 currentCount++;
				 if(currentCount > maxCount) {
					 maxCount = currentCount;
					 c = str.charAt(i);
				 }
			 }else {
				 currentCount = 1;
			 }
		  }
		  System.out.println("character "+ c +" count "+ maxCount);
		  
		  //another way
		  String str1 = "AbbcccccDddDeee";
	    	str = str.toLowerCase();
	    	char[] arr = str.toCharArray();
	    	int i =0;
	    	int j =1;
	    	int maxCount1 =0;
	    	int currentCount1 = 0;
	    	char c1 = '\0';
	    	while(j !=arr.length){
	    		if(arr[i] !=arr[j]) {
	    			j++;
	    			i=j-1;
	    		}else {
	    			j++;
	    			currentCount1 =j-i;
	    			if(currentCount1 > maxCount1) {
	    				maxCount1 = currentCount1;
	    				c1 = arr[i];
	    			}
	    		}
	    	}
	    	System.out.println(c1);
	    	System.out.println(maxCount1);
	}
	
	public static void java8Questions() {
		
		Integer[] array = {12,42,11,55,23,66,77,88,23,11};
		List<Integer> numberlist = Arrays.asList(array);
		
		String[] array1 = {"good","bad","poor","excelent","verygood"};
		List<String> Stringlist = Arrays.asList(array1);
		
		//duplicate element in the list;
		// 1) approach using set
		Set<Integer> s = new HashSet<>();
		Set<Integer> ss = numberlist.stream().filter(item -> !s.add(item)).collect(Collectors.toSet());
		System.out.println(ss);
		// 2) using frequnecy method in collections class
		Set<Integer> list1 = numberlist.stream().filter(item -> Collections.frequency(numberlist, item) >1).collect(Collectors.toSet());
		System.out.println(list1);
		
		//second largest number in the list
		Integer num = numberlist.stream().distinct().sorted((a,b) -> b.compareTo(a)).skip(1).findFirst().orElse(0);
		System.out.println(num);
		
		//square of the number
		List<Double> squareList = numberlist.stream().map(n -> Math.sqrt(n)).collect(Collectors.toList());
		System.out.println(squareList);
		
		//group by the string according to length
		
		Map<Integer, List<String>> map = Stringlist.stream().collect(Collectors.groupingBy(String::length));
		
		for(Map.Entry<Integer, List<String>> entry : map.entrySet()) {
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
		
		//find the vowels in the list and their index
		
		List<Character> characters = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        characters.stream()
                .filter(c -> "aeiou".indexOf(c) != -1) // Filter vowels
                .forEach(c -> System.out.println("Vowel: " + c + ", Index: " + characters.indexOf(c)));
		}
	
	public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target || (target> arr[mid-1] && target < arr[mid]))
                return mid;
            
            if (arr[mid] < target)
                return binarySearchRecursive(arr, target, mid + 1, right);
            else
                return binarySearchRecursive(arr, target, left, mid - 1);
        }
        
        return -1; // Target not found
    }
	
	public static void findTheIndexesOfThePatternInTheGivenString() {
		boolean flag = true;
		String pattern = "abcd";
		String matcher = "aabcdddabcddcbabcd";
		int length = (matcher.length()-pattern.length())+1;
		for(int i=0;i<length;i++) {
			flag = true;
			for(int j=0;j<pattern.length();j++) {
				if (pattern.charAt(j) != matcher.charAt(j+i)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(i);
			}
		}
	}
	
}
