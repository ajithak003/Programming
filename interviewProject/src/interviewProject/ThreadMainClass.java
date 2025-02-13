package interviewProject;

public class ThreadMainClass {

	public static void main(String[] args) {
		
		float num1 = 12.0f;
		float num2 = 2.0f;

		Runnable addition = new ArithamaticOperationThreadClass(num1, num2,"addition");
		Runnable sub = new ArithamaticOperationThreadClass(num1, num2,"subtraction");
		Runnable multi = new ArithamaticOperationThreadClass(num1, num2,"multification");
		Runnable division = new ArithamaticOperationThreadClass(num1, num2,"division");
		
		Thread t1 = new Thread(addition);
		t1.setName("AdditionThread");
		Thread t2 = new Thread(sub);
		Thread t3 = new Thread(multi);
		Thread t4 = new Thread(division);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
