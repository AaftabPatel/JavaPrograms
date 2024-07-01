import java.io.*;
class FileWordCount{
	public static void main(String args[]) throws Exception{	
		System.out.println("PROGRAM FOR FILE WORD COUNT-");
		File f = new File("file_read.txt");
		//reading in file
		try{    
		  FileInputStream fin=new FileInputStream(f);    
		  int i=0,count=0;    
		  while((i=fin.read())!=-1){    
            count++;
		  }    
          System.out.println("Number of words in the file are: "+count);
		  fin.close();    
		}
		catch(Exception e){
			System.out.println(e);
		}    
	}    
}
