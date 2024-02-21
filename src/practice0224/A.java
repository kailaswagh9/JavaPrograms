package practice0224;

public class A {

	public static void method(int a) {
		System.out.println("I am in method");

	}

	public static void method(int a, int b) {
		System.out.println("I am in method");

	}

	public static void method() {
		System.out.println("I am in method");
	}

	public static void main(String[] args) {
		C c= new C();
		System.out.println(c.getValue());
		
		B b = new B();
		System.out.println(b.getValue());
	}

}

class B {
	int a = 10;

	public int getValue() {
		return a;
	}

}

class C extends B {
	int b = 20;

	public int getValue() {
		return b;
	}
}


