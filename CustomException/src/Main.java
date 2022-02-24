import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter Name : ");
		String name = br.readLine();
		System.out.print("Enter Mobile No. : ");
		String mobile = br.readLine();
		System.out.print("Enter Alternate Mobile No. : ");
		String alt = br.readLine();
		System.out.println("");
		try {
			User ob = new User(name,mobile,alt);
			ob.validate();
			ob.display();
		}
		catch(SameNumberException e) {
			System.err.println(e);
		}
	}

}
