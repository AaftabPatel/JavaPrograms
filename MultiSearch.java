import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.*;

class MultiSearch{
	public  static void main(String args[]){
		int NoArr[] = new int[1000];
		int NoToSearch;
		Scanner sc = new Scanner(System.in);	
		Random r = new Random();
		for(int i = 0; i<1000; i++){
			NoArr[i] = r.nextInt(2000);
		}
		System.out.println("Please enter the number to search:");
		NoToSearch = sc.nextInt();
		System.out.println(new SimpleDateFormat("mm:ss.SSS").format(new Date()));
	}
}