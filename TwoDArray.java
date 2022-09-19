import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        // matrix
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want ");
        byte row = sc.nextByte();

        System.out.println("How many columns you want");
        byte col = sc.nextByte();

        int [][]arr = new int[row][col]; // row col

        for(int i = 0; i<row;i++)
        {
            for(int j =0;j<col;j++)
            {
                System.out.println("Enter a element");
                arr[i][j]=sc.nextInt();
            }

        }

        System.out.println("The given matrix is :");
        for(int i = 0; i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
