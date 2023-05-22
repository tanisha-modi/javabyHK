// Below program explains local variable lifetime and scope : that means below program shows just by declaring local variable,
// it will not be provided memory until its declaration statement is executed.

public class J12_Test12 {
    static void m1(int p){
         int q = 60;
         if(p == 50){
             int r = 70;
             System.out.println(p);
             System.out.println(q);
             System.out.println(r);
            }
            System.out.println(p);
            System.out.println(q);
            // System.out.println(r);  // r is local variable of if statement only and accessed using it only
            // System.out.println(s)   // cant be accessed before its declaration
            int s = 80;
            
    }
    public static void main(String[] args) {
        
        // how many varibles are provided memory in this method call ? 
        m1(50);   // 3 variables p, q, r
        m1(30);   // 2 variables p and q
                  //variable r is not provided memory because its declaration statement is not executed, coz condition is false
    }
}
