package MethodOverloading;

public  class Add {

	static int Add(int a, int b) {
		return a+b;
	}

	static abstract  int Add(int a, int b, int c) {
		return a+b+c;
	}

}
