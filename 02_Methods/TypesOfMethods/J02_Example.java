public class J02_Example {
    static void m1(){    // called method 
        System.out.println("Hello");
        
    }
    public static void main(String[] args) {
        System.out.println("main");     // calling method 
        m1();
        System.out.println("how are you ?");
    }
    static void m2(){
        System.out.println("what about u ?");
    }
}
