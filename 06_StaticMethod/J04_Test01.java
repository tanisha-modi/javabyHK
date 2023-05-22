 

public class J04_Test01 {
    public static void main(String[] args) {
        System.out.println("original value");
        System.out.println("From mm a : " + J04_Example.a);  // 10
        J04_Example.m2();
        
        J04_Example.m1();

        System.out.println("\nAfter modifying a value in m1 method");
        System.out.println("From mm a : " + J04_Example.a); // 50
        J04_Example.m2();

        J04_Example.a = 60;

        System.out.println("\nAfter modifying a value in main method ");
        System.out.println("From main method a : " + J04_Example.a);  // 60
        J04_Example.m2();

    }
}
