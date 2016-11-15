/*
 *Daniel Cancelmo
 *Lab 6
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

public class MyStackTest {
	
	public static void main(String[] args) {
		MyStack stack1 = new MyStack();
		System.out.println("The stack is empty: " + stack1.isEmpty());
		stack1.push(10);
		stack1.push(5);
		System.out.println("Data has been added to the stack. The stack is empty: " + stack1.isEmpty());
		stack1.push(47);
		System.out.println("The top data item on the stack currently is: " + stack1.peek() + " This data has not been removed.");
		stack1.push(539);
		System.out.println("The top data item on the stack currently is: " + stack1.pop() + " This data has been removed.");
		System.out.println("Remember this data item? He's back: " + stack1.pop() + " This data has been removed.");
		System.out.println("Let's see what we have left...");
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		if (stack1.pop() == null) System.out.println(stack1.pop() + "\nOppps, our stack is empty again!");

	}
	
}
