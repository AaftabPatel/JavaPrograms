import java.util.Scanner;
class Area{
	float ar;
	Area(float s){
		ar = s*s;
		System.out.print("Area of Square is:"+ar+"sq unit");
	}
	
	Area(float l, float b){
		ar = l*b;
		System.out.print("Area of Rectangle is:"+ar+"sq unit");
	}
	
	Area(float half,float base, float height){
		ar = half*base*height;
		System.out.print("Area of Right Angled Triangle is:"+ar+"sq unit");
	}
}
class Overloading{
	public static void main(String args[]){
		System.out.println("Welcome to Area Finder");
		int c = 0;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("\nPress 1 for Square:");
			System.out.println("Press 2 for Rectangle:");
			System.out.println("Press 3 for Triangle:");
			System.out.println("Press 4 for Exit:");
			System.out.print("Please choose the figure whose area you want:");
			int ch = sc.nextInt();
			
			if(ch == 1){
				System.out.print("Please enter the side of square:");
				float a = sc.nextFloat();
				Area sqar = new Area(a);
			}
			else if(ch == 2){
				System.out.print("Please enter the Length of rectangle:");
				float ln = sc.nextInt();
				System.out.print("Please enter the Bredth of rectangle:");
				float br = sc.nextFloat();
				Area recar = new Area(ln,br);
			}
			else if(ch == 3){
				System.out.print("Please enter the Base of Triangle:");
				float b = sc.nextFloat();
				System.out.print("Please enter the Height of Triangle:");
				float h = sc.nextInt();
				Area triar = new Area(0.5f,b,h);
			}
			else if(ch == 4){
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