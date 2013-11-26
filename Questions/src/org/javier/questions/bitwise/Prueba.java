package org.javier.questions.bitwise;

public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	     int a = 60;	/* 60 = 0011 1100 */  
	     int a1 = 63; /* 63 = 0011 1111*/
	     int b = 13;	/* 13 = 0000 1101 */
	     int c = 2; // 0000 0010
	     int d = 127;  // 0111 1111
	     int e = 255; // 1111 1111
	     int uno = 1;  // 0000 0001
	     
	     System.out.println(12 & (1 << 2));
	     
	     System.out.println("Complemento a 2 de " + printBinFormat(a) + " es:" + printBinFormat ((a^uno )));
	}
	
	static String  printBinFormat(int value){
		return Integer.toBinaryString(value);
	}

}
