
public class PrimitiveAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		Integer i = Integer.valueOf(x); //Primitive to Object
		int y = i.intValue(); // Object to Primitive
		System.out.println(i);
		System.out.println(y);
	}

}
