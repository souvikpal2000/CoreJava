package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("D:\\Eclipse Workspace\\IOStreams(FileIO)\\src\\serialization\\emp.dat");
			ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
			
			Employee e = (Employee) obj;
			
			System.out.println("Id : "+e.id);
			System.out.println("Name : "+e.ename);
			System.out.println("Company : "+e.cname);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
