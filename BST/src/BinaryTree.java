/*
 *Daniel Cancelmo
 *Lab 8
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

@SuppressWarnings({ "rawtypes", "unchecked" })
public class BinaryTree implements BST {
	
	private MyTreeNode root;
	
	public BinaryTree() {	
	}

	//Inserts entry into BST at correct location. No duplicates.
	@Override
	public void insert(Comparable entry) {
		//Checks if entry is already in tree. Will not insert if true.
		if (lookup(entry) == true) {
			System.out.println("Duplicate value of: " + entry + " not entered.");
			return;
		}
		//If no data in root. Places data in root.
		if (root == null) root = new MyTreeNode(entry);
		else {
			//Creates new node with entry as data and finds the correct place for it in the tree and places it.
			MyTreeNode newNode = new MyTreeNode(entry);
			MyTreeNode foundNode = MyTreeNode.insert(root, entry);
			newNode.parent = foundNode;
		}
		
	}

	@Override
	public void delete(Comparable entry) {
		MyTreeNode.delete(entry, root);
	}

	@Override
	public boolean lookup(Comparable entry) {
		return MyTreeNode.lookup(root, entry);
	}

	@Override
	public void printPreOrder() {
		MyTreeNode.printPreOrder(root);  
	}

	@Override
	public void printInOrder() {
		MyTreeNode.printInOrder(root);  		
	}

	@Override
	public void printPostOrder() {
		MyTreeNode.printPostOrder(root);  		
	}

}
