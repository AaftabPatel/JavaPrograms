import java.net.*;
import java.io.*;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket socket = null; 
		String host = "127.0.0.1";
		socket = new Socket(host, 6666);
		File file = new File("D:\\salary.xlsm");
		
		//Get the size of the file
		long length = file.length(); 
		byte[] bytes = new byte[16 * 1024]; 
		InputStream in = new FileInputStream(file); 
		OutputStream out = socket.getOutputStream();
		int count;
		while ((count = in.read(bytes))>0) { 
			out.write(bytes, 0, count);
		}

		out.close();
		in.close();
		socket.close();
	}
}