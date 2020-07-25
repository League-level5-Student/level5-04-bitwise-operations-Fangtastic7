package _03_Printing_Binary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	public static void main(String[] args) {
	printByteBinarytest();
	printShortBinarytest();
	printIntBinarytest();
	printLongBinarytest();
	}
	@Test
	private static void printByteBinarytest() {
		// TODO Auto-generated method stub
		try {
		assertEquals("00010001", BinaryPrinter.printByteBinary((byte) 17));
		System.out.println("Byte to Binary success!");
		} catch(Exception e) {
			System.out.println("Does not convert from byte to binary!");
			e.printStackTrace();
		}
	}
	@Test
	private static  void printShortBinarytest() {
		// TODO Auto-generated method stub
		try {
			assertEquals("10101001", BinaryPrinter.printShortBinary((short) 169));
			System.out.println("Short to Binary success!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	private static void printIntBinarytest() {
		// TODO Auto-generated method stub
		try {
			assertEquals("10101001", BinaryPrinter.printIntBinary(169));
			System.out.println("Int to Binary success!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	private static void printLongBinarytest() {
		// TODO Auto-generated method stub
		try {
			assertEquals("10101001", BinaryPrinter.printLongBinary(169));
			System.out.println("Long to Binary success!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String printByteBinary(byte b) {
		String phrase = "";
		for(int i =7; i>= 0; --i) {
			phrase += (b >> i & 1);
		}
		System.out.println(phrase);
		return phrase;
		
	}
	
	/*
	public static String printByteBinary(byte b) {
		  StringBuilder sb = new StringBuilder();
		    for (int i = 7; i >= 0; --i) {
		        sb.append(b >>> i & 1);
		    }
		    System.out.println(sb.toString());
		    return sb.toString();
	}
	*/
	public static String printShortBinary(short s) {
		  StringBuilder sb = new StringBuilder();
		    for (int i = 7; i >= 0; --i) {
		        sb.append(s >>> i & 1);
		    }
		    return sb.toString();
	}
	
	public static String printIntBinary(int x) {
		 StringBuilder sb = new StringBuilder();
		    for (int i = 7; i >= 0; --i) {
		        sb.append(x >>> i & 1);
		    }
		    return sb.toString();
	}
	
	public static String printLongBinary(long l) {
		StringBuilder sb = new StringBuilder();
	    for (int i = 7; i >= 0; --i) {
	        sb.append(l >>> i & 1);
	    }
	    return sb.toString();
	}
	
}
