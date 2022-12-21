// JavaScript program to
// demonstrate searching operation
// in binary search tree without recursion

class Node {
	constructor() {
		this.data = 0;
		this.left = null;
		this.right = null;
	}
}

	// Function to check the given key exist or not
	function iterativeSearch(root , key)
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
			// if the key is found return 1
				return true;
		}
		return false;
	}

	// A utility function to create a new BST Node
	function newNode(item)
	{
		var temp = new Node();
		temp.data = item;
		temp.left = temp.right = null;
		return temp;
	}

	/* A utility function to insert a new Node with
given key in BST */
	function insert(Node , data)
	{
		/* If the tree is empty, return a new Node */
		if (Node== null)
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
	
		/* Let us create following BST
			50
			/ \
		30 70
		/ \ / \
	20 40 60 80 */
		var root = null;
		root = insert(root, 50);
		insert(root, 30);
		insert(root, 20);
		insert(root, 40);
		insert(root, 70);
		insert(root, 60);
		insert(root, 80);
		if (iterativeSearch(root, 15))
			document.write("YES");
		else
			document.write("NO");
			
// This code is contributed by todaysgaurav


/*
Output
No
Time Complexity: O(h), here h is the height of the BST.
Auxiliary Space: O(1), as constant extra space is used.
*/