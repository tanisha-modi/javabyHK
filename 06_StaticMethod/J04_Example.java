 

public class J04_Example {
    static int a = 10;

    static void m1(){
        a = 50;
    }
    static void m2(){
        System.out.println("From m2 a : " + a); // 10 //50 // 60
    }
}
