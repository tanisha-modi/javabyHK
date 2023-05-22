public class J04_Test04 {
    public static void main(String[] args) {
        // i = 10; CE:  c f s 

        int i1;    
        i1 = 10;
        int i2 = 20;
        // System.out.println(i3); // CE : c f s 
        int i3;
        // System.out.println(i3);    // CE : var is not initialized   // local variables does not have defualt values
        
        i3 = 30;
        System.out.println(i3);

        J04_Test04 t1 = new J04_Test04();
        System.out.println(t1.i5);    // no error // non-static but accessed using object  // default value = 0  

        System.out.println(i4);  // no error   // static in class  // deafault value = 0
        }

        static int i4;
        int i5;
}
