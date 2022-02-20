// ######################################################################################
// Binary Tree Class
// ------------------------------------------------------
// Mark Barros
// CS2400 - Data Structures and Advanced Programming
// California State Polytechnic University: Spring 2021
// ######################################################################################

public class BinaryTree<T> implements BinaryTreeInterface<T> {
	
	// Data Field -----------------------------------------------------------------------
	
	private BinaryNode<T> root;
	
	// Constructors ---------------------------------------------------------------------
	
	// default constructor
	public BinaryTree() {
		root = null;
	}

	// data-parameterized constructor
	public BinaryTree(T rootData) {
		root = new BinaryNode<>(rootData);
		setTree(rootData);
	}

	// fully-parameterized constructor
	public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
		setTree(rootData, leftTree, rightTree);
	}
	
	// Accessors ------------------------------------------------------------------------

	// get data
	public T getRootData() {
		return root.getData();
	}

	// get root
	public BinaryNode<T> getRoot() {
		return root;
	}
	
	// Mutators -------------------------------------------------------------------------
	
	public void setTree(T rootData) {
		root = new BinaryNode<T>(rootData);
	}
		
	public void setTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
		root = new BinaryNode<T>(rootData);
		
		if((leftTree != null) && !leftTree.isEmpty())
			root.setLeftChild(leftTree.root);
		
		if((rightTree != null) && !rightTree.isEmpty()) {
			if(rightTree != leftTree)				
				root.setRightChild(rightTree.root);			
			else
				root.setRightChild(rightTree.root.copy());
		}
		
		if((leftTree != null) && (leftTree != this))
			leftTree.clear();
		
		if((rightTree != null && (rightTree != this)))
			rightTree.clear();
	}
	
	public void clear() {
		root = null;
	}
	
	// Status Methods -------------------------------------------------------------------

	// is empty?
	public boolean isEmpty() {
		return root == null;
	}
	
	// Methods --------------------------------------------------------------------------
	
	// Performs preorder traversal of a subtree rooted at a given node
	// (root-left-right traversal).
	public void Pre_Order_BTree(BinaryNode<T> node) {
		
		if(node != null) {
			System.out.print(node.getData());
			Pre_Order_BTree(node.getLeftChild());
			Pre_Order_BTree(node.getRightChild());
		}
	}

	// Performs inorder traversal of a subtree rooted at a given node
	// (left-root-right traversal).
	public void In_Order_BTree(BinaryNode<T> node) {
		
		if(node != null) {	
			In_Order_BTree(node.getLeftChild());
			System.out.print(node.getData());
			In_Order_BTree(node.getRightChild());
		}
	}
	
	// Performs postorder traversal of a subtree rooted at a given node
	// (left-right-root traversal).
	public void Post_Order_BTree(BinaryNode<T> node) {
		
		if(node != null) {	
			Post_Order_BTree(node.getLeftChild());
			Post_Order_BTree(node.getRightChild());
			System.out.print(node.getData());
		}
	}

	// Returns the number of nodes of a subtree rooted at a given node.
	public int GetNumberOfNodes_BTree(BinaryNode<T> node) {		
		int leftNumber = 0;
		int rightNumber = 0;
		
		if(node.hasLeftChild())
			leftNumber = GetNumberOfNodes_BTree(node.getLeftChild());
		
		if(node.hasRightChild())
			rightNumber = GetNumberOfNodes_BTree(node.getRightChild());
		
		return 1 + leftNumber + rightNumber;	
	}
	
	// Returns the height of a subtree rooted at a given node.
	public int GetHeight_BTree(BinaryNode<T> node) {		
			int height = 0;
			
			if(node != null)
				height = 1 + Math.max(GetHeight_BTree(node.getLeftChild()),
						 GetHeight_BTree(node.getRightChild()));
			
			return height;
	}
	
	// Returns the data of the left most node of a subtree rooted at a given node.
	public T GetLeftmostData_BTree(BinaryNode<T> node) {
		
		if(node.getLeftChild() == null)
			return node.getData();
		else
			return GetLeftmostData_BTree(node.getLeftChild());
		
	}
	
	// Returns the data of the right most node of a subtree rooted at a given node.
	public T GetRightmostData_BTree(BinaryNode<T> node) {
		
		if(node.getRightChild() == null)
			return node.getData();
		else
			return GetRightmostData_BTree(node.getRightChild());
		
	}
} // End of BinaryTree ##################################################################
