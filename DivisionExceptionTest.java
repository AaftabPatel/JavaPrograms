import java.util.Scanner;
class DivisionExceptionTest{
    public static void main(String[] args){
        System.out.println("PROGRAM FOR DIVISION BY ZERO EXCEPTION HANDLING-");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a = sc.nextInt();;
        System.out.print("Enter value of b:");
        int b = sc.nextInt();;
        try {
            System.out.println(a / b); // throw Exception
        }
        catch (ArithmeticException e) {
            System.out.println("Divided by zero operation cannot possible");
        }
    }
}