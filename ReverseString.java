import java.util.Scanner;
class ReverseString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM TO REVERSE A STRING-");
		System.out.print("Please enter the string to reverse:");
		String s = sc.nextLine();
		for(int i = s.length()-1 ;i>=0;i--){
				System.out.print(s.charAt(i));
			}
	}		
}