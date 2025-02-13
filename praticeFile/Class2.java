package praticeFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class Class2 extends Class1{


	public Class2(String name, long population) {
		super(name, population);
		// TODO Auto-generated constructor stub
	}
	static int add;
	public static void dfdk() {
		 add = 10;
		 System.out.println("add static variable values : "+add);
	}
	@Override
	public void ajith(int a, double b) {
		int c =10;
		System.out.println("class 2");
	}
	
		public static void main(String[] args)
	    {
	    	Class1 india=new Class1("India",1000);  
	    	Class1 japan=new Class1("Japan",10000);  
	 
	    	Class1 france=new Class1("France",2000);  
	    	Class1 russia=new Class1("Russia",20000);  
	 
	        HashMap<Class1, String> countryCapitalMap=new HashMap<Class1,String>();  
	        countryCapitalMap.put(india,"Delhi");  
	        countryCapitalMap.put(japan,"Tokyo");  
	        countryCapitalMap.put(france,"Paris");  
	        countryCapitalMap.put(russia,"Moscow");  
	        
	        List list = new ArrayList();
	        list.add(india);
	        list.add(japan);
	        list.add(france);
	        list.add(russia);
	        list.add(japan);
	        
	        List name = new ArrayList();
	        name.add(russia);
	        name.add(india);
	        name.add(japan);
	        name.add(france);
	        name.add(japan);
	        
	        for( Object val : list) {
	        	
	        	System.out.println("befor sort list :"+((Class1) val).getName());
	        }
	        Collections.sort(list); 
	        System.out.println();
              for( Object val : list) {
	        	
	        	System.out.println("after sort list :"+((Class1) val).getName());
	        }
              System.out.println();
              for( Object val : name) {
  	        	
  	        	System.out.println("befor sort name :"+((Class1) val).getName());
  	        }
              System.out.println();
              Collections.sort(name,new Comparator() { 
			@Override
			public int compare(Object o1, Object o2) {
				return ((Class1) o1).getName().compareTo(((Class1) o2).getName());
			}
              });
              
              for( Object val : name) {
  	        	
  	        	System.out.println("after sort name :"+((Class1) val).getName());
  	        }
	 
	        System.out.println("Sorting HashMap by passing it to TreeMap constructor");
	        TreeMap<Class1,String> sortedTreeMapCountryCapital=new  TreeMap<Class1,String> (countryCapitalMap);
	        Iterator countryCapitalIter=sortedTreeMapCountryCapital.keySet().iterator();//put debug point at this line  
	        while(countryCapitalIter.hasNext())  
	        {  
	        	Class1 countryObj=(Class1) countryCapitalIter.next();  
	            String capital=countryCapitalMap.get(countryObj);  
	            System.out.println(countryObj.getName()+"----"+capital);  
	        } 
	        
	        Class2.dfdk();
	    }  
	
	}
