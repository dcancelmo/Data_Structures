/*
 *Daniel Cancelmo
 *Lab 12
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class HashIpsumTest {
	
	public static void main(String[] args) {
		String inFileName = "Lorem_ipsum.txt";
		Scanner inData = null;
		//Scanner is created for input file
		try {
			inData = new Scanner(new File(inFileName));
		} catch (FileNotFoundException e) {
			System.out.println(inFileName + " not found.");
		}
		MyHashTable ipsum = new MyHashTable(13);
		int wordsIn = 0; //Word counter
		//Words from input file are read in and inserted into the hash table
		while(inData.hasNext()) {
			ipsum.insert(inData.next());
			wordsIn++;
		}
		//Results printed to console
		System.out.println();
		ipsum.print();
		System.out.println("\nNumber of unique strings is: " + ipsum.getUniqueItems() + "\nNumber of words read in: " + wordsIn + "\nFinal size is: " + ipsum.getCapacity());

	}
	
}
