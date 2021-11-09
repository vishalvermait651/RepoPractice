package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\vishal\\Desktop\\IT\\Java.txt");

		Scanner sc = new Scanner(file);

		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

	}

}
