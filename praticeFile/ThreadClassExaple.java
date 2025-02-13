package praticeFile;

public class ThreadClassExaple implements Runnable{

	@Override
	public void run() {
		//System.out.println("thread class start");
		 //System.out.println(Thread.currentThread().getName()+" Start");
		
		
		 try { System.out.println(Thread.currentThread().getName()+" Start");
		 //Thread.sleep(4000); //ThreadFunction();
		
		 System.out.println(Thread.currentThread().getName()+" end"); }catch(Exception
		 e) { e.printStackTrace(); }
		 
		
	}
	
	public void ThreadFunction() {
		
		int a = 10;
		int b = 20;
		
		System.out.println("sum of two numbers : "+ (a+b));
	}
	/*
	 * public static void main(String aru[]) { System.out.println("start");
	 * ThreadClassExaple obj1 = new ThreadClassExaple(); ThreadClassExaple obj2 =
	 * new ThreadClassExaple(); obj1.start(); obj2.start(); }
	 */
}
