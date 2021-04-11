package linkedList;

class Node {
	Node next;
	int data;

	public Node(int data) {
		this.data = data;
	}
}

public class LinkedList {

	Node head;

	public void append(int data) {
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

	public void prepend(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}

	public void delete(int data) {
		if (head == null) {
			return;
		}
		
		if(head.data == data) {
			head = head.next;
			return;
		}

		Node current = head;
		while (current != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}

	}

	public void printAll() {
		Node current = head;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.println(" ");
	}

	public static void main(String args[]) {
		LinkedList obj = new LinkedList();
		obj.append(5);
		obj.append(6);
		obj.append(7);
		obj.append(2);
		obj.append(1);
		obj.append(10);

		obj.printAll();

		obj.prepend(20);
		obj.prepend(40);
		obj.prepend(60);

		obj.printAll();
		
		obj.delete(10);
		obj.delete(60);
		
		obj.printAll();
	}
}
