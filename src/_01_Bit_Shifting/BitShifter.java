package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4; //0100
		int numShifted = num << 1;
		
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println(numShifted);
		String bnum = Integer.toBinaryString(numShifted);
		System.out.println(bnum);
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		System.out.println("num: "+ num);
		System.out.println("numShifted: " + numShifted);
		// 4. Try shifting num 3 places.
		int num3 = num <<3; //shift left 3
		System.out.println("num3: " + num3);
		String bnum2 = Integer.toBinaryString(num3);
		System.out.println("bnum2: " + bnum2);
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
}
