package queue;

class Node{
	Node next;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}

public class Queue {
	
	Node front;
	Node rear;
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public int peek() {
		return front.data;
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(front == null) {
			front = newNode;
		}
		else if(rear != null) {
			rear.next = newNode;
		}
		
		rear = newNode;
	}
	
	public int remove() {
		
		int data = front.data;
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
		
		return data;
		
	}
	
	public void printAll() {
		Node current = front;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.println(" ");
	}
	
	public static void main(String args[]) {
		Queue obj = new Queue();
		obj.add(5);
		obj.add(6);
		obj.add(7);
		obj.add(2);
		obj.add(1);
		obj.add(10);

		obj.printAll();

		obj.add(20);
		obj.add(40);
		obj.add(60);

		obj.printAll();
		
		obj.remove();
		obj.remove();
		
		obj.printAll();
		
		System.out.println(obj.isEmpty());
	}
}
