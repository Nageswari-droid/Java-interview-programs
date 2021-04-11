package removeFriends;

import java.util.*;

class Node {
	Node next;
	int data;

	public Node(int data) {
		this.data = data;
	}
}

public class RemoveFrnds {

	Node head;
	int k = 3;
	int count = 1;

	public void insert(int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}

			current.next = new Node(data);
		}
	}

	public void remove() {

		Stack<Integer> stk = new Stack<>();

		Node current = head;

		if (head == null) {
			return;
		}

		while (count != k && current.next != null) {
			if (current.data < current.next.data) {
				stk.push(current.next.data);
				current = current.next;
				count++;
			} else {
				current = current.next;
			}
		}

		while (!stk.isEmpty()) {
			System.out.println(stk.pop());
		}
	}

//	public void printAll() {
//		Node current = head;
//
//		while (current != null) {
//			System.out.print(current.data + " ");
//			current = current.next;
//		}
//
//		System.out.println(" ");
//	}

	public static void main(String args[]) {
		int[] arr = { 23, 45, 11, 77, 18 };

		RemoveFrnds obj = new RemoveFrnds();

		for (int i = 0; i < arr.length; i++) {
			obj.insert(arr[i]);
		}

//		obj.printAll();
		obj.remove();

	}
}

//3 (testcase)
//3 1
//3 100 1
//5 2
//19 12 3 4 17
//5 3
//23 45 11 77 18

//100 1 
//19 12 17 
//77 18 