package interviewProject;

public class InterviewQuestion {
		public static void main(String[] args){
		Y y = new Y();
		System.out.println("L5 : "+y.i); //L5 2
		
		}
}

class X {
	static int i = 1111;
	 
	static{
	i = i-- - --i; //L1 1111 - 1110 = 1
	System.out.println("L1 : "+i);
	}
	 
	static void sdvhdjs() {
		System.out.println("Static Method Called XXX ");
	}
	{
	i = i++ + ++i; //L2  1 + 2 = 3
	System.out.println("L2 : "+i);
	}
	}
	 
	class Y extends X{
	static{
	i = --i - i--; //L3  2 - 2 = 0
	System.out.println("L3 : "+i);
	}
	static void sdvhdjs() {
		System.out.println("Static Method Called YY ");
	}

	{
	i = ++i + i++; //L4    2
	System.out.println("L4 : "+i);
	}
	}
