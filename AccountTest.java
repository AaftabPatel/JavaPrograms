import java.util.Scanner;
class Account{
	double balance;
	Scanner sc = new Scanner(System.in);
	Account(){
		System.out.print("Please enter the balance:");
		double bal = sc.nextDouble();
		if(bal < 0.0)
			System.out.println("balance can't be negative!!!");
		else
			balance = bal;
	}
	
	void getBalance(){
		System.out.println("Balance is: "+balance);	
	}
	
	void credit(double n){
		balance += n;
		System.out.println(n+" Credited");
	}
	
	void debit(double n){
		if(balance - n < 0)
			System.out.println("You dont have enough balance!!!");	
		else{
			balance -= n;
			System.out.println("Amount "+n+" Debited Available Balance is: "+balance);	
		}
	}
}

class AccountTest{
	public static void main(String args[]){
		System.out.println("PROGRAM FOR ACCOUNT DETAILS-");
		Account acc = new Account();
		System.out.println("Welcome User");
		int c = 0;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("Press 1 for Credit:");
			System.out.println("Press 2 for Debit:");
			System.out.println("Press 3 for Show Balance:");
			System.out.println("Press 4 for Exit:");
			System.out.print("Please choose what you want to do:");
			int ch = sc.nextInt();
			
			if(ch == 1){
				System.out.print("Please enter the amount to credit:");
				double a = sc.nextInt();
				acc.credit(a);
			}
			else if(ch == 2){
				System.out.print("Please enter the amount to withdraw:");
				double a = sc.nextInt();
				acc.debit(a);
			}
			else if(ch == 3){
				acc.getBalance();
			}
			else if(ch == 4){
				System.out.println("Thanks for your patronage");
				c = 1;
			}
			else{
				System.out.println("Please enter correct choice");
			}
		}
		while(c == 0);
	}
}