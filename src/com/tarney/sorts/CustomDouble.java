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
