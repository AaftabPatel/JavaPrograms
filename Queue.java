import java.util.Scanner;
class QueueImplement{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		int first = -1, last = -1;
		void insert(){			//method to push an element
			if(first == 20){
				System.out.println("Overflow");
			}
			else{
				if(first == -1)
					first = 0;
				last++;
				System.out.print("Please enter the value to push:");
				int n = sc.nextInt();
				arr[last] = n;
				System.out.println("Inserted element is: "+n);
			}		
		}
		
		int remove(){			//method to pop an element
			if(first == -1){
				System.out.println("Queue is Empty!!!");
				return (-1);
			}
			else{
				int val = arr[first];
				if(first >= last){
					first = -1;
					last = -1;
				}	
				else
					first++;
				return val;
			}
		}
		
		void display(){			//method to print the Queue
			if(first == -1)
				System.out.println("Queue is Empty!!!");
			else{
				for(int i=first;i<=last;i++)
					System.out.print(arr[i]+", ");
			}
			System.out.println();
		}
}

class Queue{
	public static void main(String args[]){
		QueueImplement que = new QueueImplement();
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM FOR QUEUE-");
		int c = 0;
		do{
			
			System.out.println("1: for adding element in queue");
			System.out.println("2: for removing element in queue");
			System.out.println("3: for queue display");
			System.out.println("4: for Exit");
			System.out.print("Please Choose What you want to do:");
			int ch = sc.nextInt();
			if(ch == 1)
				que.insert();
			else if(ch == 2){
				int val = que.remove();
				if(val == -1)
					System.out.println("Underflow");
				else
					System.out.println("Removed value is: "+val);
			}
			else if(ch == 3)
				que.display();
			else if(ch == 4)
				c = -1;
			else
				System.out.println("Please enter correct choice");
		}
		while(c != -1);
	}
}