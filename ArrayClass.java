import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// Array are two types .. one dimensional array ... multidimensional
public class ArrayClass {
    public static void main(String[] args) {


        // Array... collection of variable of similar type
       // int arr[10];  arr[0] arr[1] arr[2] ... arr[9]

        Scanner sc = new Scanner((System.in));
       // int a=50;
        //String[] name = new String[] {"Pratik" , "Smita", "Trisha", "Kannan"};
       // int[] num = new int[]{10,20,30,40,50};
        String[] name = new String[5] ;
        System.out.println("Enter any five name");
        for(int i = 0; i<5;i++)
        {
            name[i]=sc.nextLine();
        }
        System.out.println("The given names are ");
        for(int i = 0; i<5;i++)
        {
            System.out.println(name[i]);
        }

        Arrays.sort(name);
        System.out.println("The given names are in sorted order ");
        for(int i = 0; i<5;i++)
        {
            System.out.println(name[i]);
        }

//        System.out.println("How many elements you want to enter");
//        int n= sc.nextInt();
//        int []arr = new int[n]; // arr[0] arr[1] arr[2] arr[3] arr[4]
//
//
//        for (int i=0;i<n;i++)
//        {
//            System.out.println("Enter a number");
//            arr[i]=sc.nextInt();
//        }
//
//        System.out.println("Numbers are :");
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(arr[i]);
//        }
    }
}
