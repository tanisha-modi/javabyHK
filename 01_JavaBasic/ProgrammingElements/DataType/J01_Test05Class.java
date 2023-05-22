class Example{             // this class is just meant for storing data
    int i = 5;             // to act as data type. so we do not create main method 
    double d = 6.7;        // As compiler and JVM we can create main method this class but 
    char ch = 'a';         // as per project, it is a bad program practice 
    long[] la = {8,9};
    String s = "hari";
}

// we must create main method in diff class 
// In order to access all above variables, we must 
// provide memory. To provide group memory with one 
// common name we msut create object by using new 
// keyword as shown in the below program. 

public class J01_Test05Class {
    public static void main(String[] args) {
        Example e = new Example();
        System.out.println(e);

        System.out.println(e.i);
        System.out.println(e.d);
        System.out.println(e.ch);
        System.out.println(e.la);
        System.out.println(e.la[0]);
        System.out.println(e.la[1]);
        System.out.println(e.s);
         
    }
}
