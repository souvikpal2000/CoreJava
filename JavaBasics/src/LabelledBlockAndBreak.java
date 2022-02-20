
public class LabelledBlockAndBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 20;
		l1:{
			System.out.println("Inside the Block");
			if(no==20) {
				break l1;
			}
			System.out.println("End of the Block");
		}
		System.out.println("Outside the Block");
	}

}
