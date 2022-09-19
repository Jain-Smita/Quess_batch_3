public class LabelledFor {
    // new concept in java

    public static void main(String[] args) {
       for1: for(int i = 1;i<=5;i++) //
        {
           for2: for(int j=1;j<=5;j++) //
            {
               for3: for(int k = 1;k<=5;k++) {
                    if (j == 3)
                        break for1;
                }
                System.out.print(j + "  "); //
            }
            System.out.println();
        }
    }

}
