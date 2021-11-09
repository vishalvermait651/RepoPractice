package IO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FileWritting {

	public static void main(String[] args) {

		try {
			FileWriter fr = new FileWriter("C:\\Users\\vishal\\Desktop\\vishal.txt");
			fr.write("I want to write something");
			fr.close();

			System.out.println("Succesfully wrote to this file!!");
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
