/*
 *Daniel Cancelmo
 *Lab 7
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

public class MyQueueTest {
	
	public static void main(String[] args) {
		MyQueue queue1 = new MyQueue();
		System.out.println("The queue is empty: " + queue1.isEmpty());
		queue1.enqueue(10);
		queue1.enqueue(5);
		System.out.println("Data has been added to the queue. The queue is empty: " + queue1.isEmpty());
		queue1.enqueue(47);
		System.out.println("The front data item on the queue currently is: " + queue1.peek() + " This data has not been removed.");
		queue1.enqueue(539);
		System.out.println("The front data item on the queue currently is: " + queue1.dequeue() + " This data has been removed.");
		System.out.println("Let's remove what we have left...");
		System.out.println(queue1.dequeue());
		System.out.println(queue1.dequeue());
		System.out.println(queue1.dequeue());
		System.out.println("The queue is empty: " + queue1.isEmpty());

	}
	
}
