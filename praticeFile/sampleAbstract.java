/**
 * 
 */
package praticeFile;

public abstract class sampleAbstract {
	
	public static void main(String[] arg) {
		System.out.println("abstract class main method run");
	}
	public sampleAbstract() {
		System.out.println("sampleAbstract super constractor calling");
	}
	public sampleAbstract(String name) {
		this.name = name;
		System.out.println("sampleAbstract paramerterized constractor calling"+name);
	}


	private String name;
	static String country;
	
	static {
		country = "india";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void print();
	
	public void publicShow() {
		System.out.println("public access modifier method");
	}
	protected void protectedShow() {
		System.out.println("protected access modifier method");
	}
	private void privateShow() {
		System.out.println("private access modifier method");
	}
	void Show() {
		System.out.println("default access modifier method");
	}

}
