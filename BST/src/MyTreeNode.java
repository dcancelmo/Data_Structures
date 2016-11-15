/*
 *Daniel Cancelmo
 *Lab 8
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

@SuppressWarnings({ "rawtypes", "unchecked" })
public class MyTreeNode<T extends Comparable<T>> {
	public T data;
	public MyTreeNode<T> leftChild;
	public MyTreeNode<T> rightChild;
	public MyTreeNode<T> parent;
	
	//Constructor
	public MyTreeNode(T entry) {
		data = entry;
	}
	
	//Searches tree for correct location and returns that location
	public static MyTreeNode insert(MyTreeNode node, Comparable entry) {
		if (node == null) return new MyTreeNode(entry);
		if (entry.compareTo(node.data) == 0) return node;
		if (entry.compareTo(node.data) < 0) node.leftChild = insert(node.leftChild, entry);
		else node.rightChild = insert(node.rightChild, entry);
		
		return node;
	}
	
	//Prints the tree in pre-order
	public static void printPreOrder(MyTreeNode node) {
		if(node !=  null) {  
			System.out.printf("%d ",node.data);  
			printPreOrder(node.leftChild);  
			printPreOrder(node.rightChild);  
		}  
	}
	
	//Prints the tree in-order
	public static void printInOrder(MyTreeNode node) {
		if(node !=  null) { 
			printInOrder(node.leftChild);  
			System.out.printf("%d ",node.data);  
			printInOrder(node.rightChild);  
		}  
	}
	
	//Prints the tree in post-order
	public static void printPostOrder(MyTreeNode node) {
		if(node !=  null) {  
			printPostOrder(node.leftChild);  
			printPostOrder(node.rightChild);
			System.out.printf("%d ",node.data);  
		}  
	}
	
	//Searches tree using > and < to quickly find the matching node. True if found, false if not in BST
	public static boolean lookup (MyTreeNode node, Comparable entry) {
		if(node !=  null) { 
			if (node.data.compareTo(entry) == 0) return true;
			if (node.data.compareTo(entry) > 0) return lookup(node.leftChild, entry);  
			if (node.data.compareTo(entry) < 0) return lookup(node.rightChild, entry);  
		}
		return false;
	}
	
	//Searches tree using < and > to quickly find the matching node. Removes it from the list.
	//Three cases: No children, one child, two children.
	public static MyTreeNode delete(Comparable entry, MyTreeNode node) {
		//Case 0: Item not in tree. Nothing happens
		if (node == null ) return node;
		if (entry.compareTo(node.data) < 0) node.leftChild = delete(entry, node.leftChild);
		else if (entry.compareTo(node.data) > 0) node.rightChild = delete(entry, node.rightChild);
		//Case 3: Two children
		else if (node.leftChild != null && node.rightChild != null) { 
			node.data = delLowest(node.rightChild).data;
			node.rightChild = delete(node.data, node.rightChild);
		} else  {
			if (node.leftChild != null) node = node.leftChild;
			else node = node.rightChild;
		}
		return node;
	}
	
	//Used to find the node that will replace the deleted one if it has two children. Left-most-child of right-child
	private static MyTreeNode delLowest(MyTreeNode node) {
		if(node == null) return null;
		else if(node.leftChild == null) return node;
		return delLowest(node.leftChild);
	}
}

