import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to my World";
		StringTokenizer st = new StringTokenizer(s);
		String s2 = "Welcome,to,my,World";
		st = new StringTokenizer(s2, ",", true);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
