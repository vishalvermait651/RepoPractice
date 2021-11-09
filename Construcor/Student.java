package Construcor;

public class Student {

	int id;
	String name;
	static String school="ITRS";

	Student(int i, String name) {
		id = i;
		this.name = name;
	}

	void display() {
		System.out.println(id + "" + name+""+ school);
	}

}

