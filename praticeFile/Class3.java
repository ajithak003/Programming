package praticeFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Class3 extends Class2{

	/**
	 * @param name
	 * @param population
	 */
	
	public Class3(String name, long population) {
		super(name, population);
		// TODO Auto-generated constructor stub
	}
	
	public int Class3(int a,int b) {
		return a+b;
	}
	

	public static void main(String arg[]) {
        List <String> linkedList = new LinkedList<>();
        Map <String, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap <String,String> treeMap = new TreeMap<>();
        TreeSet<String> treeSet = new TreeSet<>();
        LinkedHashSet<String>  linkedHashSet = new LinkedHashSet<String>(); 
        
		List<String> list = new ArrayList<>();
      
		list.add("vinoth");
		list.add("jayaganesh");
		list.add("ajith");
		list.add("mani");
		
		for (String value : list) {

			System.out.println("befor sort values: " + value);
		}
		Collections.sort(list);
		System.out.println();
		//list.forEach(System.out::println);
		
		list.stream().forEach((a)-> System.out.println("after sort values: "+a));
		
		
		Hashtable <String,String> hashTable = new Hashtable<>();
	       HashMap <String,String> hashMap = new HashMap<>();
	       
	       hashTable.put("1","");
	       hashTable.put("","mani");
	       hashTable.put("3","k");
	       System.out.println("hashTable: "+hashTable);
	       
	       hashMap.put(null,"Ajith");
	       hashMap.put(null,"mani");
	       hashMap.put("3",null);
	       System.out.println("hashMap: "+hashMap);    
	              
	      Class3 obj = new Class3("ajith", 10000);   
	      obj.ajith(2, 2);
	      System.out.println(obj.Class3(2,3));
	}
}