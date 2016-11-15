/*
 *Daniel Cancelmo
 *Lab 4
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

public class LinkedListTest {

	public static void main(String[] args) {
		ListClass list1 = new ListClass();
		System.out.println("list1 is empty: " + list1.isEmpty());
		list1.insert(1);
		list1.insert(456);
		list1.insert(567);
		list1.insert(-3);
		System.out.println("list1 is empty: " + list1.isEmpty());
		list1.insert(567); //insert method prevents adding duplicate data
		list1.printList();
		System.out.println("\nlist1 contains " + 1 + ": " + list1.contains(1));
		System.out.println("list1 contains " + 2 + ": " + list1.contains(2));
		System.out.println("list1 contains " + -3 + ": " + list1.contains(-3));
		System.out.println("Entry with value 456 in list1: " + list1.lookup(456));
		System.out.println("Entry with value 45 in list1: " + list1.lookup(45));
		list1.delete(456);
		list1.delete(23468); //Does nothing because 23468 is not in the list.
		System.out.println("456 has been deleted from the list. New list will be printed.");
		list1.printList();
	}
	
}
