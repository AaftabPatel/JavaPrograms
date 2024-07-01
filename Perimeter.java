import java.util.Scanner;
class FindPerimeter{
	float p;
	FindPerimeter(float s){
		p = s*4;
		System.out.print("Perimeter of Square is:"+p+"sq unit");
	}
	
	FindPerimeter(float l, float b){
		p = 2*(l+b);
		System.out.print("Perimeter of Rectangle is:"+p+"sq unit");
	}
	
	FindPerimeter(float s1,float s2, float s3){
		p = s1+s2+s3;
		System.out.print("Perimeter of  Triangle is:"+p+"sq unit");
	}
}
class Perimeter{
	public static void main(String args[]){
		System.out.println("Welcome to Perimeter Finder");
		int c = 0;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("\nPress 1 for Square:");
			System.out.println("Press 2 for Rectangle:");
			System.out.println("Press 3 for Triangle:");
			System.out.println("Press 4 for Exit:");
			System.out.print("Please choose the figure whose Perimeter you want:");
			int ch = sc.nextInt();
			
			if(ch == 1){
				System.out.print("Please enter the side of square:");
				float a = sc.nextFloat();
				FindPerimeter sqar = new FindPerimeter(a);
			}
			else if(ch == 2){
				System.out.print("Please enter the Length of square:");
				float ln = sc.nextFloat();
				System.out.print("Please enter the Bredth of square:");
				float br = sc.nextFloat();
				FindPerimeter recar = new FindPerimeter(ln,br);
			}
			else if(ch == 3){
				System.out.print("Please enter the first side of triangle:");
				float side1 = sc.nextFloat();
				System.out.print("Please enter the first side of triangle:");
				float side2 = sc.nextFloat();
				System.out.print("Please enter the first side of triangle:");
				float side3 = sc.nextFloat();
				FindPerimeter tri = new FindPerimeter(side1, side2, side3);
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