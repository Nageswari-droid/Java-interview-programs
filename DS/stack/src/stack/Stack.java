package stack;

class Node {
	Node next;
	int data;

	public Node(int data) {
		this.data = data;
	}
}

public class Stack {
	Node top;

	public boolean isEmpty() {
		return top == null;
	}

	public int peek() {
		return top.data;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		if (top != null) {
			newNode.next = top;
		}
		top = newNode;
	}
	
	public void pop() {
		if(top == null) {
			return;
		}
		
		int data = top.data;
		top = top.next;
		System.out.println(data);
	}
	
	public void printAll() {
		Node current = top;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.println(" ");
	}
	
	public static void main(String args[]) {
		Stack obj = new Stack();
		
		obj.push(5);
		obj.push(6);
		obj.push(7);
		obj.push(2);
		obj.push(1);
		obj.push(10);

		obj.printAll();

		obj.push(20);
		obj.push(40);
		obj.push(60);

		obj.printAll();
		
		obj.pop();
		obj.pop();
		
		obj.printAll();
	}
}
