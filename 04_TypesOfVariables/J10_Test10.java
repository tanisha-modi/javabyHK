// 

public class J10_Test10 {
    public static void main(String[] args) {
        J10_Example.m1();
        System.out.println();

        J10_Example e3 = new J10_Example();
        J10_Example e4 = null;

        // System.out.println(a);   // a only accessed using class name or object 
        System.out.println(J10_Example.a);   // 10
        System.out.println(e3.a);            // 10
        System.out.println(e4.a);            // 10

        // System.out.println(x);   // a only accessed object 
        // System.out.println(J10_Example.x);   // non-static
        System.out.println(e3.x);           //20
        // System.out.println(e4.x);        // RE : null

    }
}
