package interviewProject;

public class ArithamaticOperationThreadClass implements Runnable{
	
	
	float num1, num2;
	String operation;
	

	public ArithamaticOperationThreadClass(float  num1, float num2, String operation) {
		this.num1 = num1;
		this.num2 = num2;
		this.operation = operation;
	}

	@Override
	public void run() {
		
		if(operation.equalsIgnoreCase("addition")) {
			System.out.println("Addition : "+(num1+num2)+" : "+Thread.currentThread().getName());
		}else if(operation.equalsIgnoreCase("subtraction")) {
			System.out.println("Subtraction : "+(num1-num2)+" : "+Thread.currentThread().getName());
		}else if(operation.equalsIgnoreCase("multification")) {
			System.out.println("Multification : "+(num1*num2)+" : "+Thread.currentThread().getName());
		}else if(operation.equalsIgnoreCase("division")) {
			if(num2 != 0) {
			System.out.println("Division : "+(num1/num2)+" : "+Thread.currentThread().getName());
		}else {
			System.out.println("number can not be divisible by zero");
		}
		}
		
	}

}
