package serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	int id;
	String ename;
	String cname;
	Employee(int id, String ename, String cname){
		this.id = id;
		this.ename = ename;
		this.cname = cname;
	}
}
