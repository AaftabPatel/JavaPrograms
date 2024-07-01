import java.util.Scanner;
class Armstrong{
	//method to calculate power
	static	int pow(int x,int y){
			int ans = 1;
			for(int j=0; j<y ;j++){
				ans *=x;
			}
				return ans;
		}
		
	public static void  main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM FOR CHECKING ARMSTRONG NUMBER -");
		System.out.print("Please enter the number to check:");
		String num = sc.nextLine();
		int len = num.length();
		int n = Integer.parseInt(num);
		int res=0,val, m = n;
		
		
		
		for(int i=0;i<len;i++){
			val = m%10;
			int p = pow(val ,len);
			res += p;
			m = m/10;
		}
		if(res == n)
			System.out.println(n+" is an armstrong number");
		else
			System.out.println(n+" is not an armstrong number");
	}
}