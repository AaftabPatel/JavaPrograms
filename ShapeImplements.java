import java.util.Scanner;
class Shape{
    Scanner sc = new Scanner(System.in);
	String getName(){
        System.out.print("Please enter the name of shape:");
        String name = sc.nextLine();
        return name;
	}
}
//class Two Dimention extends class shaoe
class TwoDim extends Shape{
    int l,b,h,ar,p;
    String name;
    TwoDim(){
        name = super.getName();
    }
    Scanner sc = new Scanner(System.in);
    void getDim(){ 
        System.out.print("Please enter the height:");
        h = sc.nextInt();
        System.out.print("Please enter the width:");
        b = sc.nextInt();
    }
    void area(){
        ar = h*b;
        System.out.println("Area of "+name+" is: "+ar);
    }

    void peri(){
        p = 2*(h+b);
        System.out.println("Perimeter of "+name+" is: "+p);
    }
}
//class Three Dimention extends class shaoe
class ThreeDim extends Shape{
    int l,b,h,ar,v;
    String name;
    ThreeDim(){
        name = super.getName();
    }
    Scanner sc = new Scanner(System.in);
	void getDim(){ 
        System.out.print("Please enter the height:");
        h = sc.nextInt();
        System.out.print("Please enter the width:");
        b = sc.nextInt();
        System.out.print("Please enter the length:");
        l = sc.nextInt();
    }
    void area(){
        ar = 2*(l*h + l*b+ h*b);
        System.out.println("Area of "+name+" is: "+ar);
    }
    void volume(){
        v = h*b*l;
        System.out.println("Volume of "+name+" is: "+v);
    }
}

class ShapeImplements{
	public static void main(String args[]){
		System.out.println("Welcome to Shape area/volume finder-");
		int c = 0;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("\nPress 1 for Two Dimentional Shape:");
            System.out.println("Press 2 for Three Dimentional Shape:");
			System.out.println("Press 3 for Exit:");
			System.out.print("Please choose:");
			int ch = sc.nextInt();
			
			if(ch == 1){
				TwoDim twod = new TwoDim();
                twod.getDim();
                twod.peri();
                twod.area();
			}
			else if(ch == 2){
				ThreeDim threed = new ThreeDim();
                threed.getDim();
                threed.area();
                threed.volume();
            }
			else if(ch == 3){
				System.out.println("Thank you");
				c = 1;
			}
			else{
				System.out.println("Please enter correct choice");
			}
		}
		while(c == 0);
	}
}