package DataType;

public class DataType {

	public static void main(String[] args) {

		// Primitive data types: include boolean, char, byte, short, int, long, float
		// and double.
		// Non-primitive data types:include Classes, Interfaces, and Arrays.

		long l = 50000000000l;              // 8 bytes
		int a = 5;                          // 4 bytes---> 32 bits(-2^31 to +2^31)
		short s = 15;                       // 2 bytes---> 16 bits -----------> -32768 to 32767
		byte b = 10;                        // 1 bytes---> 8 bits-----------> -128 to 127
		double d = 5.5;                     // 8 bytes
		float f = 5.5f;                     // 4 bytes---> 32 bits

		char letterC = 'A';                 // 2 bytes---> 16 bits

		double d1 = 5;                      // implicit conversion
		int k = (int) 5.6;                  // type casting & explicit conversion

		System.out.println(d1);
		System.out.println(k);

	}

}