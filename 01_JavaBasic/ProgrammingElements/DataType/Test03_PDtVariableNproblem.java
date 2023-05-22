 // Develop a program to store multiple integers by using primitive data type int.
 // find out problems with primitive data types.

public class Test03_PDtVariableNproblem {
  public static void main(String[] args) {
        int x = 5;
        System.out.println(x);

         x = 6 ;
        System.out.println(x);
        
        int i1 = 5;
        int i2 = 6;
        int i3 = 7;
        int i4 = 8;
        int i5 = 9;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
    }
}

/*
 The problem in above code with PDV :
 When we need to store new value,
 Everytime we must modify source code by adding new variable.
 This type of code is called static nature code.

 It means, if you change source code everytime when we need to store new value,
 it is called static code.
 
 with the static nature code we have other problems too..
 1. we can not store multiple values as one group with single variable name.
 2. we can not pass multiple values as argument to a method with single parameter name.
 3. we can not return multiple values as one group from a method with single return type.

 To solve all above problems we must use referenced data types either array or class.
 */
