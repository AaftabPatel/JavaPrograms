import java.util.Scanner;
class Student{
		float m1,m2,m3,m4,m5;
		int rno;
		String name;
		Scanner sc = new Scanner(System.in);
		Student(int i){			//constructor
			System.out.print("Please enter the name of student"+i+":");
			name = sc.nextLine();
			System.out.print("Please enter the roll no of student"+i+":");
			rno = sc.nextInt();
			System.out.print("Please enter the marks of "+name+" in subject1:");
			m1 = sc.nextInt();
			System.out.print("Please enter the marks of "+name+" in subject2:");
			m2 = sc.nextInt();
			System.out.print("Please enter the marks of "+name+" in subject3:");
			m3 = sc.nextInt();
			System.out.print("Please enter the marks of "+name+" in subject4:");
			m4 = sc.nextInt();
			System.out.print("Please enter the marks of "+name+" in subject5:");
			m5 = sc.nextInt();
		}
		float percentage(){			//method for calculating percentage
			return (m1+m2+m3+m4+m5)/5;
		}
	}
	
class StudentPercentage{
	public static void main(String args[]){
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM TO CALCULATE PERCENTAGE OF A STUDENT-");
		System.out.print("Please enter the number of student:");
		size = sc.nextInt();
		Student sarr[] = new Student[size];
		for(int i=0;i<size;i++){
			Student stu = new Student(i+1);	
			sarr[i] = stu;
			float per = sarr[i].percentage();
			System.out.println("percentage of "+sarr[i].name+" Roll no:"+sarr[i].rno+" is "+per);
		}
		
	}
}