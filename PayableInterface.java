import java.util.Scanner;
interface Payable{
	double getAmount();
}
//class employee implements payable
class Employee implements Payable{
	String fname;
	String lname;
    Scanner sc = new Scanner(System.in);
    double sal;
	void setData(){
		System.out.print("Please enter the first name of the employee:");        
        fname = sc.nextLine();
        System.out.print("Please enter the last name of the employee:");        
        lname = sc.nextLine();
		System.out.print("Please enter the salary of the employee:");        
		sal = sc.nextDouble();
	}
	
	public double getAmount(){
		return sal;
	}
	void show(){
		System.out.println("Name: "+fname+" "+lname);
	}
}
//class employee implements payable
class PayableInterface {
	public static void main(String args[]){
		System.out.println("PROGRAM FOR PAYABLE INTERFACE-");
		Employee e=new Employee();
		e.setData();
		double sal=e.getAmount();
		e.show();
		System.out.println("Salary : "+sal);
	}
}