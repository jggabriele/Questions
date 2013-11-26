package org.javier.questions.string;

public class NumToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float input = 290760.43f;
		String response = getString(input,2);
		System.out.println("As String:" + response);
	}
	
	
	/**
	 * Calculates a String using a float number.
	 * @param val Argument having the floating point number
	 * @param decimalPlaces Count how many decimal places after floating point must be considered
	 * @return The String representation of the val
	 */
	static String getString(float val, int decimalPlaces) {
		String ret = "";
		int intPart = (int)val;
		float decPart = val % intPart; // decimal portion of val
		
		// Calculates the positions that the decimal part will have to move into the integer part
		int decFactorConversor = 1;
		for(; decimalPlaces>0; decimalPlaces--) {
			decFactorConversor = decFactorConversor * 10;
		}
		
		//get the integer part of this floating point number
		ret += getString(intPart);
		
		/*
		 * if there is a value after the floating point (decimal) then move it 
		 * to the integer part as many places as decimalPlaces
		 * and retrieve the String representation of the int part
		 */
		if(decPart > 0) {
			ret = ret + ".";
			ret = ret + getString((int)(decPart * decFactorConversor));
		}
		
		return ret;
	}
	
	
	/**
	 * Method that given an integer, returns the String representation of it.
	 * @param val The int value that will be converted into String
	 * @return The String representation of val
	 */
	static String getString(int val) {
		String ret = "";
		for ( int i=1; val>0; i++) {
			
			//get the remaining of division by 10. i.e. 763 % 10 = 3 -> 763/10 = 76 and remains 3 that cannot divide by 10
			ret = (val % 10) + ret;
			
			//removes the most right digit
			val = val / 10;	
		}
		return ret;
	}

}
