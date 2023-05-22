// below program shows local variables rules

public class J13_Test13 {
    public static void main(String[] args) {
        
        // Rule 1 :
        int p = 10;
        System.out.println(p);

        // Rule 2 : without initializing we cant read local variables value
        int q;
        // System.out.println(q);

        // Rule 3 : we can not access LV before its declaration 
        // System.out.println(r); // compile time error
        int r = 30;

    }

    static void m1(){
        // Rule 1 : we cant access one method's local variable in another method 
        // it loads to CE : cfs
        // System.out.println(p); 
    }
}


// local variable can be accessed to another method by :
// 1. pass local variable as argument 
// 2. increase scope of object variable to class level either as static or non-statis variable
