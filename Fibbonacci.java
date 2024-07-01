import java.util.Scanner;
class Fibbonacci{
  public static void main(String[] args) {
    System.out.println("PROGRAM FOR FIBBONACCI SERIES-");
	int n1=0, n2=1,n;
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter the number of terms you want:");
	n=sc.nextInt();
	int next;
	System.out.println("Fibbonacci series is as follow:");
	System.out.print(n1+" "+n2+" ");
	for(int i=0;i<n-2;i++){
		next = n1+n2;
		System.out.print(next+" ");
		n1 = n2;
		n2 = next;
	}
  }
}