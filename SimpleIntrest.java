import java.util.Scanner;
class SimpleIntrest{
	public static void main(String args[]){
		System.out.println("PROGRAM FOR CALCULATING SIMPLE-INTREST-");
		Scanner sc = new Scanner(System.in);
		float p,r,t,si;
		System.out.print("Please enter the principle amount:");
		p = sc.nextInt();
		System.out.print("Please enter the Rate of intrest:");
		r = sc.nextInt();
		System.out.print("Please enter the Time:");
		t = sc.nextInt();
		si = p*r*t/100;
		System.out.print("Simple Intrest is:"+si);
	}
}