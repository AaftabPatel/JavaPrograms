import java.util.Scanner;
class BasicOperation{
	public static void main(String args[]){
		System.out.println("PROGRAM FOR BASIC OPERATIONS ON 3 INTEGER VALUES-");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter first value:");
		int n1 = sc.nextInt();
		System.out.print("Please enter Second value:");
		int n2 = sc.nextInt();
		System.out.print("Please enter third value:");
		int n3 = sc.nextInt();
		
		System.out.println("Sum of the three number is:"+(n1+n2+n3));
		System.out.println("Product of the three number is:"+(n1*n2*n3));
		System.out.println("Average of the three number is:"+((n1+n2+n3)/3));
		if(n1 == n2 && n1 == n3)
			System.out.println("All numbers are equal");
		else if(n1 > n2 && n1 > n3){	
			System.out.println(n1+" is the largest number");
			if(n2 > n3)
				System.out.println(n3+" is the smallest number");
			else
				System.out.println(n2+" is the smallest number");
		}
		else if(n2 > n1 && n2 > n3){	
			System.out.println(n2+" is the largest number");
			if(n1 > n3)
				System.out.println(n3+" is the smallest number");
			else
				System.out.println(n1+" is the smallest number");
		}
		else{
			System.out.println(n3+" is the largest number");
			if(n2 > n1)
				System.out.println(n1+" is the smallest number");
			else
				System.out.println(n2+" is the smallest number");
		}
	}
}