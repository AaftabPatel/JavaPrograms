import java.io.*;  
import java.util.Scanner;  
public class FileCopy{  
    public static void main(String args[]){  
        System.out.println("PROGRAM TO COPY A FILE INTO ANOTHER-");
        try{  
        FileInputStream fis=new FileInputStream("file_read.txt");       
        Scanner sc=new Scanner(fis);    //file to be scanned  
        FileWriter myWriter = new FileWriter("file_copy.txt");
        while(sc.hasNextLine()){  
            myWriter.write(sc.nextLine());
        }  
        sc.close();     //closes the scanner  
        myWriter.close();
        System.out.println("Successfully wrote to the file.");

        }  
        catch(IOException e){  
            e.printStackTrace();  
        }  
    }  
} 