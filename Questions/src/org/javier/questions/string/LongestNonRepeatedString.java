package org.javier.questions.string;

public class LongestNonRepeatedString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "abcabcuabcabcdabcxcd";
		
		/*
		 * -start reading char
		 * -if exists in hashmap sum qtys found to it
		 * -else
		 * 		- find elements that start with this
		 * 		- if found compare next n elements found following chars
		 * 			- if equal, accumulate string and repeat previous step
		 * 			- if different, means chains stopped and search again in hashmap
		 * 				- if found, sum qtys found to it
		 * 				- else
		 * 					- add chain to hashmap and intialize in 1
		 * 			-  else
		 * 				- sum qtys found to it
		 */
		
		//Hasttable<String val, int repetittions> with all different repeated Strings
//		HashMap
		
		//find first chain
		char prevChar = input.charAt(0);
		
		for(int i=1;i<input.length();++i) {
			char currentChar = input.charAt(i);
//			if(prevChar == currentChar) 
		}
		
		
	}

}
