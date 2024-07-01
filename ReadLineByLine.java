import java.io.*;  
import java.util.Scanner;  
public class ReadLineByLine{  
    public static void main(String args[]){  
        System.out.println("PROGRAM TO REA A FILE LINE BY LINE USING SCANNER-");
        try{  
        //the file to be opened for reading  
        FileInputStream fis=new FileInputStream("file_read.txt");       
        Scanner sc=new Scanner(fis);    //file to be scanned  
        
        while(sc.hasNextLine()){  
            System.out.println(sc.nextLine());      //returns the line that was skipped  
        }  
        sc.close();     //closes the scanner  
        }  
        catch(IOException e){  
            e.printStackTrace();  
        }  
    }  
} 