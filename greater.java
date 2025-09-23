import java.util.*;
public class greater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a>b){
            System.out.println(a+" is greater than "+b);
        }
        else if(a<b){
            System.out.println(b+" is greater than "+b);
        }
        else{
            System.out.println(a+" is equal to "+b);
        }
        System.out.println();
        sc.close();
    }
}
