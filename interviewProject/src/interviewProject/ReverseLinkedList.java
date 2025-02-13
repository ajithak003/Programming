package interviewProject;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			data = this.data;
		}
		
	}
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Before Change : "+list);
		int j =0;
		int length = list.size()/2;
		for(int i =0; i<length; i++) {
		     int temp = list.get(j);
		     list.set(j, list.get(j+1));
		     list.set(j+1, temp);
		     j+=2;
		     
		}
		System.out.println("After Change : "+list);
		
	}


	
	
}
