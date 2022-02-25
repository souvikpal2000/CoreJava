
import java.util.ArrayList;
import java.util.List;

public class ListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		for(int i=10;i<=100;i=i+10) {
			list.add(i);
		}
		System.out.println("List : "+list);
		list.add(2,100);
		System.out.println("List After Inserting : "+list);
		list.set(3, 200);
		System.out.println("List After Replacing : "+list);
	}

}
