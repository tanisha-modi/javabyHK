class Example{
    static int a = 10;
    int x = 20;   // non-static 

    static void m1(){
        System.out.println("SM m1 is executed a : " + a);
        // System.out.println(x);  // NS var x not in SM
    }

    void m2(){
        System.out.println("NSM m2 is executed a : " + a);
        System.out.println("NSM m2 is executed x : " + x);
    }
}

public class J08_MehtodwithModifiers {
    public static void main(String[] args) {
        // m1();  // must call using class name or object 
        // m2(); 

        Example.m1();
        // Example.m2(); //non-static //must call using object 

        Example.a = 12;

        Example e1 = new Example();
        Example e2 = new Example();

        e1.a = 90;
        e1.x = 15;

        e2.x = 16;

        e1.m1();
        e2.m1();

        e1.m2();
        e2.m2();

        Example e3 = null;
        e3.m1();
        // e3.m2(); // NPE // or non-static method not accessed coz e3 = null // memory does not allocated 
    }
}
