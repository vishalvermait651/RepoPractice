package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReading {

	public static void main(String[] args) throws Exception {            //approach1

		FileReader fr = new FileReader("C:\\Program Files\\vishal.txt");
		BufferedReader br = new BufferedReader(fr);

		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
	}

}
