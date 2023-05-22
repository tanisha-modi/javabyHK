 
// Working with an array
// =====================
/*
 Q1) What is an array and what is the use of an array ? 
   - In java, an array is a referenced data type
   - An array is collection of multiple variables of same type.
   - It is used for storing multipole values of similar type with single name.
     Also it is used for passing and returning multiple values as one group with 
     single parameter name and with single return type.
 */

 // Develop a program to create an array object for storing 5 integers as one group 
 // Explain memory diagram of int[] object and also read and display values from array object.

public class Test04_ArrayDatatypeNItsProblem {
    public static void main(String[] args) {
     int[] ia = {5, 6, 7, 8, 9};  

    //  System.out.println(ia[0]); //5
    //  System.out.println(ia[1]); //6
    //  System.out.println(ia[2]); //7
    //  System.out.println(ia[3]); //8
    //  System.out.println(ia[4]); //9
    //  System.out.println(ia[5]); // CE : j.l.AIOOBE
    //  System.out.println(ia[-1]); // CE : j.l.AIOOBE


    // Dynamic nature code
     for (int i = 0; i < ia.length; i++) {
       System.out.println(ia[i]);   // 5 6 7 8 9 
      }
      System.out.println();
      
      // for (int i = 0; i <= ia.length; i++) {   // 5 6 7 8 9 Exception : AIOOBE
      // for (int i = 0; i < ia.length-1; i++) {   //  5 6 7 8 
      for (int i = 0; i <= ia.length-1; i++) {   //  5 6 7 8 9
         System.out.println(ia[i]);  
        //  System.out.println(ia[0]);  
     }

     System.out.println();

     // java 1.2v  approach to display array values :
     System.out.println(java.util.Arrays.toString(ia));
    // int ia2 = {5, 7, 'a', 10.5, true} // gives CE coz array can not store values of diff data types
    // solution to this we must choose class data type
  }
}

// program : develop a program to store 5 floating point values as one group by using
// an array object. Read and display all values on console in all three approaches.
