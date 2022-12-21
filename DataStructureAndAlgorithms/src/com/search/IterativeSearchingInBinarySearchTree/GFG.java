
import java.util.*;

// Java program to demonstrate searching operation
// in binary search tree without recursion 

class GFG {

	static class Node {
		int data;
		Node left, right;
	};

	// Function to check the given key exist or not
	static boolean iterativeSearch(Node root, int key)
	{
		// Traverse until root reaches to dead end
		while (root != null) {
			// pass right subtree as new tree
			if (key > root.data)
				root = root.right;

			// pass left subtree as new tree
			else if (key < root.data)
				root = root.left;
			else
				return true; // if the key is found return 1
		}
		return false;
	}

	// A utility function to create a new BST Node
	static Node newNode(int item)
	{
		Node temp = new Node();
		temp.data = item;
		temp.left = temp.right = null;
		return temp;
	}

	/* A utility function to insert a new Node with
given key in BST */
	static Node insert(Node Node, int data)
	{
		/* If the tree is empty, return a new Node */
		if (Node == null)
			return newNode(data);

		/* Otherwise, recur down the tree */
		if (data < Node.data)
			Node.left = insert(Node.left, data);
		else if (data > Node.data)
			Node.right = insert(Node.right, data);

		/* return the (unchanged) Node pointer */
		return Node;
	}

	// Driver code
	public static void main(String args[])
	{
		/* Let us create following BST
			50
			/ \
		30 70
		/ \ / \
	20 40 60 80 */
		Node root = null;
		root = insert(root, 50);
		insert(root, 30);
		insert(root, 20);
		insert(root, 40);
		insert(root, 70);
		insert(root, 60);
		insert(root, 80);
		if (iterativeSearch(root, 15))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}

// This code is contributed by Arnab Kundu

/*
Output
No
Time Complexity: O(h), here h is the height of the BST.
Auxiliary Space: O(1), as constant extra space is used.
*/