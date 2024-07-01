import java.util.Scanner;
class StackImplement{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		int top = -1;
		void push(){			//method to push an element
			if(top == 20){
				System.out.println("Overflow");
			}
			else{
				System.out.print("Please enter the value to push:");
				int n = sc.nextInt();
				top++;
				arr[top] = n;
			}		
		}
		
		int pop(){			//method to pop an element
			if(top == -1){
				System.out.println("Stack is Empty!!!");
				return (-1);
				}
			else{
				int val = arr[top];
				
				arr[top] = 0;
				top--;
				return val;
			}
		}
		
		void display(){			//method to print the stack
			if(top == -1)
				System.out.println("Stack is Empty!!!");
			else{
				for(int i=0;i<arr.length;i++)
					System.out.print(arr[i]+", ");
			}
			System.out.println();
		}
}

class Stack{
	public static void main(String args[]){
		StackImplement stk = new StackImplement();
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM FOR STACK-");
		int c = 0;
		do{
			System.out.println("1: for stack push");
			System.out.println("2: for stack pop");
			System.out.println("3: for stack display");
			System.out.println("4: for Exit");
			System.out.print("Please Choose What you want to do:");
			int ch = sc.nextInt();
			if(ch == 1)
				stk.push();
			else if(ch == 2){
				int val = stk.pop();
				if(val == -1)
					System.out.println("Underflow");
				else
					System.out.println("Removed value is: "+val);
			}
			else if(ch == 3)
				stk.display();
			else if(ch == 4)
				c = -1;
			else
				System.out.println("Please enter correct choice");
		}
		while(c != -1);
	}
}