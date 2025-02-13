package praticeFile;

public interface InterfaceSample {
	
	public static final String empName = "Ajith";	
	
	/**
	 * only public, private, abstract, default, static and strictfp are permitted
	 * */
	void printText();
	
	default void add() {
		System.out.println("default add function callin static add method : ");
		System.out.println(InterfaceSample.add(3,8));
		InterfaceSample.showPrivateInterface();
	}

	static int add(int a , int b) {
		return a+b;
	}
	public static void main(String[] arg) {
		System.out.println("interface class main run");
		InterfaceSample.showPrivateInterface();
	}
	
	private static void showPrivateInterface() {
		System.out.println("static showPrivateInterface");
	}
}
