/*
 *Daniel Cancelmo
 *Lab 8
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

public interface BST<T extends Comparable<T>> {
	public void insert(T x);
	public void delete(T x);
	public boolean lookup(T x);
	public void printPreOrder();
	public void printInOrder();
	public void printPostOrder();
}
