package InitializeValue;

public class Main {

	public static void main(String[] args) {

		ReferenceVariable s1 = new ReferenceVariable();
		s1.id = 1;
		s1.name = "vishal";

		ReferenceVariable s2 = new ReferenceVariable();
		s2.id = 2;
		s2.name = "Sahil";

		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s2.id);
		System.out.println(s2.name);

	}

}
