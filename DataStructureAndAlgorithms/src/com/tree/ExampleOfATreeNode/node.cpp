// Use any below method to implement Nodes of tree

// Method 1: Using "struct" to make
// user-define data type
struct node {
	int data;
	struct node* left;
	struct node* right;
};

// Method 2: Using "class" to make
// user-define data type
class Node {
public:
	int data;
	Node* left;
	Node* right;
};
