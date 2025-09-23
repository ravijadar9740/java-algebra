import java.util.*;
public class student {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("HELLO!");
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter the number of subjects you have : ");
        int n = sc.nextInt();
        System.out.println("Enter marks of "+n+" subjects : ");
        int sum = 0;
        for(int i = 0;i<n;i++){
            System.out.println("Enter the marks of "+(i+1)+"st subject :");
            int marks = sc.nextInt();
            sum += marks;
        }
        int avg = sum/n;
        System.out.println("Hey "+age+"th champ , Hello " +name);
        System.out.println("The avg score you got is : "+avg);
        sc.close();

    }
    
}
