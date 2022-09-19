public class LoopingStmt {
    // looping stmt .. iterative stmt
    // entry controlled (for .. while) ... exit controlled(do while)
    public static void main(String[] args) {

//
//        int i;
//        for(i=1 ;i<=5;i=++i)
//        {
//            System.out.println(i); // 6
//        }
// int i;
// i=1;
//        while(i<=5)
//        {
//            System.out.println(i);
//            i++;
        // }

        int i=1;
        do
        {
            System.out.println(i);
            i++;

        }while(i<=5);


    }
}