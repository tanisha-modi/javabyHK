// Identify how many variables are declared in the below program, how many variables are provided memory in which order 

public class J16_Test16 {
    static int a = 10;
    static int b = 20;

    int x = 30;
    int y = 40;

    public static void main(String[] args) {
        int p = 50;
        int q = 60;

        J16_Test16 n1 = new J16_Test16();
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        System.out.println("n1 : " + n1);
        // System.out.println("x : " + x); // non-static
        // System.out.println("y : " + y); // non-static

        System.out.println("x : " + n1.x);  // non-static x accessed using object 
        System.out.println("y : " + n1.y);  
        
        System.out.println("args : " + args);
        System.out.println("length : " + args.length );
    }
}

// --> 8 variables are declared : a b x y args p q n1
// --> all 8 variables are provided memory in order : a b args p q x y
