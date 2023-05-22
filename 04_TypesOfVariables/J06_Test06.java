// dafualt values of diff data types 

public class J06_Test06 {
    static byte b1;     // class level variables
    static short s1;
    static int i1;
    static long l1;
    static float f1;
    static double d1;
    static char ch1;
    static boolean b01;

    static String str1;

    static J01_Example e1 ;
    static int[] ia;
    static boolean[] ba;

    static J01_Example[] ea;

    static int[] ia2 = new int[5];
    static boolean[] ba2 = new boolean[5];

    J01_Example[] e2 = new J01_Example[5];

    public static void main(String[] args) {
        System.out.println("b1 : " + b1);     // 0   //primitive
        System.out.println("s1 : " + s1);     // 0
        System.out.println("i1 : " + i1);     // 0
        System.out.println("l1 : " + l1);     // 0
        System.out.println("f1 : " + f1);     // 0.0
        System.out.println("d1 : " + d1);     // 0.0
        System.out.println("ch1 : " + ch1);   // '\0' [null character]
        System.out.println("b01 : " + b01);
        System.out.println();

        char ch2 = ' ';
        System.out.println(ch1 == ch2);  //false  // ch1 contain null character but not space, so we got false
        char ch3 = '\0';
        System.out.println(ch1 == ch3);  //true
        char ch4 = '\u0000'; //null
        System.out.println(ch1 == ch4);  //true 
        System.out.println(ch3 == ch4);  //true

        System.out.println();

        System.out.println("str1 : " + str1);  //null   //referenced
        System.out.println("e1 : " + e1);    //null
        System.out.println("ia : " + ia);    //null
        System.out.println("ba : " + ba);    //null

        int p;
        boolean q;
        String r;
        int[] s;
        J01_Example t;
    }
}
