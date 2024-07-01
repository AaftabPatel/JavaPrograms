import java.util.Scanner;
class Employee{
	String fname,lname;
	double salary;
	Scanner sc = new Scanner(System.in);
	Employee(){
		System.out.print("Please enter the first name of employee:");
		fname = sc.nextLine();
		System.out.print("Please enter the last name of employee:");
		lname = sc.nextLine();
		System.out.print("Please enter the monthly salary:");
		salary = sc.nextDouble();
	}
	
	void display(){
		System.out.println("name of employee is:"+fname+" "+lname);
		System.out.println("Yearly Salary of employee is:"+(salary*12));	
	}
}

class EmployeeTest{
	public static void main(String args[]){
		System.out.println("PROGRAM FOR EMPLOYEE DETAILS-");
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		System.out.println("Information of Employee1 is:");
		e1.display();
		
		System.out.println("Information of Employee2 is:");
		e2.display();
		
		System.out.println("Salary of Employee1 after 10% raise  is:");
		System.out.println((e1.salary+(e1.salary/10))*12);
		
		System.out.println("Salary of Employee2 after 10% raise  is:");
		System.out.println((e2.salary+(e2.salary/10))*12);
	}
}