import java.util.Scanner;
class BubbleSort{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM FOR BUBBLE SORT-");
		System.out.print("Please enter the number of elements of array you want:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int elem;
		for(int i=0;i<size;i++){
			System.out.print("Please enter the "+i+" element:");
			elem = sc.nextInt();
			arr[i] = elem;
		}
		
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
		
		System.out.print("Sorted array is:");
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
	}
}