/*
 *Daniel Cancelmo
 *Lab 5
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

@SuppressWarnings({ "rawtypes", "unchecked" })
public class DoublyClass implements DoublyLinkedList {
	
	protected MyDoubleNode head = null;
	protected MyDoubleNode tail = null;
	
	public DoublyClass() {
		head = new MyDoubleNode();      
		tail = new MyDoubleNode();      
		head.prev = null; 
		head.next = tail;
		tail.prev = head;
		tail.next = null;
	}

	//Method inserts each new item to the list. Creates a LIFO list. Expected runtime of insert is constant.
	@Override
	public void insert(Object entry) {
		if (contains(entry)) return; 		//Prevents double entries
		MyDoubleNode link = new MyDoubleNode();
		link.data = entry;
		link.next = head;
		MyDoubleNode temp = head;
		head = link;
		head.prev = null;
		head.next = temp;
		temp.prev = head;
		(temp.next).prev = temp;
		
	}

	//Searches for the searchObj and deletes it from the list. If not found, returns.
	@Override
	public void delete (Object searchObj) {
		MyDoubleNode current = head;
		while (current != null) {
			if (searchObj.equals(current.data)) {
				(current.next).prev = current.prev;
				(current.prev).next = current.next;
				return;
			}
			current = current.next;
		} 
	}

	//Method searches through entire list to find if the list contains the searchObj
	@Override
	public boolean contains(Object searchObj) {
		if (head == null) return false;
		MyDoubleNode current = head.next;
		//Loops through entire list to identify the equality of each entry with the searchObj
		while (current.data != null) {
			if (current.data.equals(searchObj)) return true;
			current = current.next;
		}
		return false;
	}

	//Finds the searchObj in the list and returns it. If not found, returns null. Identical to contains except returns the object not true.
	@Override
	public Object lookup(Object searchObj) {
		if (head == null) return null;
		MyDoubleNode current = head;
		//Loops through entire list to identify the equality of each entry with the searchObj
		while (current.data != null) {
			if (current.data.equals(searchObj)) return current.data;
			current = current.next;
		}
		return null;
	}

	//Method tests to see if the list has any data stored.
	@Override
	public boolean isEmpty() {
		if (head.data == null && tail.data == null) return true;
		else return false;
	}

	//Method prints each item of a list separated by tabs. Expected runtime of printList is n.
	@Override
	public void printList() {
		if (head == null) return;
		System.out.print(head.data.toString());		//Printing this first prevents extra separating tabs
		MyDoubleNode current = head.next;
		//Loops through entire list to print the next item.
		while (current.data != (null)) {
			System.out.print("\t" + current.data.toString());
			current = current.next;
		}		
	}

	//Method prints each item of a list in reverse separated by tabs. Expected runtime of printList is n.
	@Override
	public void printListRev() {
		if (tail.prev == null) return;
		MyDoubleNode current = tail.prev.prev;
		//Loops through entire list to print the prev item.
		while (current != (null)) {
			System.out.print(current.data.toString() + "\t");
			current = current.prev;
		}		
	}

}
