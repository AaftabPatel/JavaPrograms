import java.util.Scanner;
class Palindrome{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("PROGRAM TO CHECK PALNDROME-");
	System.out.print("Please enter the value to check:");
	String s = sc.nextLine();
	boolean b = true;
	for(int i=0;i<(s.length()/2);i++){
			if(s.charAt(i) != s.charAt(s.length()-i-1))
				b = false;
		}
		
	if(b == true)
		System.out.println(s+" is a Palindrome");
	else 
		System.out.println(s+" is not a Palindrome");
	}
}