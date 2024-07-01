import java.util.Scanner;
class Vehicles{
	String vno, color;
	long ins_no;
	Scanner sc = new Scanner(System.in);
	void getConsumption(){
		
		System.out.print("Please enter the vehicle number:");
		vno = sc.nextLine();
		
		System.out.print("Please enter the color of vehicle:");
		color = sc.nextLine();
		
		System.out.print("Please enter the insurance number:");
		ins_no = sc.nextLong();
	}
	
	void displayConsumption(){
		System.out.println();
		System.out.println("The vehicle number is: "+vno);
		System.out.println("The color of vehicle is: "+color);
		System.out.println("The insurance number is: "+ins_no);
	}
}//END OF CLASS VEHICLE

class TwoWheeler extends Vehicles{
	int avg;
	boolean srv,geared;
	String name,type;
	Scanner sc = new Scanner(System.in);
	TwoWheeler(){
		super.getConsumption();
		System.out.print("Please enter the name of TwoWheeler:");
		name = sc.nextLine();
		System.out.print("Please enter the type of vehicle(electric, diesel, petrol,gas):");
		type = sc.nextLine();
		System.out.print("Please enter true if geared else false:");
		geared = sc.nextBoolean();	
	}
	
	void servicing(){
		System.out.print("Please enter true if servicing done else false:");
		srv = sc.nextBoolean();
	}
	void average(){
		System.out.print("Please enter the Average:");
		avg = sc.nextInt();
	}
	void display(){
		super.displayConsumption();
		System.out.println("The TwoWheeler's Average is: "+avg);
		if(srv == true)
			System.out.println("The servicing is uptodate");
		else
			System.out.println("The servicing is due");
		
		if(geared == true)
			System.out.println("The TwoWheeler is geared");
		else
			System.out.println("The TwoWheeler is not geared");
		System.out.println("The TwoWheeler's Type is: "+type);
	}
}//END OF CLASS TWOWHEELER

class FourWheeler extends Vehicles{
	int avg;
	boolean srv,geared;
	String name,type;
	Scanner sc = new Scanner(System.in);
	FourWheeler(){
		super.getConsumption();
		System.out.print("Please enter the name of FourWheeler:");
		name = sc.nextLine();
		System.out.print("Please enter the type of vehicle(electric, diesel, petrol,gas):");
		type = sc.nextLine();	
		System.out.print("Please enter true if geared else false:");
		geared = sc.nextBoolean();
	}
	void servicing(){
		System.out.print("Please enter true if servicing done else false:");
		srv = sc.nextBoolean();
	}
	void average(){
		System.out.print("Please enter the Average:");
		avg = sc.nextInt();
	}
	void display(){
		super.displayConsumption();
		System.out.println("The TwoWheeler's Average is: "+avg);
		if(srv == true)
			System.out.println("The servicing is uptodate");
		else

			System.out.println("The servicing is due");
		
		if(geared == true)
			System.out.println("The TwoWheeler is geared");
		else
			System.out.println("The TwoWheeler is not geared");
		System.out.println("The TwoWheeler's Type is: "+type);
	}
}//END OF CLASS FOURWHEELER

class Vehicle{
	public static void  main(String args[]){
		System.out.println("POGRAM FOR VEHICLE DETAIL-");
		TwoWheeler tw1 = new TwoWheeler();
		tw1.servicing();
		tw1.average();
		tw1.display();
		FourWheeler fw1 = new FourWheeler();
		fw1.servicing();
		fw1.average();
		fw1.display();
	}
}