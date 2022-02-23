package p1;

public class A {
	
	private int a = 30; //Accessible within the same class
	int b = 40; //Accessible within the same class & same package
	protected int c = 50; //Accessible within same class, same package & outside the package by the subclass
	public int d = 60; //Accessible to all
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		System.out.println("a : "+obj.a);
		System.out.println("b : "+obj.b);
		System.out.println("c : "+obj.c);
		System.out.println("d : "+obj.d);
	}

}
