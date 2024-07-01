import java.util.Scanner;
class LinearSearch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM FOR LINEAR SEARCH-");
		System.out.print("Please enter the number of elements of array you want:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int elem,indx = -1;
		for(int i=0;i<size;i++){
			System.out.print("Please enter the "+i+" element:");
			elem = sc.nextInt();
			arr[i] = elem;
		}
		
		System.out.print("Please enter the number you want to search:");
		int e = sc.nextInt();
		
		for(int i=0;i<size;i++){
			if(arr[i] == e){
				indx = i;
				break;
			}
		}
		if(indx == -1)
			System.out.println("element "+e+" not found !!!");
		else
			System.out.println("element "+e+" found at index: "+indx);
	}
}