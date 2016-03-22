/************************************************************************
 *
 * 1. This software is for the purpose of demonstrating one of many
 * ways to implement the algorithms in Introduction to Algorithms,
 * Second edition, by Thomas H. Cormen, Charles E. Leiserson, Ronald
 * L. Rivest, and Clifford Stein.  This software has been tested on a
 * limited set of test cases, but it has not been exhaustively tested.
 * It should not be used for mission-critical applications without
 * further testing.
 *
 * 2. McGraw-Hill licenses and authorizes you to use this software
 * only on a microcomputer located within your own facilities.
 *
 * 3. You will abide by the Copyright Law of the United Sates.
 *
 * 4. You may prepare a derivative version of this software provided
 * that your source code indicates that it based on this software and
 * also that you have made changes to it.
 *
 * 5. If you believe that you have found an error in this software,
 * please send email to clrs-java-bugs@mhhe.com.  If you have a
 * suggestion for an improvement, please send email to
 * clrs-java-suggestions@mhhe.com.
 * 
 * Modified by Brandon Tarney for Johns Hopkins class 605.421 algorithms Programming Assignment 2
 * 
 * @author Brandon Tarney
 * @version 2.0 3/21/2016
 *
 ***********************************************************************/

package com.tarney.sorts;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Sorts a list of doubles in the range [0, 1) via the
 * bucket sort algorithm from page 174 of <i>Introduction to
 * Algorithms</i>, Second edition.
 */

public class BucketSort {

    public static LinkedList<DoubleValued> sort(LinkedList<DoubleValued> inputValues) {
    	
		// Determine length of array and instantiate buckets
		int n = inputValues.size();
		ArrayList<LinkedList<DoubleValued>> buckets = new ArrayList<>(n);
	
		// Initialize each bucket with a new linked list.
		for (int i = 0; i < n; i++) {
		    buckets.add(new LinkedList<DoubleValued>() );
		}
		
		// Add each element in array to its specific bucket.
		int bucketNumber;
		for (int i = 0; i < n; i++) { 
			
			bucketNumber = (int) (n * inputValues.get(i).getKey());
			buckets.get(bucketNumber).add(inputValues.get(i));
			
		}
		
		// Sort the buckets.
		for (int i = 0; i < n; i++) {
			buckets.set(i, InsertionSort.sort(buckets.get(i)));
		}

		// Concatenate the buckets together into buckets[0].
	    LinkedList<DoubleValued> finalList = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			finalList.addAll(buckets.get(i));
		}

		return finalList;

    }
}

