package reverseLinkedList;

class StackNode {
	StackNode next;
	int data;

	public StackNode(int data) {
		this.data = data;
	}
}

public class StackClass {

	StackNode top;

	public boolean isEmpty() {
		return top == null;
	}

	public void push(int data) {
		StackNode newNode = new StackNode(data);

		if (top == null) {
			top = newNode;
			return;
		}

		newNode.next = top;
		top = newNode;
	}

	public void printAll() {
		StackNode current = top;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
}
