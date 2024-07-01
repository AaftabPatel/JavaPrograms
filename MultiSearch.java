import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.*;
import java.lang.Thread;

class MultiSearch{
	public  static void main(String args[]){
		int NoArr[] = new int[10000];
		int NoToSearch;
		Thread t1,t2,t3,t4;
		Scanner sc = new Scanner(System.in);	
		Random r = new Random();
		for(int i = 0; i<10000; i++){
			NoArr[i] = r.nextInt(20000);
		}
		System.out.print("Please enter the number to search:");
		NoToSearch = sc.nextInt();
		try{
			System.out.println(new SimpleDateFormat("mm:ss.SSS").format(new Date()));
			
			Search s1 = new Search(NoArr,NoToSearch,0,2499);
			Search s2 = new Search(NoArr,NoToSearch,2500,4999);
			Search s3 = new Search(NoArr,NoToSearch,5000,7499);
			Search s4 = new Search(NoArr,NoToSearch,7500,9999);

			t1 = new Thread(s1,"First thread");
			t2 = new Thread(s2,"Second thread");
			t3 = new Thread(s3,"Third thread");
			t4 = new Thread(s4,"Fourth thread");

			t1.start();
			t2.start();
			t3.start();
			t4.start();
			
			t1.join();
			t2.join();
			t3.join();
			t4.join();

			
			System.out.println(new SimpleDateFormat("mm:ss.SSS").format(new Date()));

			if(s1.found)
				System.out.println("Number found at index: "+s1.location+" in First thread");
			else if(s2.found)
				System.out.println("Number found at index: "+s2.location+" in Second thread");
			else if(s3.found)
				System.out.println("Number found at index: "+s3.location+" in Third thread");
			else if(s4.found)
				System.out.println("Number found at index: "+s4.location+" in Fourth thread");
			else
				System.out.println("Number not found");

			System.out.println(new SimpleDateFormat("mm:ss.SSS").format(new Date()));

			for(int k = 0; k <= 9999; k++){
				if(NoArr[k] == NoToSearch){
					System.out.println("Number found at index: "+k+" in Main thread");
				}
			}

		}catch(InterruptedException e){
			System.out.println("Error:"+e);
		}
	}
}

class Search implements Runnable{
	private int NoToSearch,NoArr[],from,to;
	public boolean found;
	public int location;

	public Search(int NoArr[], int NoToSearch, int from, int to){
		this.NoArr = NoArr;
		this.NoToSearch = NoToSearch;
		this.from = from;
		this.to = to;
		found = false;
		location = -1;
	}

	@Override
	public void run(){
		for(int k = from; k <= to; k++){
			if(NoArr[k] == NoToSearch){
				found = true;
				location = k;
			}
		}
	}
}