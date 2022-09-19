import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class ConditionalStatements {

    // Control flow stmt .... conditional .. looping ... jumping

    // Conditional ... simple if ... if else ... nested if... else if ladder ... Switch
    public static void main(String[] args) {

        // Else if ladder ...
        float per;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage ");
        per= sc.nextFloat();


        if(per<=100 && per >=75) {
            System.out.println("You are PASS with A+");
        }
        else if(per <=74 && per >=60)
        {
            System.out.println("You are PASS with A");
        }
        else if(per <=59 && per >=50)
            System.out.println("You are PASS with B");
        else if(per <=49 && per >=40)
            System.out.println("You are PASS with C");
        else if(per <=39 && per >=0)
            System.out.println("Sorry you are Fail, Try again");
        else
            System.out.println("Invalid percentage");
//        byte age;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age");
//
//        age=sc.nextByte();
//
//        if(age>=18)
//        {
//            boolean havingVotingCard;
//            System.out.println("Do you have your voting card ? (yes/no)");
//            sc.nextLine();
//            String str = sc.nextLine();
//            // smita == SMITA
//
//            if(str.equalsIgnoreCase("yes"))
//                havingVotingCard =true;
//            else
//                havingVotingCard=false;
//
//            if(havingVotingCard)
//                System.out.println("You can VOTE");
//            else
//                System.out.println("You need create your voting card");
//        }
//        else
//        {
//            System.out.println("Sorry you can not Vote... You need to wait "+ (18-age) + " years");
//        }

    }
}
