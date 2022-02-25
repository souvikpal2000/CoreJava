
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "Souvik", 1000);
		Employee e2 = new Employee(2, "Ram", 2000);
		Employee e3 = new Employee(1, "Souvik", 1000);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
	}

}
