import java.util.Scanner;
class Factorial{
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("PROGRAM FOR FACTORIAL OF A NUMBER-");
	System.out.print("Please enter the number whose factoial you want:");
	int n=sc.nextInt();
	int fact = 1;
	for(int i=1;i<=n;i++){
		if(n == 0 || n==1)
			break;
		else if(n > 1){
			fact *= i;
		}
		else{
			System.out.println("Please enter a positive number!!!");
			break;
		}
	}
	System.out.println("Factorial of "+n+" is: "+fact);
  }
}