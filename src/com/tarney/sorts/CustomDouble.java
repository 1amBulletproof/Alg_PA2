/*
 * Wrapper class for java primitive "double"
 * 
 * Can compare to another CustomDouble and 
 * contains a key value which is a java primitive double
 * 
 * @author Brandon Tarney
 * @version 1 3/21/2016
 */

package com.tarney.sorts;

public class CustomDouble implements DoubleValued {
	
	double value;
	
	public CustomDouble(double value) {
		this.value = value;
	}

	@Override
	public int compareTo(Object o) {
		
		CustomDouble that = (CustomDouble) o;
		
		if (this.getKey() < that.getKey()) {
			return -1;
		}
		else if (this.getKey() == that.getKey()) {
			return 0;
		}
		else { //if (this.getKey() > that.getKey()) 
			return 1;
		}
		
	}

	@Override
	public double getKey() {
		return value;
	}

}
