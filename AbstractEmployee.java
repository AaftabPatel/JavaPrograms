import java.util.Scanner;
abstract class Employee{
	abstract long getAmount();
}
class WeeklyEmployee extends Employee{
    Scanner sc = new Scanner(System.in);
	int weeks,sal;
	void setData(){
	    System.out.print("Please enter the number of weeks worked:");
        weeks = sc.nextInt();
        System.out.print("Please enter the weekly wages:");
        sal = sc.nextInt();
	}
	long getAmount(){
		return (sal*weeks);
	}
}
class HourlyEmployee extends Employee{
    Scanner sc = new Scanner(System.in);
	int hours,sal;
	void setData(){
	    System.out.print("Please enter the number of hours worked:");
        hours = sc.nextInt();
        System.out.print("Please enter the hourly wages:");
        sal = sc.nextInt();
	}
	long getAmount(){
		return (sal*hours);
	}
}
class AbstractEmployee{
	public static void main(String args[])
	{
        System.out.println("PROGRAM TO CALCULATE WAGES OF HOURLY AND WEEKLY WORKERS-");
		WeeklyEmployee we=new WeeklyEmployee();
		we.setData();
		long amount=we.getAmount();
		System.out.println("The amount earned is: "+amount);
		HourlyEmployee he=new HourlyEmployee();
		he.setData();
		amount=he.getAmount();
		System.out.println("The amount earned is: "+amount);
	}

}