
public class BinaryTree {
	static class Node {
		Node left, right;
		int data;

		public Node(int data) {
			this.data = data;
		}
	}

	public void insert(Node node, int value) {
		if (value < node.data) {
			if (node.left != null) {
				insert(node.left, value);
			} else {
				node.left = new Node(value);
			}
		} else {
			if (node.right != null) {
				insert(node.right, value);
			} else {
				node.right = new Node(value);
			}
		}
	}

	public void traverse(Node node) {
		if (node != null) {
			traverse(node.left);
			System.out.print(node.data + " ");
			traverse(node.right);
		}
	}

	public static void main(String args[]) {
		Node node = new Node(5);
		BinaryTree obj = new BinaryTree();
		obj.insert(node, 2);
		obj.insert(node, 4);
		obj.insert(node, 3);
		obj.insert(node, 1);
		obj.insert(node, 6);

		obj.traverse(node);
	}
}
