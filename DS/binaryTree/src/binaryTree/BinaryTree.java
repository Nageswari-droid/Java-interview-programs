package binaryTree;

public class BinaryTree {
	static class Node {
		Node left, right;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	public void insert(Node node, int data) {
		if (data < node.data) {
			if (node.left == null) {
				node.left = new Node(data);
			} else {
				insert(node.left, data);
			}
		} else {
			if (node.right == null) {
				node.right = new Node(data);
			} else {
				insert(node.right, data);
			}
		}
	}

	public void inorderTraversal(Node node) {
		if (node != null) {
			inorderTraversal(node.left);
			System.out.print(node.data + " ");
			inorderTraversal(node.right);
		}
	}

	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		Node node = new Node(5);
		tree.insert(node, 2);
		tree.insert(node, 4);
		tree.insert(node, 1);
		tree.insert(node, 3);
		tree.insert(node, 6);
		tree.insert(node, 7);
		tree.insert(node, 8);

		tree.inorderTraversal(node);
	}
}
