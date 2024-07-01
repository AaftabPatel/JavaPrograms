import java.io.*;
class FileOpening{
	public static void main(String args[]) throws Exception{	
		System.out.println("PROGRAM FOR FILE OPERATIONS-");
		
		//setting file object
		File f = new File("file_io.txt");
		//creating file
		try {
			if (f.createNewFile()) {
			  System.out.println("File created: " + f.getName());
			} else {
			  System.out.println("File already exists.");
			}
		} 
		catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		File rename = new File("new_file_io.txt");
		//renaming a file
		boolean flag = f.renameTo(rename);
  
        if (flag == true) {
            System.out.println("File Successfully Rename");
        }
        else {
            System.out.println("Operation Failed");
        }
		rename.renameTo(f);

		//writing in file
		try{    
			FileOutputStream fout=new FileOutputStream("file_io.txt");    
			fout.write(65);    
			fout.close();    
			System.out.println("success...");    
		   }
		catch(Exception e){
			System.out.println(e);
		} 

		//reading in file
		try{    
		  FileInputStream fin=new FileInputStream(f);    
		  int i=0;    
		  while((i=fin.read())!=-1){    
		   System.out.print((char)i);    
		  }    
		  fin.close();    
		}
		catch(Exception e){
			System.out.println(e);
		}    
		
		//deleating the file
		if (f.delete()) { 
			System.out.println("\nDeleted the file: " + f.getName());
		  } else {
			System.out.println("Failed to delete the file.");
		  } 
	}    
}
