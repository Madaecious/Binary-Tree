// ######################################################################################
// Binary Node Class
// ------------------------------------------------------
// Mark Barros
// CS2400 - Data Structures and Advanced Programming
// California State Polytechnic University: Spring 2021
// ######################################################################################

public class BinaryNode<T> {
	
	// Data Fields ----------------------------------------------------------------------
	
	private T data;
	private BinaryNode<T> leftChild;
	private BinaryNode<T> rightChild;
	
	// Constructors ---------------------------------------------------------------------

	// non-parameterized constructor
	public BinaryNode() {
		this(null);
	}

	// data-only parameterized constructor
	public BinaryNode(T dataPortion) {
		this(dataPortion, null, null);
	}

	// fully-parameterized constructor
	public BinaryNode(T dataPortion, BinaryNode<T> newLeftChild,
					  BinaryNode<T> newRightChild) {
		data = dataPortion;
		leftChild = newLeftChild;
		rightChild = newRightChild;
	}

	// copy method
	public BinaryNode<T> copy() {
		BinaryNode<T> newRoot = new BinaryNode<>(data);
		
		if(leftChild != null)
			newRoot.setLeftChild(leftChild.copy());
		
		if(rightChild != null)
			newRoot.setRightChild(rightChild.copy());
		
		return newRoot;
	}
	
	// Accessors ------------------------------------------------------------------------

	// get data
	public T getData() {
		return data;
	}

	// get left child
	public BinaryNode<T> getLeftChild() {
		return leftChild;
	}

	// get right child
	public BinaryNode<T> getRightChild() {
		return rightChild;
	}
	
	// Mutators -------------------------------------------------------------------------

	// set data
	public void setData(T dataPortion) {
		data = dataPortion;
	}

	// set left child
	public void setLeftChild(BinaryNode<T> newLeftChild) {
		leftChild = newLeftChild;
	}

	// set right child
	public void setRightChild(BinaryNode<T> newRightChild) {
		rightChild = newRightChild;
	}
	
	// Status Methods -------------------------------------------------------------------
	
	// is leaf?
	public boolean isLeaf() {
		return (leftChild == null) && (rightChild == null);
	}

	// has left child?
	public boolean hasLeftChild() {
		return leftChild != null;
	}

	// has right child?
	public boolean hasRightChild() {
		return rightChild != null;
	}
	
	// Project-Required Methods ---------------------------------------------------------
	
	// This method performs preorder traversal of a subtree rooted at a BinaryNode
	// object who calls the method (root-left-right traversal).
	public void Pre_Order_BNode() {
		System.out.print(data);
		
		if(hasLeftChild())
			leftChild.Pre_Order_BNode();
		
		if(hasRightChild())
			rightChild.Pre_Order_BNode();
		
	}
	
	// This method performs inorder traversal of a subtree rooted at a BinaryNode
	// object who calls the method. (left-root-right traversal)
	public void In_Order_BNode() {
		
		if(hasLeftChild())
			leftChild.In_Order_BNode();
		
		System.out.print(data);
		
		if(hasRightChild())
			rightChild.In_Order_BNode();
		
	}
	
	// This method performs postorder traversal of a subtree rooted at a BinaryNode
	// object who calls the method. (left-right-root traversal)
	public void Post_Order_BNode() {
		
		if(hasLeftChild())
			leftChild.Post_Order_BNode();
		
		if(hasRightChild())
			rightChild.Post_Order_BNode();
		
		System.out.print(data);
	}

	// This method returns the number of nodes of a subtree rooted at a BinaryNode
	// object who calls the method.
	public int GetNumberOfNodes_BNode() {
		int leftNumber = 0;
		int rightNumber = 0;
		
		if(hasLeftChild())
			leftNumber = leftChild.GetNumberOfNodes_BNode();
		
		if(hasRightChild())
			rightNumber = rightChild.GetNumberOfNodes_BNode();
		
		return 1 + leftNumber + rightNumber;
	}
	
	// This method returns the height of a subtree rooted at a BinaryNode object
	// who calls the method.
	public int GetHeight_BNode(BinaryNode<T> node) {		
		int height = 0;
		
		if(node != null)
			height = 1 + Math.max(GetHeight_BNode(node.getLeftChild()),
					 GetHeight_BNode(node.getRightChild()));
		
		return height;
	}
	
	// This method returns the height of a subtree rooted at a BinaryNode
	// object who calls the method (initial, non-parameterized)
	public int GetHeight() {
		return GetHeight_BNode(this);
	}
	
	// This method returns the data of the left most node of a subtree rooted at a
	// BinaryNode object who calls the method.
	public T GetLeftmostData_BNode() {
		
		if(leftChild == null)
			return data;
		else
			return leftChild.GetLeftmostData_BNode();
		
	}
	
	// This method returns the data of the right most node of a subtree rooted at a
	// BinaryNode object who calls the method.
	public T GetRightmostData_BNode() {
		
		if(rightChild == null)
			return data;
		else
			return rightChild.GetRightmostData_BNode();
		
	}

} // End of BinaryNode ##################################################################
