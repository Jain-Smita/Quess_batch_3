import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {

        byte sub1,sub2,sub3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of Math");
        sub1 = sc.nextByte();

        System.out.println("Enter the marks of English");
        sub2 = sc.nextByte();

        System.out.println("Enter the marks of Science");
        sub3 = sc.nextByte();

        float avg_marks = (sub1+sub2+sub3)/(float)3; //

        System.out.println("Average marks = " + avg_marks);

    }
}
