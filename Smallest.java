import java.util.*;
import java.io.*;
import java.lang.Math;

public class Smallest {
	static int lowest = 0; //global var
	static int s = 0; //global var
	static int size = 0;
	
	public static void main(String[] args) {
		Scanner input;
		Node head = null;
		Node tail = null;
		
		try {
			input = new Scanner(new File("in.txt"));
			input.useDelimiter("\\s+\r?");
			
			while (input.hasNext()) {
				
					Node newNode = new Node();
					newNode.data = input.nextInt();
					
					if (size==0) {
						head = newNode;
						tail = newNode;
					} else {
						tail.next = newNode;
						tail = newNode;
					}
					size++;
			}
			
			lowest = min(head);
			int x = Math.min(Math.abs(findMin(head,0)), Math.abs(findMin(head.next, 0)));
			System.out.println(x);
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: File Not Found");
			e.printStackTrace();
		}
	}
	
	static int findMin(Node n, int s) {
		if (n == null) {
			return Math.abs(lowest);
		} 
		else if (n.data == 0) {
			return 0;
		}
		else if (Math.abs(n.data) < s) {
			s = n.data;
		} else {
			s += n.data;
		}
		if (Math.abs(s) < Math.abs(lowest)) {
			lowest = s;
		}		
		if (n.next != null) {
			n = n.next;
			return Math.min(Math.abs(findMin(n, s)), Math.abs(findMin(n.next, s)));
		}		
		return s;
	}
	
	static int min(Node n) {
		if ((n.next == null) || (n.data <= n.next.data)) {
			return n.data;
		} else { 
			return min(n.next);
		}
	}

	private static class Node {
		int data;
		Node next = null;
	}
}
