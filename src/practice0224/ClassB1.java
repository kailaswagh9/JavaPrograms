package practice0224;

import practice.ClassB;
import simplePkg.ClassA;

class ClassB1 extends ClassA{
	
	 public void calls() {
		 ClassB1 ca = new ClassB1();
		System.out.println(ca.a);
		ca.fun2();
		ca.fun3();
	
				
	}
	 
	
	
	public static void main(String[] args) {
		ClassB1 cb1 = new ClassB1();
		System.out.println(cb1.a);
		System.out.println(cb1.d);
		cb1.fun2();
		 cb1.fun3();
		 cb1.fun1();
		 
	}

}
