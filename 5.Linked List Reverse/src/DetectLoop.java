import java.util.*;

public class DetectLoop {
	Node head;

	class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
		}
	}

	public void insert(int value) {
		if (head == null) {
			head = new Node(value);
		} else {
			Node current = head;

			while (current.next != null) {
				current = current.next;
			}

			current.next = new Node(value);
		}
	}

	public boolean detect() {

		ArrayList<Node> nodeList = new ArrayList<>();
		Node current = head;

		while (current != null) {
			if (nodeList.contains(current)) {
				return true;
			}

			nodeList.add(current);
			current = current.next;
		}

		return false;
	}

	public void deleteWithoutHead(int value, Node current) {
		while (current.next != null) {
			if (current.next.data == value) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

	public Node reverse() {
		Node prev = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = prev;
		return head;
	}

	public void print() {
		Node current = head;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		DetectLoop obj = new DetectLoop();
		obj.insert(2);
		obj.insert(1);
		obj.insert(7);
		obj.insert(4);
		obj.insert(5);

		obj.print();

//		obj.head.next.next.next.next = obj.head;

		if (obj.detect()) {
			System.out.println("Loop detected");
		} else {
			System.out.println("Loop not detected");
		}

		obj.deleteWithoutHead(4, obj.head.next);

		obj.print();

		obj.reverse();
		
		obj.print();
	}
}
