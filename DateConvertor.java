import java.util.Scanner;
import java.util.*;
import java.text.SimpleDateFormat;  
class DateConvertor{
    public static void main(String[] args) throws Exception {
        System.out.println("PROGRAM TO CONVERT DATE INTO OTHEr FORMAT-");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the date you want to convert(ddmmyyyy):");
        String dt = sc.nextLine();
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dt); 
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");  
        String strDate = formatter.format(date);  
        System.out.println(strDate);
   
    }
}