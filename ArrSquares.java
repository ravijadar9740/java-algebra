import java.util.*;
public class ArrSquares{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("ENTER THE ARRAY OF 10 ELEMENTS : ");
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array you entered is : \n");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        int[] arr1= new int[10];
        for(int i=0;i<10;i++){
           arr1[i] = arr[i]*arr[i];
        }
        int[] com = new int[20];
        System.arraycopy(arr,0,com,0,arr.length);
        System.arraycopy(arr1,0,com,arr.length,arr1.length);
        System.out.println("\n\n THE ARRAY AFTER ADDING SQUARE NUMBERS IS  : \n");
        for(int i=0;i<com.length;i++){
            System.out.print(com[i]+" ");
        }
        sc.close();

    }
}