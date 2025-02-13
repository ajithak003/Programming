package zoho;

import java.util.Scanner;

public class ShortestTransformactionSeq {

	public static void main(String[] args) {
		
		String result  = shortestTransSeq();
		
		System.out.println("Result : "+result);
	}
		
/**
 * @return
 */
public static String shortestTransSeq() {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Give first word");
		String str1 = sc.next();
		str1 = str1.toUpperCase();
		
		System.out.println("Give second word");
		String str2 = sc.next();
		str2 = str2.toUpperCase();
		
		if(str1.length() != str2.length()) {
			return "give same length of character / words";
		}
		
		System.out.println("Give word array sepate , between each word");
		String strWords = sc.next() ;
		strWords = strWords.toUpperCase();
		String[] words = strWords.split(",");
		for(String word :words) {
			if(str1.length() != word.length()) {
				return "give same length of character / words";
			}
		System.out.println(word);
		} 
		int transformationSeq = 0;
		
		for(int i=0 ; i<str2.length(); i++) {
			
			String transWord = tansformWord(words, str1, str2, i);
			for(String wrd : words) {
				if(transWord.equals(wrd)) {
					System.out.println("word : "+transWord);
					str1 = transWord.toString();
					transformationSeq++;
				}
			
			
		}
			
		}
		if(transformationSeq>0)
		return "Transformation Sequences : "+transformationSeq;
		else
			return "Transformation Sequences : "+(-1);
	}

private static String tansformWord(String[] words, String str1, String str2, int num) {
	
		char[] str1Arr = str1.toCharArray();
		StringBuffer word = new StringBuffer();
		if(str1Arr[num] != str2.charAt(num)) {
		str1Arr[num] = str2.charAt(num);
		for(char c : str1Arr) {
			word.append(c);
		}
		}else {
			return "";
		}
		
	
	
	return word.toString();
	
}
	
}

//most,miss,mist,list
//oohz,zooh,zilo,loho,ooho,ohoo,zozo
