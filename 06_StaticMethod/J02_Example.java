 

public class J02_Example {
    static int a = 10;
    static int  b = 20;

    public static void main(String[] args) {
        System.out.println(a);   //Example.a = 10
        System.out.println(b);   //Example.b = 20

        int a = 50;

        System.out.println(a);  // a = 50
        System.out.println(J02_Example.a);  // Example.a = 50
        System.out.println(b);              // b = 20   // from class level 
        System.out.println(J02_Example.b);  // Example.b = 20
        
        a = 70;

    }

}
