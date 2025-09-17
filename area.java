import java.util.*;
public class area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the required number for area : ");
            System.out.println("1 for square \n 2 for rectangle \n 3 for triangle \n 4 for circle \n and 5 for exit :");
            int n = sc.nextInt();
            switch(n){
                case 1 : 
                    System.out.println("You have selected square !");
                    System.out.print("Enter side of the square : ");
                    int side = sc.nextInt();
                    System.out.print("Area of the square is : "+(Math.pow(side,2)));
                    break;
                case 2 : 
                    System.out.println("You have selected rectangle !");
                    System.out.print("Enter length and breadth of the rectangle : ");
                    int len = sc.nextInt();
                    int bre = sc.nextInt();
                    System.out.print("Area of the rectangle is : "+(len*bre));
                    break;
                case 3 : 
                    System.out.println("You have selected triangle !");
                    System.out.print("Enter base and height of the triangle : ");
                    int base = sc.nextInt();
                    int hei = sc.nextInt();
                    System.out.print("Area of the rectangle is : "+((1/2)*base*hei));
                    break;
                case 4 : 
                    System.out.println("You have selected circle !");
                    System.out.print("Enter radius of the circle : ");
                    int rad = sc.nextInt();
                    System.out.print("Area of the circle is : "+(Math.PI*Math.pow(rad,2)));
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    sc.close();  // ✅ Close it only when you're done for good
                    return;
                default :
                    System.out.println("Enter the correct choice !");
                    break;
            }
        }
        
        
    }
    
}
