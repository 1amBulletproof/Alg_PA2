/*
 * Static Method to perform Insertion sort on a LinkedList, returning a LinkedList
 * 
 * @author Brandon Tarney
 * @version 1.0 3/21/2016
 */

package com.tarney.sorts;

import java.util.LinkedList;

public class InsertionSort {
	
	public static LinkedList<DoubleValued> sort (LinkedList<DoubleValued> unsortedList) {
		
		LinkedList<DoubleValued> sortedList = new LinkedList<>();
		
		DoubleValued elementToInsert;
		
		for (int item = 0; item < unsortedList.size(); item++) {//for each item in the unsorted list
			
			elementToInsert = unsortedList.get(item);
			
			if (sortedList.size() > 0) {//all but the first insertion
			
				int sortedListPosition =  sortedList.size() -1 ; //sets the position to the max of the list 
				
				//while the existing element is greater than element to insert (but stop when you have compared all elements)
				while (sortedListPosition >= 0 && sortedList.get(sortedListPosition).compareTo(elementToInsert) > 0 ) { 
					sortedListPosition -= 1;
				}
				
				sortedList.add(sortedListPosition + 1,  elementToInsert); //this will add a greater value IN FRONT of the lesser value 
				
			} else { //first item is automatically inserted
			
				sortedList.add(elementToInsert);
			}

		}
		
		return sortedList; 
	}

}

