
class J02_Test02 {
    public static void main(String[] args){
        int p = 10;
        double[] da = {10.5, 20.6};
        J01_Example e1 = new J01_Example();
        
        System.out.println("p : " + p);
        System.out.println("da : " + da);
        System.out.println("e1 : " + e1);
        System.out.println("e1.x : " + e1.x);
        
        int i1 = 10;
        int i2 = 20;
        int i3 = i1 + i2;
        
        J01_Example e2 = new J01_Example();
        // J01_Example e3 = e2 + e3 ;   // CE : bad ooperand types for binary +
       

        // special points on String object
        String s1 = "abc";
        System.out.println(s1);        //abc
        System.out.println();

        String s2 = "bbc";
        String s3 = s2 + s1;         // String concatenation operator  ( + operator only allowwed in String in all Referenced variables)
        System.out.println(s3);  

        // String s4 = s1 - s2;    // not allowed 
        // String s4 = s1 * s2;    // not allowed 
        // String s4 = s1 / s2;    // not allowed 




        
        
        
    }
}
