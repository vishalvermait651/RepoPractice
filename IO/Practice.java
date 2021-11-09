package IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class Practice {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("C:\\Users\\vishal\\Desktop\\IT\\Java.txt");

		BufferedReader br = new BufferedReader(fr);

		String str;

		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();

	}

}
