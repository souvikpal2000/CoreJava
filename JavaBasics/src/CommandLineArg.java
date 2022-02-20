
public class CommandLineArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = args.length;
		if(l==0) {
			System.out.println("No Argument Passed");
		}
		else {
			int i;
			System.out.println("List of Arguments : ");
			for(i=0;i<l;i=i+1) {
				System.out.println(args[i]);
			}
		}
	}

}
