import java.io.*;
import java.net.*;
import java.util.Date;

class URLDemo{
	public static void main(String args[]) throws Exception{
		int c;
		URL url = new URL("https://www.google.com");
		URLConnection urlconn = url.openConnection();
		System.out.println("____content____");
		InputStream in = urlconn.getInputStream();
		while(((c = in.read()) != -1)){
			System.out.println((char)c);
		}
		in.close();
	}
}