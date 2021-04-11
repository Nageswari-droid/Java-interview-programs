package reverseLinkedList;

class Node {
	Node next;
	int data;

	public Node(int data) {
		this.data = data;
	}
}

public class ReverseList {

	Node head;

	public void append(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}

		Node current = head;

		while (current.next != null) {
			current = current.next;
		}

		current.next = new Node(data);
	}

	public void printList() {
		Node current = head;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.println(" ");
	}

	public void reverse() {
		if (head == null) {
			return;
		}

		Node current = head;
		StackClass obj = new StackClass();
		while (current != null) {
			obj.push(current.data);
			current = current.next;
		}
		
		obj.printAll();
	}

	public static void main(String args[]) {
		int arr[] = { 2, 18, 24, 3, 5, 7, 9, 6, 12 };

		ReverseList obj = new ReverseList();

		for (int i = 0; i < arr.length; i++) {
			obj.append(arr[i]);
		}

		obj.printList();
		obj.reverse();
	}
}
