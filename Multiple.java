import java.util.Scanner;


public class Multiple {
     public static void main(String[] args) {
        System.out.println("PROGRAM FOR CHECKING MULTIPLE-");
        Scanner input=new Scanner(System.in);
        int firstNum=0;
        int secondNum=0;
       
        //accept inputs from users
        System.out.print("Enter first number:");
        firstNum=input.nextInt();
       
        System.out.print("Enter second number:");
        secondNum=input.nextInt();
       
        if(number(firstNum, secondNum)){
        System.out.println(firstNum + " is a multiple of " + secondNum);
        }
        else{
        System.out.println(firstNum + " is  not a multiple of " + secondNum);
        }
       
     }
     public static boolean number(int num1, int num2){
     if((num1%num2)==0)
         return true;
                 else
         return false;
       
     }
   
}