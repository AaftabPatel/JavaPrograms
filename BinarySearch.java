import java.util.Scanner;
class BinarySearch{
	static void Search(int arr[], int first, int last, int num){  
	   int mid = (first+last)/2;
	   while(first <= last){
			if(num < arr[mid])
				last = mid-1;
			else if(num == arr[mid]){
				System.out.println("Element is found at index: " + mid);  
				break; 
			}
			else
				first = mid+1;
				
			mid = (first + last)/2;  
	   }
	   if(first > last){
		   System.out.println("Element not found!!");  
	   }
	}  
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM FOR BINARY SEARCH-");
		System.out.print("Please enter the number of elements of array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			System.out.print("Please enter the number"+(i+1)+":");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		//sorting the array using bubble sort
		int temp;
		for(int i=1;i<size;i++){
			for(int j=0;j<size-i;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		//taking the element to search
		System.out.print("Please enter the number to search:");
		int n = sc.nextInt();
		Search(arr,0,size-1,n);
	}
}