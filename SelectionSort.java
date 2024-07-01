// Java program for implementation of Selection Sort
import java.util.Scanner;
class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
 
    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        System.out.println("PROGRAM FOR SELECTION SORT-");
        SelectionSort ob = new SelectionSort();
        Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of elements of array you want:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int elem;
		for(int i=0;i<size;i++){
			System.out.print("Please enter the "+i+" element:");
			elem = sc.nextInt();
			arr[i] = elem;
		}

        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}