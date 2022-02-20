// #############################################################################################
// Client Program that Constructs a Binary Tree and Demonstrates both Tree- and
// Node-Level Recursive Methods.
// ------------------------------------------------------
// Mark Barros
// CS2400 - Data Structures and Advanced Programming
// California State Polytechnic University: Spring 2021
// #############################################################################################

public class ClientProgram {
	
	public static void main(String [] args) {
		
		// Header ------------------------------------------------------------------------------

		System.out.println("\n...............................................................");
		System.out.println("Binary Tree Structure and its Representations");
		System.out.println("........................................................");
		System.out.println("By Mark Barros");
		System.out.println("CS2400 - Data Structures and Advanced Programming");
		System.out.println("California State Polytechnic University - Sprint 2021");
		System.out.println("...............................................................");
				
		// Hard-Coding of Tree Structure -------------------------------------------------------
		
		BinaryTree<String> D_Node = new BinaryTree<String>("D",
				new BinaryTree<String>("F"), new BinaryTree<String>());
		BinaryTree<String> E_Node = new BinaryTree<String>("E",
				new BinaryTree<String>("G"), new BinaryTree<String>("H"));
		BinaryTree<String> C_Node = new BinaryTree<String>("C", D_Node, E_Node);
		BinaryTree<String> clientTree = new BinaryTree<String>("A",
				new BinaryTree<String>("B"), C_Node);
		
		// Demonstrations of Tree-Level Methods ------------------------------------------------

		// Section 1
		System.out.print("What follows are demonstrations of the tree-level methods:\n\n");
		
		System.out.print("The result of Pre_Order_BTree(): ");
		clientTree.Pre_Order_BTree(clientTree.getRoot());
		System.out.println();
		
		System.out.print("The result of In_Order_BTree(): ");
		clientTree.In_Order_BTree(clientTree.getRoot());
		System.out.println();
		
		System.out.print("The result of Post_Order_BTree(): ");
		clientTree.Post_Order_BTree(clientTree.getRoot());
		System.out.println();
		
		System.out.println("The result of GetNumberOfNodes_BTree(): "
				+ clientTree.GetNumberOfNodes_BTree(clientTree.getRoot()));
		
		System.out.println("The result of GetHeight(): "
				+ clientTree.GetHeight_BTree(clientTree.getRoot()));
		
		System.out.println("The result of GetLeftmostData_BTree(): "
				+ clientTree.GetLeftmostData_BTree(clientTree.getRoot()));
		System.out.println("The result of GetRightmostData_BTree(): "
				+ clientTree.GetRightmostData_BTree(clientTree.getRoot()));
			
		// Demonstrations of Node-Level Methods ------------------------------------------------

		// Section 2
		System.out.println("...............................................................");
		System.out.print("What follows are demonstrations of the node-level methods:\n\n");
		
		System.out.print("The result of Pre_Order_BNode(): ");
		clientTree.getRoot().Pre_Order_BNode();
		System.out.println();
		
		System.out.print("The result of In_Order_BNode(): ");
		clientTree.getRoot().In_Order_BNode();
		System.out.println();
		
		System.out.print("The result of Post_Order_BNode(); ");
		clientTree.getRoot().Post_Order_BNode();
		System.out.println();
		
		System.out.println("The result of GetNumberOfNodes_BNode(): "
				+ clientTree.getRoot().GetNumberOfNodes_BNode());
		
		System.out.println("The result of GetHeight(): "
				+ clientTree.getRoot().GetHeight());
		
		System.out.println("The result of GetLeftmostData_BNode(): "
				+ clientTree.getRoot().GetLeftmostData_BNode());
		System.out.println("The result of GetRightmostData_BNode(): "
				+ clientTree.getRoot().GetRightmostData_BNode());

		// Section 3
		System.out.println("...............................................................");
		System.out.println("What follows are demonstrations of calling from Node C");
		System.out.println("the node-level methods:\n");

		System.out.print("The result of calling Pre_Order_BNode() from Node C: ");
		clientTree.getRoot().getRightChild().Pre_Order_BNode();
		System.out.println();
		
		System.out.print("The result of calling In_Order_BNode() from Node C: ");
		clientTree.getRoot().getRightChild().In_Order_BNode();
		System.out.println();
		
		System.out.print("The result of calling Post_Order_BNode() from Node C: ");
		clientTree.getRoot().getRightChild().Post_Order_BNode();
		System.out.println();
		
		System.out.println("The result of calling GetNumberOfNodes_BNode() from Node C: "
				+ clientTree.getRoot().getRightChild().GetNumberOfNodes_BNode());
		
		System.out.println("The result of calling GetHeight() from Node C: "
				+ clientTree.getRoot().getRightChild().GetHeight());
		
		System.out.println("The result of calling GetLeftmostData_BNode() from Node C: "
				+ clientTree.getRoot().getRightChild().GetLeftmostData_BNode());
		System.out.println("The result of calling GetRightmostData_BNode() from Node C: "
				+ clientTree.getRoot().getRightChild().GetRightmostData_BNode());
				
		// Footer ------------------------------------------------------------------------------

		System.out.println("...............................................................");
		
	}
} // End of ClientProgram class. ###############################################################
