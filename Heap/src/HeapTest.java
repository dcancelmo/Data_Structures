/*
 *Daniel Cancelmo
 *Lab 9
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

@SuppressWarnings({ "rawtypes" })
public class HeapTest {

	public static void main(String[] args) {
		//Testing a heap that has no initial capacity passed through.
		MyHeap heap0 = new MyHeap();
		heap0.insert(10);
		heap0.insert(0);
		heap0.insert(-5);
		System.out.println("Size of heap: " + heap0.size());
		System.out.println("Heap is empty: " + heap0.isEmpty());
		heap0.printHeap();
		
		//Testing a heap that has initial capacity passed through.
		MyHeap heap1 = new MyHeap(5);
		System.out.println("\nNew Heap created.");
		//size and isEmpty is tested when the heap is empty.
		System.out.println("Size of heap: " + heap1.size());
		System.out.println("Heap is empty: " + heap1.isEmpty());
		//Insert is tested with a wide range of negative and positive numbers and zero
		heap1.insert(6);
		heap1.insert(7);
		heap1.insert(12);
		heap1.insert(10);
		heap1.insert(15);
		heap1.insert(17);
		heap1.insert(5);
		heap1.insert(-5);
		heap1.insert(-100);
		heap1.insert(56);
		heap1.insert(0);
		heap1.insert(8);
		heap1.insert(47);
		System.out.println("Information was added to the heap.");
		//size and isEmpty is tested when the heap is not empty.
		System.out.println("Size of heap: " + heap1.size());
		System.out.println("Heap is empty: " + heap1.isEmpty());
		heap1.printHeap();
		///deleteMin is tested and heap is printed
		System.out.println(heap1.deleteMin() + " was removed from the heap.");
		System.out.println(heap1.deleteMin() + " was removed from the heap.");
		heap1.printHeap();
		
		//To test heapify, an array with the same data as the previous heap is passed in to a new instance of MyHeap
		Integer[] intArray = {6, 7, 12, 10, 15, 17, 5, -5, -100, 56, 0, 8, 47};
		MyHeap heap2 = new MyHeap(intArray);
		System.out.println("\nNew Heap created.");
		heap2.printHeap();
	}
}
