// ###########################################################################################
// Binary Tree Interface
// ------------------------------------------------------
// Mark Barros
// CS2400 - Data Structures and Advanced Programming
// California State Polytechnic University: Spring 2021
// ###########################################################################################

public interface BinaryTreeInterface<T> {
	
	/** Performs preorder traversal of a subtree rooted at a given node.
	 * @param node The node from which to start the preorder traversal. */
	public void Pre_Order_BTree(BinaryNode<T> node);
	
	/** Performs inorder traversal of a subtree rooted at a given node.
	 * @param node The node from which to start the preorder traversal. */
	public void In_Order_BTree(BinaryNode<T> node);
	
	/** Performs postorder traversal of a subtree rooted at a given node.
	 * @param node The node from which to start the preorder traversal. */
	public void Post_Order_BTree(BinaryNode<T> node);
	
	/** Determines the number of nodes in the binary tree.
	 * @param node The current node being used to calculate the number of nodes in the tree.
	 * @return int The number of nodes in the tree. */
	public int GetNumberOfNodes_BTree(BinaryNode<T> node);
	
	/** Determines the height of the binary tree.
	 * @param node The current node being used to calculate the height of the tree.
	 * @return int The height of the tree. */
	public int GetHeight_BTree(BinaryNode<T> node);
	
	/** Gets the data in the leftmost node of the binary tree.
	 * @param node The current node from which to traverse towards the leftmost node. 
	 * @return <T> The data in the leftmost node of the binary tree */
	public T GetLeftmostData_BTree(BinaryNode<T> node);
	
	/** Gets the data in the rightmost node of the binary tree.
	 * @param node The current node from which to traverse towards the rightmost node.
	 * @return <T> The data in the rightmost node of the binary tree */
	public T GetRightmostData_BTree(BinaryNode<T> node);
	
	// Other Methods -------------------------------------------------------------------------
	
	/** Sets this binary tree to a new one-node binary tree.
	@param rootData The object that is the data for the new tree's root. */
	public void setTree(T rootData);
	
	/** Sets up the tree structure.
	 * @param rootData The data to be stored in the root node.
	 * @param leftTree The left subtree structure.
	 * @param rightTree The right subtree structure. */	
	public void setTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree);
	
	/** Determines if the node has children. 
	 * @return True If the node does not have children. */	
	public boolean isEmpty();
	
	/** Clears the root node's data value. */
	public void clear();
	
	/** Gets the data in the tree's root node.
	 * @return <T> The data in the tree's root node. */
	public T getRootData();
	
	/** Gets a reference to the root node's data.
	 * @return <T> The reference to the root node's data. */
	public BinaryNode<T> getRoot();
	
} // End of Interface. #######################################################################
