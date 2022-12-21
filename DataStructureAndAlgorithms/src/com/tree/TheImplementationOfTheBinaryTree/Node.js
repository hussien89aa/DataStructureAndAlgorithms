

/* Class containing left and right child of current

node and key value*/
class Node {

constructor(val) {
this.key = val;
this.left = null;
this.right = null;
}

}

// A javascript program to introduce Binary Tree
// Root of Binary Tree

var root = null;

/*create root*/

root = new Node(1);

/* following is the tree after above statement
1
/ \
null null */

root.left = new Node(2);

root.right = new Node(3);

/* 2 and 3 become left and right children of 1
1
/ \
2 3
/ \ / \
null null null null */

root.left.left = new Node(4);

/* 4 becomes left child of 2
1
/ \
2 3
/ \ / \
4 null null null
/ \
null null
*/
