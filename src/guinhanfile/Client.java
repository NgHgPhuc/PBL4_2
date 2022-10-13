package guinhanfile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try {
			Socket soc = new Socket("localhost", 5555);
			BufferedInputStream is = new BufferedInputStream(new FileInputStream(new File("C:\\Users\\ASUS\\Desktop\\matrix.txt")));
			BufferedOutputStream os = new BufferedOutputStream(soc.getOutputStream());
			int c;
			while((c=is.read())!=-1) {
				os.write(c);
			}
			os.close();
			is.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}