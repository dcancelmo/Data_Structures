
/*
 *Daniel Cancelmo
 *Lab 9
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

@SuppressWarnings({ "unchecked", "rawtypes" })
public class MyHeap<T> implements Heap {
	
	//Instance variables
	protected int capacity;
	protected int currentSize;
	Comparable[] array;
	
	
	//Three constructors: No capacity passed, capacity passed, and array passed 
	public MyHeap(int capacity) {
		currentSize = 0;
		this.capacity = capacity;
		array = new Comparable[capacity];
	}
	public MyHeap() {
		currentSize = 0;
		capacity = 10;
		array = new Comparable[capacity];
	}
	public MyHeap(Comparable[] arrayP) {
		currentSize = 0;
		capacity = arrayP.length + 1;
		array = new Comparable[capacity];
		//Sorts the array into a proper heap
		heapify(arrayP);
	}

	//Inserts the data into the end of the array and then 'bubbles it up'
	@Override
	public void insert(Comparable entry) {
		currentSize++;
		if (currentSize == capacity) array = resize(array);
		array[currentSize] = entry;
		bubbleUp();
	}
	
	//Organizes the data into a min-heap
	private void bubbleUp() {
		int index = size();
		while (index > 1 && array[index].compareTo(array[index/2]) < 0) {
			Comparable temp = array[index];
	        array[index] = array[index/2];
	        array[index/2] = temp;
			index /= 2;
		}
	}
	
	//Creates a new array double the size of the original and copies the data in and then assigns the instance array to be this new array
	public Comparable[] resize(Comparable[] arrayOrig) {
		int length = arrayOrig.length;
		Comparable[] arrayNew = new Comparable[length*2];
		for (int i = 0; i < length; i++) {
			arrayNew[i] = arrayOrig[i];
		}
		capacity = length*2;
		return arrayNew;
	}
	
	//Prints the heap in the correct order.
	public void printHeap() {
		System.out.println("Heap printed below:");
		for (int i = 0; i <= currentSize; i++) {
			if (array[i] != null) System.out.printf("%d ", array[i]);  
		}
		System.out.println();
	}

	//Loops through the array. If every entry is null, returns true, if at least one entry has data, returns false.
	@Override
	public boolean isEmpty() {
		boolean empty = true;
		for (int i = 1; i < currentSize; i++) {
			if (!array[i].equals(null)) {
				empty = false;
				break;
			}
		}
		return empty;
	}

	//Returns the currentSize.
	@Override
	public int size() {
		return currentSize;
	}

	//Returns and deletes the minimum value. /Bubbles down' to restore order
	@Override
	public Comparable deleteMin() {
		Comparable result = array[1];
		array[1] = null;
		bubbleDown();
		currentSize--;
		return result;
	}
	
	//Restores heap order after an entry is deleted
	private void bubbleDown() {
		for (int i = 2; i <= currentSize; i++) {
			array[i-1] = array[i];
			if (i == currentSize) array[i] = null;
		}
	}
	
	//Converts the value of a randomly ordered array into a heap.
	private void heapify(Comparable[] arrayP) {
		for (int i = 0; i < capacity-1; i++) {
			insert(arrayP[i]);
		}
	}
	



}
