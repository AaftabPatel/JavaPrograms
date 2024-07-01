import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.lang.Thread;
import java.util.*;

class MultiSort{
	static int[] merge(int arr1[], int arr2[], int size){
		int arr[] = new int[size];
		int i=0,j=0,k=0;
		while(k <= size){
			
			if(i == arr1.length){
				for(int t=j; t<arr2.length; t++){
					arr[k] = arr2[t];
				}
				break;
			}
			if(j == arr2.length){
				for(int t=i; t<arr1.length; t++){
					arr[k] = arr1[t];
				}
				break;
			}
			
			if(arr1[i] < arr2[j]){
				arr[k] = arr1[i];
				i++;
				k++;
			}
			
			else if(arr1[i] > arr2[j]){
				arr[k] = arr2[j];
				j++;
				k++;
			}
			
			else{
				arr[k] = arr1[i];
				arr[k+1] = arr2[j];
				i++;
				j++;
				k+=2;
			}
		}
		return arr;
	}
	
	public static void main(String args[]){
		int[] NoArr = new int[20];
		int[] NoArrSorted = new int[20];
		int swap;
		Thread t1,t2,t3,t4;
		Scanner sc = new Scanner(System.in);	
		Random r = new Random();
		
		for(int i = 0; i<20; i++){
			NoArr[i] = r.nextInt(40);
		}
		
		int[] NoArr1 = Arrays.copyOfRange(NoArr, 0, 5);
		int[] NoArr2 = Arrays.copyOfRange(NoArr, 5, 10);
		int[] NoArr3 = Arrays.copyOfRange(NoArr, 10, 15);
		int[] NoArr4 = Arrays.copyOfRange(NoArr, 15, 20);
		
		try{
			System.out.println(new SimpleDateFormat("mm:ss.SSS").format(new Date()));
			
			Sort s1 = new Sort(NoArr1);
			Sort s2 = new Sort(NoArr2);
			Sort s3 = new Sort(NoArr3);
			Sort s4 = new Sort(NoArr4);
		
			t1 = new Thread(s1,"First Thread");
			t2 = new Thread(s2,"Second Thread");
			t3 = new Thread(s3,"Third Thread");
			t4 = new Thread(s4,"Fourth Thread");
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			
			System.out.println(new SimpleDateFormat("mm:ss.SSS").format(new Date()));
		
		}catch(InterruptedException e){
			System.out.println("Error:"+e);
		}
		
		int mergeArr1[] = merge(NoArr1,NoArr2,(NoArr1.length+NoArr2.length));
		int mergeArr2[] = merge(NoArr3,NoArr4,(NoArr3.length+NoArr4.length));
		int mergeArr[] = merge(mergeArr1,mergeArr2,(mergeArr1.length+mergeArr2.length));
		
		System.out.println(new SimpleDateFormat("mm:ss.SSS").format(new Date()));
		
		for(int i = 0; i<mergeArr.length; i++)
			System.out.println(mergeArr[i]);
		
		for(int i=0;i<20;i++){
			for(int j=1;j<20-i;j++){
				 if(NoArr[j-1] > NoArr[j]){  
					//swap elements  
					swap = NoArr[j-1];  
                    NoArr[j-1] = NoArr[j];  
                    NoArr[j] = swap;  
                }  
			}
		}
		System.out.println(new SimpleDateFormat("mm:ss.SSS").format(new Date()));
		for(int i = 0; i<NoArr.length; i++)
			System.out.println(NoArr[i]);
		
	}
}

class Sort implements Runnable{
	int Arr[];
	int swap;
	
	public Sort(int Arr[]){
		this.Arr = Arr;
	}
	
	@Override
	public void run(){
		for(int i = 0; i < 5; i++){
			for(int j = 1; j < 5-i; j++){
				 if(Arr[j-1] > Arr[j]){  //swap elements  
					swap = Arr[j-1];  
                    Arr[j-1] = Arr[j];  
                    Arr[j] = swap;  
                }  
			}
		}
	}
}