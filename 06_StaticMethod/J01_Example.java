 // variable shadowing 
 // ====================
 /*
  - Creating a local variable or a parameter with the same
   class level variable name is callled varialbe shadowing 

   - The local variable becomes the shadow of class level variable 

   - In variable shadowing in presence of LV, if we want to access SV 
   we must accesss SV by using clss name explicitly

   Q1) what is the problem with VS ?
   - only LV is read or modify.

   Q2) what is the solution for VS ?
   - we must access SV by using class name 
  */

public class J01_Example {
    static int a = 10;

    public static void main(String[] args) {
        int a = 50;

        System.out.println(a);    //LPA -> 50
        System.out.println(J01_Example.a);   // 10
    }
}
