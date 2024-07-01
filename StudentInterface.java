import java.util.Scanner;
interface StudentFee{
	double getAmount();
	String getFirstName();
	String getLastName();
	String getAddress();
	String getContact();
}
//class hostler implements student fees
class Hostler implements StudentFee{
	String fname;
	String lname;
	String address;
	String contact;
	double amount;
    Scanner sc = new Scanner(System.in);
    void setData(){
		System.out.print("Please enter the first name of the student:");        
        fname = sc.nextLine();
        System.out.print("Please enter the last name of the student:");    
        lname = sc.nextLine();
        System.out.print("Please enter the address of the student:");        
        address = sc.nextLine();
        System.out.print("Please enter the contact of the student:");        
        contact = sc.nextLine();
		System.out.print("Please enter the fees of the student:");        
        amount = sc.nextDouble();
	}
	public double getAmount(){
		return amount;
	}
	public String getFirstName(){
		return fname;
	}
	public String getLastName(){
		return lname;
	}
	public String getAddress(){
		return address;
	}
	public String getContact(){
		return contact;
	}
}
//class non hostler implements student fees
class NonHostler implements StudentFee{
	String fname;
	String lname;
	String address;
	String contact;
	double amount;
	Scanner sc = new Scanner(System.in);
    void setData(){
		System.out.print("Please enter the first name of the student:");        
        fname = sc.nextLine();
        System.out.print("Please enter the last name of the student:");    
        lname = sc.nextLine();
        System.out.print("Please enter the address of the student:");        
        address = sc.nextLine();
        System.out.print("Please enter the contact of the student:");        
        contact = sc.nextLine();
		System.out.print("Please enter the fees of the student:");        
        amount = sc.nextDouble();
	}
	public double getAmount(){
		return amount;
	}
	public String getFirstName(){
		return fname;
	}
	public String getLastName(){
		return lname;
	}
	public String getAddress(){
		return address;
	}
	public String getContact(){
		return contact;
	}
}

class StudentInterface {
	public static void main(String args[]){
        System.out.println("PROGRAM FOR STUDENT FEE INTERFACE-");
		Hostler h=new Hostler();
		h.setData();
		double amount=h.getAmount();
		String fnm=h.getFirstName();
		String lnm=h.getLastName();
		String address=h.getAddress();
		String contact=h.getContact();
		System.out.println("\nFirst Name : "+fnm+"\nLast Name : "+lnm+"\nAddress: "+address+"\nContact : "+contact+"\n Amount :"+amount);
		NonHostler nh=new NonHostler();
		nh.setData();
		 amount=nh.getAmount();
		 fnm=nh.getFirstName();
		 lnm=nh.getLastName();
		 address=nh.getAddress();
		 contact=nh.getContact();
		System.out.println("\nFirst Name : "+fnm+"\nLast Name : "+lnm+"\nAddress: "+address+"\nContact : "+contact+"\n Amount :"+amount);
	}
}