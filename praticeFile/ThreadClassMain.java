package praticeFile;

import java.util.ArrayList;

public class ThreadClassMain {
	
	public static void main(String arg[]) {
		try {
		System.out.println("main class start");
		ThreadClassExaple threadClassExaple =  new ThreadClassExaple();
		Thread thread1 = new Thread(threadClassExaple,"Thread 1");
		Thread thread2 = new Thread(threadClassExaple,"Thread 2");
		Thread thread3 = new Thread(threadClassExaple,"Thread 3");
		long startTime = System.currentTimeMillis();
		// thread2.setDaemon(true);
		thread1.start();
		
		try {
		thread1.interrupt();
		}catch(Exception e) { e.printStackTrace();}
		
		  try { thread1.join(); }catch(InterruptedException e) { e.printStackTrace(); }
		 
	      thread2.start();
			//Thread.sleep(1000);
			
			
			  try { thread3.join(); }catch(InterruptedException e) { e.printStackTrace(); }
			 
			 
			
			  thread3.start();
			  
			  try { thread1.join(); }catch(InterruptedException e) { e.printStackTrace();
			  }
			 
		
			/*
			 * System.out.println("Thred sleep start"); try { Thread.sleep(1000);
			 * }catch(InterruptedException e) { e.printStackTrace(); }
			 */
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Arraylist created");

		long endTime = System.currentTimeMillis();
		long diff = (endTime - startTime);
		System.out.println("Thread time difference : "+diff);
		System.out.println("Arraylist created");
		list.add("ajith");
		list.add("mani");
		list.add("bangalour");
		
		for(Object value : list) {
			System.out.println("list value : "+value);
		}
		
		System.out.println("main class end");
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
