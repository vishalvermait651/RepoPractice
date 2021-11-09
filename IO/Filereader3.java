package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Filereader3 {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\vishal\\Desktop\\vishal.txt");

		Scanner sc = new Scanner(file);

		String str;
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();

	}

}
