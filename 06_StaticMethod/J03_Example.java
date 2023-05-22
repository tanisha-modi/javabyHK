public class J03_Example {
    static int a = 10;

    static void m1(){
        a = 50;
    }

    static void m2(){
        System.out.println("From m2 a : " + a);
    }
    public static void main(String[] args) {
        m2();
    }
}

// output depends upon order of calling m1(), m2() method 
