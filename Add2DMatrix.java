import java.util.Scanner;
class Add2DMatrix{
    static void showMatrix(int a[][]){  //function to display matrix
        for(int i = 0; i<2;i++){
            for(int j = 0; j<2;j++){
                System.out.print(a[i][j]+"    ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]){
        System.out.println("PROGRAM TO ADD TWO 2D MATRICES-");
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[2][2] ; 
        int arr2[][] = new int[2][2] ; 
        int sum[][] = new int[2][2] ; 
        //taking elements of first matrix
        System.out.println("Please enter the elements of matrix1-");
        System.out.print("Please enter the element a11:");
        arr1[0][0] = sc.nextInt();
        System.out.print("Please enter the element a12:");
        arr1[0][1] = sc.nextInt();
        System.out.print("Please enter the element a21:");
        arr1[1][0] = sc.nextInt();
        System.out.print("Please enter the element a22:");
        arr1[1][1] = sc.nextInt();
        //taking elements of second matrix
        System.out.println("Please enter the elements of matrix2-");
        System.out.print("Please enter the element a11:");
        arr2[0][0] = sc.nextInt();
        System.out.print("Please enter the element a12:");
        arr2[0][1] = sc.nextInt();
        System.out.print("Please enter the element a21:");
        arr2[1][0] = sc.nextInt();
        System.out.print("Please enter the element a22:");
        arr2[1][1] = sc.nextInt();

        System.out.println("Matrix1 is:");
        showMatrix(arr1);
        System.out.println("Matrix2 is:");
        showMatrix(arr2);
 
        for(int i = 0; i<2;i++){
            for(int j = 0; j<2;j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Matrix Sum is:");
        showMatrix(sum);
    }
}