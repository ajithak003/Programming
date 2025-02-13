/**
 * 
 */
package praticeFile;

/**
 * 
 */
public class ImplementedSampleClass extends sampleAbstract implements InterfaceSample{

	
	public ImplementedSampleClass(String name) {
		super(name);
	}

	@Override
	public void print() {
         System.out.println("print extends sampleAbstract class abstract method");		
	}

	@Override
	public void printText() {
		System.out.println("printText interface method");
	}
	
	public static void main(String[] arg) {
		
		ImplementedSampleClass obj = new ImplementedSampleClass("Ajith");
		
		sampleAbstract obj1 = new ImplementedSampleClass("Ajithkumar");
		//implemented method calling
		System.out.println("implemented method calling start");
		obj.print();
		obj.printText();
		System.out.println("implemented method calling end");
		
		System.out.println("default un implemented method calling start");
		obj.add();
		obj.protectedShow();
		obj.publicShow();
		obj.Show();
		obj.setName("ajith");
	    System.out.println(obj.getName());
	    System.out.println(InterfaceSample.empName);
	    System.out.println(sampleAbstract.country);
	    System.out.println("default un implemented method calling end");
	    
	}
	
	

}
