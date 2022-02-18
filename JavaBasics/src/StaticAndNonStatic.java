
public class StaticAndNonStatic {
	StaticAndNonStatic(){
		System.out.println("Inside a Constructor");
	}
	public static void main(String args[]) {
		System.out.println("Inside a Main Method");
		new StaticAndNonStatic();
		new StaticAndNonStatic();
		new StaticAndNonStatic();
	}
	{
		System.out.println("Inside a Non Static Block"); //Execute every time when an object is Created
	}
	static {
		System.out.println("Inside a Static Block"); //Only Executed Once when the Class loaded
	}
}
