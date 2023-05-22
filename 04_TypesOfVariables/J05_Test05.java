public class J05_Test05 {
    static int a;
    int x;        // non-static variable 
        public static void main(String[] args) {
            int p;


            J05_Test05 t1 = new J05_Test05();

            System.out.println(a);         // default value 0
            System.out.println(t1.x);      // default value 0    
            // System.out.println(p);     // CE : p not initialized // local variable // no default value 
        }
}
