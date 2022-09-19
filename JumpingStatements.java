import java.util.Scanner;

public class JumpingStatements {

    public static void main(String[] args) {
        // break continue ...

        Scanner sc = new Scanner(System.in);
        int i;
//        System.out.println("Enter any number");
//        int a= sc.nextInt();

        for( i=1;i<=10;i++)
        {
            if(i==5)
                // break;
                continue;
            System.out.println(i);
            System.out.println("hello");
            //
        }

    }
}
