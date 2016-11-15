/*
 *Daniel Cancelmo
 *Lab 12
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

public class HashNameTest {
	
	public static void main(String[] args) {
		MyHashTable hashTable = new MyHashTable(13);
		System.out.println("Current capacity is: " + hashTable.getCapacity() + "\nLoad factor is: " + hashTable.getLoadFactor());
		hashTable.insert("Dan");
		hashTable.insert("John");
		hashTable.insert("Alana");
		hashTable.insert("Ethan");
		hashTable.insert("Wade");
		hashTable.insert("Dan");
		hashTable.insert("Maddie");
		hashTable.insert("Nick");
		hashTable.insert("Varun");
		hashTable.insert("Kyle");
		hashTable.insert("Jack");
		hashTable.insert("Ben");
		hashTable.insert("Neil");
		hashTable.insert("Matt");
		hashTable.insert("Max");
		System.out.println("Current capacity is: " + hashTable.getCapacity() + "\nNumber of unique items is: " + hashTable.getUniqueItems());
		hashTable.print();

	}
	
}
