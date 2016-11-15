/*
 *Daniel Cancelmo
 *Lab 4
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

@SuppressWarnings({ "rawtypes", "unchecked" })
public class ListClass implements SimpleLinkedList<Object> {
	
	protected MyNode head = null;

	//Method inserts each new item to the list. Creates a LIFO list. Expected runtime of insert is 1.
	@Override
	public void insert(Object entry) {
		if (contains(entry)) return; 		//Prevents double entries
		MyNode link = new MyNode();
		link.data = entry;
		link.next = head;
		head = link;		
	}

	//Searches for the searchObj and deletes it from the list. If not found, returns.
	@Override
	public void delete(Object searchObj) {
		if (head == null) return;
		MyNode current = head;
		MyNode entryDel = null;
		MyNode prevEntry = null;
		//Loops through entire list to identify the equality of each entry with the searchObj
		while (current != null) {
			if (current.data.equals(searchObj)) {
				entryDel = current;
				break;
			}
			prevEntry = current;
			current = current.next;
		}
		if (entryDel == null) return;
		//Reconnects the previous entry of the list to the entry after the deleted entry.
		prevEntry.next = entryDel.next;
	}

	//Method searches through entire list to find if the list contains the searchObj
	@Override
	public boolean contains(Object searchObj) {
		if (head == null) return false;
		MyNode current = head;
		//Loops through entire list to identify the equality of each entry with the searchObj
		while (current != null) {
			if (current.data.equals(searchObj)) return true;
			current = current.next;
		}
		return false;
	}

	//Finds the searchObj in the list and returns it. If not found, returns null. Identical to contains except returns the object not true.
	@Override
	public Object lookup(Object searchObj) {
		if (head == null) return null;
		MyNode current = head;
		//Loops through entire list to identify the equality of each entry with the searchObj
		while (current != null) {
			if (current.data.equals(searchObj)) return current.data;
			current = current.next;
		}
		return null;
	}

	//Method tests to see if the list has any data stored.
	@Override
	public boolean isEmpty() {
		if (head == null) return true;
		else return false;
	}

	//Method prints each item of a list separated by tabs. Expected runtime of printList is n.
	@Override
	public void printList() {
		if (head == null) return;
		System.out.print(head.data.toString());		//Printing this first prevents extra separating tabs
		MyNode current = head.next;
		//Loops through entire list to print the next item.
		while (current != (null)) {
			System.out.print("\t" + current.data.toString());
			current = current.next;
		}
	}
	

	

}