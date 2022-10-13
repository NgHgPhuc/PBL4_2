package guinhanfile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5555);
			while(true) {
				try {
					Socket soc = server.accept();
					new XuLy(soc);//?
				} catch (Exception e1) {
				}
			}
		} catch (Exception e) {
		}
	}
}
class XuLy extends Thread {
	Socket soc;
	public XuLy(Socket soc) {
		this.soc = soc;
		run();
	}
	public void run() {
		try {
//			soc.setSoTimeout(5000);
			BufferedInputStream is = new BufferedInputStream(soc.getInputStream());
			BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(new File("C:\\Users\\ASUS\\Desktop\\copy.txt")));
			int c;
			while((c=is.read())!=-1) {
				os.write(c);
			}
			os.close();
			is.close();
		} catch (Exception e) {
		}
	}
}
