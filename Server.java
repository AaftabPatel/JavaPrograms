import java.net.*;
import java.io.*;

public class Server {
	public static void main(String[] args) throws IOException { 
		ServerSocket serverSocket = null;
		try {

			serverSocket = new ServerSocket(6666); 
		}catch (IOException ex) {
			System.out.println("Can't setup server on this port number.");
		}

		Socket socket = null;
		InputStream in = null; 
		OutputStream out=null;
		
		try {
			System.out.println("Waiting for Client Connection......");
			 socket = serverSocket.accept();
		} catch (IOException ex) { 
			System.out.println("Can't accept client connection.");
		}
		try{
			System.out.println("Client Connection Established.....");
			in = socket.getInputStream();
		} catch (IOException ex) {

			System.out.println("Can't get socket input stream. ");
		}
		try{
			out = new FileOutputStream("D://salary from Java.XLS"); 
		} catch (FileNotFoundException ex) { 
			System.out.println("File not found.");
		}
		byte[] bytes = new byte[16*1024];

		int count;
		while ((count = in.read(bytes)) > 0) {
		   out.write(bytes, 0, count); 
		   System.out.println("Copied "+count+ "data....");
		}
		out.close();
		in.close();
		socket.close(); 
		serverSocket.close();
		}
	}

