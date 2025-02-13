package stack;

public class Main {

	public static void main(String[] args) {

		Stack number = new Stack();
		number.push(10);
		number.show();
		number.push(20);
		number.show();
		number.push(30);
		number.show();
		number.push(40);
		number.show();
		number.push(50);
		number.show();
		System.out.println("\nsize of the stack : " + number.size());
		
		number.peek();
		number.show();
		number.peek();
		number.show();
		number.pop();
		number.show();
		number.pop();
		number.show();
		
		//System.out.println("\npeek of the stack : " + number.peek());

		//System.out.println("\npop the element : " + number.pop());
		//number.show();

		//System.out.println("\npeek of the stack : " + number.peek());
		//System.out.println("\nsize of the stack : " + number.size());

	}

}
