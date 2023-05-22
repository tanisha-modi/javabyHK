public class J03_Test {
    public static void main(String[] args) {
        System.out.println("Test main start");

        Example.m1("hello");
        Example.m1("hi");

        System.out.println("Test main end");
    }
}


class Example{
    static void m1(String msg){
        System.out.println(msg);
    }
}
 // output :
 // Test main start 
 // hello
 // hi 
 // test main end