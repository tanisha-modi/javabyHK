// below program shows creating class level 2 types of variables, static and non-static and accessing them.
// (in different ways )


public class J10_Example {
    static int a = 10;
    int x = 20;

    static void m1(){
        System.out.println(a);      // 10 
         // System.out.println(x);  // non-static variable can not be accessed from static method 
         System.out.println(J10_Example.a);  // 10 
        //  System.out.println(J10_Example.x);

        J10_Example e1 = new J10_Example();
        System.out.println(e1.a);    // 10 
        System.out.println(e1.x);    // 20 

        J10_Example e2 = null;
        System.out.println(e2.a);   // 10 
        // System.out.println(e2.x);   // RE : e2 is null, x cannot be read 
         
    }
}
