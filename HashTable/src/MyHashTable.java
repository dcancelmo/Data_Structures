/*
 *Daniel Cancelmo
 *Lab 12
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 *This file contains code from Section 5.2 Hash Functions form the textbook pdf supplied by Pawlicki. Borrowed code noted as such in comments.
 */

public class MyHashTable {
	
	//Instance variables
	public String[] data;
	public int uniqueItems = 0;
	public float loadFactor = 0.50f;
	
	//Constructor when not given default initial capacity
	public MyHashTable() {
		data = new String[13];
	}
	//Constructor when given initial capacity
	public MyHashTable(int num) {
		data = new String[num];
	}
	
	//Inserts data into hash table. Prevents duplicates and rehashes as necessary. Counts uniqueItems
	public void insert(String entry) {
		//Triggers a rehash at 50%
		//Creates new array of double the capacity, and rehashes data into this new array. New array becomes data array
		if (uniqueItems != 0 && uniqueItems >= getCapacity() / 2) {
			String[] newData = new String[2*getCapacity()];
			rehash(data, newData);
			System.out.println("Rehashing to a size of " + 2*getCapacity());
			data = newData;
		}
		//Gets the hash value from the hash function
		int hashVal = hash(entry, getCapacity());
		//If the proper location in array is open, simply inserted there.
		if (data[hashVal] == null) {
			data[hashVal] = entry;
			uniqueItems++;
		//If the proper location in array is not open, goes to next location until open spot found.
		} else {
			//While loop loops until open spot found
			while (data[hashVal] != null) {
				//Prevents duplicate entries
				if (data[hashVal].equals(entry)) {
					System.out.println("Duplicate value of '" + entry + "' was not added to the table.");
					return;
				}
				hashVal++;
				//Allows looping through to beginning if end of array reached.
				if (hashVal > getCapacity()-1) hashVal = 0;
			}
			data[hashVal] = entry;
			uniqueItems++;
		}
	}
	
	//Takes the data from the old hash table and inserts it into the new hash table 
	public void rehash(String[] oldTable, String[] newTable) {
		//Merely a slight modification of the insert method, simplified because it does not need to worry of duplicates or counting items
		for (int i = 0; i < oldTable.length; i++) {
			if (oldTable[i] != null) {
				int hashVal = hash(oldTable[i], newTable.length);
				if (newTable[hashVal] == null) newTable[hashVal] = oldTable[i];
				else {
					while (newTable[hashVal] != null) {
						if (hashVal > getCapacity()) hashVal = 0;
						hashVal++;
					}
					newTable[hashVal] = oldTable[i];
				}
			}
		}
		
	}
	
	//Prints the non-null values of the hash table
	public void print() {
		String printString = "";
		for (int i = 0; i < data.length; i++) {
			if (data[i] != null) 
				printString += data[i] + ", ";  
		}
		//Eliminates extra ", "
		System.out.println(printString.substring(0, printString.length()-2));
	}
	
	//Getters
	public int getCapacity() {
		return data.length;
	}
	public int getUniqueItems() {
		return uniqueItems;
	}
	public float getLoadFactor() {
		return loadFactor;
	}
	
	
	//Begin borrowed code
	/**
	 * A hash routine for String objects.
	 * @param key the String to hash.
	 * @param tableSize the size of the hash table.
	 * @return the hash value.
	 */
	public static int hash(String key, int tableSize) {
		int hashVal = 0;
		for (int i = 0; i < key.length(); i++) hashVal = 37 * hashVal + key.charAt(i);
		
		hashVal %= tableSize;
		if (hashVal < 0 ) hashVal += tableSize;
		return hashVal;
	}
	//End borrowed code
	
}
