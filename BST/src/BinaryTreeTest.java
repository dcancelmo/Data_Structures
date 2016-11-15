/*
 *Daniel Cancelmo
 *Lab 8
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

public class BinaryTreeTest {
	
	public static void main(String[] args) {
		BinaryTree tree1 = new BinaryTree();
		//Test insert method with negative, positive and zero.
		tree1.insert(10);
		tree1.insert(20);
		tree1.insert(0);
		tree1.insert(-10);
		tree1.insert(50);
		tree1.insert(-5);
		tree1.insert(5);
		tree1.insert(13);
		tree1.insert(-3);
		tree1.insert(-20);
		//Test duplicate value detection.
		tree1.insert(0);
		tree1.insert(10);
		//Test all three prints and again later.
		System.out.println("Printed tree pre-order:");
		tree1.printPreOrder();
		System.out.println("\nPrinted tree in-order:");
		tree1.printInOrder();
		System.out.println("\nPrinted tree post-order:");
		tree1.printPostOrder();
		//Test lookup with negative, positive, and zero values
		System.out.println("\nTree contains the data item 0: " + tree1.lookup(0));
		System.out.println("Tree contains the data item 100: " + tree1.lookup(100));
		System.out.println("Tree contains the data item -3: " + tree1.lookup(-3));
		System.out.println("Tree contains the data item 3: " + tree1.lookup(3));
		//Test delete by trying all 3 cases of no child, one child, two child.
		tree1.delete(50);
		tree1.delete(-5);
		System.out.println("50 and -5 deleted. Print new tree pre-order:");
		tree1.printPreOrder();
		tree1.delete(20);
		System.out.println();
		System.out.println("20 deleted. Print new tree post-order:");
		tree1.printPostOrder();
		//Test delete by deleting the root
		tree1.delete(10);
		System.out.println();
		System.out.println("10 deleted. Print new tree in-order:");
		tree1.printInOrder();
	}
	
}
