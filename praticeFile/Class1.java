package praticeFile;

public class Class1 implements Comparable<Object>{
	 
	    String name;  
	    long population;  
	 
	    public Class1(String name, long population) {  
	        super();  
	        this.name = name;  
	        this.population = population;  
	    }  
	    public String getName() {  
	        return name;  
	    }  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	    public long getPopulation() {  
	        return population;  
	    }  
	    public void setPopulation(long population) {  
	        this.population = population;  
	    }
	    public int compareTo(Class1 o) {
			return (this.population < o.population)? -1: (this.population > o.population)? 1:0;
		}
		@Override
		public int compareTo(Object o) {
			return (this.population < ((Class1) o).getPopulation())? -1: (this.population > ((Class1) o).getPopulation())? 1:0;

		}
		
		public void ajith(int a, double b) {
			System.out.println("class 1");
		}
	
	    
	 
	}  
	 


