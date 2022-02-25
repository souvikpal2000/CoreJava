
public class Employee {
	private int id;
	private String name;
	private int salary;
	Employee(int id, String name, int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e = (Employee) obj;
			return (id == e.id && name.equals(e.name) && salary == e.salary);
		}
		return false;
	}
}
