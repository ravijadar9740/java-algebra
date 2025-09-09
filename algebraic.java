import java.util.*;
public class algebraic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers...");
        System.out.print("First number : ");
        double a = sc.nextDouble();
        System.out.print("Second number : ");
        double b = sc.nextDouble();
        System.out.println("Enter the Operation to be performed ; For :\naddition 1,\nSubtraction 2,\nMultiplication 3,\nDivition 4 ");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("Addition of two numbers is : "+ (a+b));
        }
        else if(n==2){
            System.out.println("Subtraction of two numbers is : "+ (a-b));
        }
        else if(n==3){
            System.out.println("Multiplication of two numbers is : "+ (a+b));
        }
        else if(n==4){
            if(b!=0){
                System.out.println("Division of two numbers is : "+ (a/b));
            }
            else{
                System.out.println("Denominator should not be zero ");
            }
        }
        else{
            System.out.println("Enter the valid number for operation !");
        }
        System.out.println();
    }
}