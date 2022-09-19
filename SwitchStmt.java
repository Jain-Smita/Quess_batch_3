import java.util.Scanner;

public class SwitchStmt {
    public static void main(String[] args) {

        // Menu driven ...
        // Arithmatic operations...

        Scanner sc = new Scanner(System.in);
        int num1, num2;
        int res;

        System.out.println("1. Addition \n 2 Subtraction \n 3. Multiplication \n 4. Division \n 5. Reminder\n");
        int choice = sc.nextInt();

      final  int x=1;
        int y =2;
//        System.out.println("Enter any two numbers");
//        num1=sc.nextInt();
//        num2 = sc.nextInt();

        switch(choice)
        {
            default:
                System.out.println("Invalid choice");
                //break;

            case  1 :

                System.out.println("Enter any two numbers");
                num1=sc.nextInt();
                num2 = sc.nextInt();
                res= num1+num2;
                System.out.println("Addition = "+ res);
                break;

            case 2 :
                System.out.println("Enter any two numbers");
                num1=sc.nextInt();
                num2 = sc.nextInt();
                res= num1-num2;
                System.out.println("Subtraction = "+ res);
                break;

            case 3 :
                System.out.println("Enter any two numbers");
                num1=sc.nextInt();
                num2 = sc.nextInt();
                res= num1*num2;
                System.out.println("Multiplication = "+ res);
                break;

            case 4 :
                System.out.println("Enter any two numbers");
                num1=sc.nextInt();
                num2 = sc.nextInt();
                res= num1/num2;
                System.out.println("Division = "+ res);
                break;

            case 5 :
                System.out.println("Enter any two numbers");
                num1=sc.nextInt();
                num2 = sc.nextInt();
                res= num1%num2;
                System.out.println("Reminder = "+ res);
                break;



        }
    }
}
