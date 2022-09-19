import org.w3c.dom.ls.LSOutput;

public class TypesOfVariables {
    // local variable
    //  class variable
    // instance variable

  static  int x=100; // class

   public void set(int c)
   {
       x=c;
   }

   public void get()
   {

       System.out.println(x);
   }

    public static void main(String[] args) {
        TypesOfVariables obj = new TypesOfVariables();
      obj.set(50);
     // obj.get();

        TypesOfVariables obj1 = new TypesOfVariables();
        obj.set(100);
        obj1.get();


    }

}
