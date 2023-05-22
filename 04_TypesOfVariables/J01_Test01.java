// Develop a program to create a primitive variable and Reference to store
// mathematical value and an object 

// class Example{
//     int x = 10;
//     int y = 20;
// }

public class J01_Test01 {
    public static void main(String[] args) {
        int p = 10;
        int q = m1();
                                          // two method of creating String object
        String s1 = "HK";                 // one object "HK" created and saved in s1
        String s2 = new String("NIT");    // two object created, one object "NIT" is created and then copied to another object and saved in s2
                                          // later the first created object can not be accessed

                                         
        long[] la1 = {123, 456};          // two method of creating long object 
        long[] la2 = new long[]{123, 456};

        J01_Example e1 = new J01_Example();

        System.out.println("p : " + p);
        System.out.println("q : " + q);
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
        System.out.println("e1 : " + e1);
         

    }// Main close 
    static int m1(){
        return 20;
    }
}
