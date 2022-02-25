import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("D:/Eclipse Workspace/IOStreams(FileIO)/src/myFile.txt");
			br = new BufferedReader(fr);
			
			String line;
			int count = 0;
			
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				while(st.hasMoreTokens()) {
					st.nextToken();
					count = count + 1;
				}
			}
			System.out.println("Number of Words : "+count);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
