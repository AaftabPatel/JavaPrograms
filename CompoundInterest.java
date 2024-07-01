import java.util.Scanner;
class CompoundInterest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM FOR COMPOUND INTREST-");
		float p,r,t,n,ci = 1.0f;
		System.out.print("Please enter the First principle Balance:");
		p = sc.nextInt();
		System.out.print("Please enter the Rate of intrest:");
		r = sc.nextInt();
		System.out.print("Please enter the Time:");
		t = sc.nextInt();
		System.out.print("Please enter the Number of time the Intrest Applied:");
		n = sc.nextInt();
		for(int i=0;i<n*t;i++){
			ci *= 1+(r/n);
		}
		ci *= p;
		System.out.print("Simple Intrest is:"+ci);
	}
}