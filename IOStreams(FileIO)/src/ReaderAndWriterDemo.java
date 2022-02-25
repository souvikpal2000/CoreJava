import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("D:/Eclipse Workspace/IOStreams(FileIO)/src/text.txt");
			fw = new FileWriter("D:/Eclipse Workspace/IOStreams(FileIO)/src/copiedText.txt");
			int i = fr.read();
			while(i != -1) {
				fw.write(i);
				i = fr.read();
			}
			System.out.println("File Copied");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
