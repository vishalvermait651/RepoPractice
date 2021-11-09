package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FIleReading2 {

	public static void main(String[] args) throws Exception { // approach2

		File file = new File("C:\\\\Program Files\\\\vishal.txt");

		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}
}
