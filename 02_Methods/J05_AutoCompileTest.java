public class J05_AutoCompileTest {
    public static void main(String[] args){
        System.out.println("Test main");
        J05_AutoCompileA.m1();
       // J05_AutoCompileB.m2();   // if this line is commented then, J05_AutoCompileB.java(B.java) will not get autocompiled as we haven't accessed 
                                   // class J05_AutoCompileB in either class J05_AutoCompileA(A.java) or in class J05_AutoCompileTest(Test.java)
     }                               
}
