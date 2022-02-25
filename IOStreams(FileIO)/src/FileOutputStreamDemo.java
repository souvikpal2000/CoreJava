import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("D:/Eclipse Workspace/IOStreams(FileIO)/src/text.txt");
			fos = new FileOutputStream("D:/Eclipse Workspace/IOStreams(FileIO)/src/copiedText.txt");
			int i = fis.read();
			while(i != -1) {
				fos.write(i);
				i = fis.read();
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
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
