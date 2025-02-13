package praticeFile.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.lang.*;

public class ShotedArrayTOBTS {
	static Node root;
	
	public static void main(String[] args) {
		
		int arr[] = new int[]{27,4,764,78,8839,37,794,3783,664,9};
		//int arr[] = new int[] {1,2,3,4,5,6,7};
		System.out.println("Before sort : "+ Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sort : "+ Arrays.toString(arr));
		int end = arr.length-1;
		System.out.println("end : "+end/2);
		root = ShotedArrayTOBTS.sortedArrayTOBynaryTree(arr, 0, end);
		System.out.println("BTS node values print");
        preOrder(root);
	}
	
	public static void preOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public static Node sortedArrayTOBynaryTree(int arr[], int start,int end) {
		
		if(start > end) {
			return null;
		}
		System.out.println("start: "+start+" : end : "+end);
		int mid = (start+end)/2;
		System.out.println("end : "+mid+" mid val : "+arr[mid]);
		Node node = new Node(arr[mid]);
		
		node.left = sortedArrayTOBynaryTree(arr,start,mid-1);
		
		node.right = sortedArrayTOBynaryTree(arr, mid+1, end);
		
		return node;
	}

}

class Node {
	int data;
	Node left, right ;
	
	Node(int d) {
		data = d ;
		left = right = null;
	}
}