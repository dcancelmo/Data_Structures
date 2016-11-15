/*
 *Daniel Cancelmo
 *Lab 9
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

//Interface for a Heap
public interface Heap<T extends Comparable<T>> {
	public void insert(T item);
	public boolean isEmpty();
	public int size();
	public T deleteMin();
}