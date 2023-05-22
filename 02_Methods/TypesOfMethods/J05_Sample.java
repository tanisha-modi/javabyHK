// class Example{
//     // void m1(){
//     static void m1(){
//         System.out.println("hi");   //overridden method 
//     }
// }

// public class J05_Sample extends Example{
//     // void m1(){
//     static void m1(){  // overridding method
//         System.out.println("hello : overridden");    //method overridding  
//     }
//     public static void main(String[] args) {
//     //   J05_Sample n1 = new J05_Sample();
//     //   n1.m1();
//     m1();
//     //   Example e1 = new Example();
//     //   e1.m1();
//     }
// }

class Example{
    void m1(){
    // static void m1(){
        System.out.println("hi");   //overridden method 
    }
}

class Subclass extends Example{
    void m1(){
        System.out.println("hello : overridden");    //method overridding   
    }
}
class J05_Sample{
    public static void main(String[] args) {

        Example e2 = new Subclass(); // object of subclass 
        e2.m1();

        Example e1 = new Example(); // object of example
        e1.m1();
    }
}