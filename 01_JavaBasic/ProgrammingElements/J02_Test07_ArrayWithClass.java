// Develop a program to store multiple objects of a class as one group by using an array 


public class J02_Test07_ArrayWithClass {
    public static void main(String[] args) {
        // Static nature code for storing objects
        // when we nee to store new objects every time
        // we must modify this code by creating new variables

        J02_Xyz x1 = new J02_Xyz();
        J02_Xyz x2 = new J02_Xyz();

        System.out.println(x1);   //J02_Xyz@1010
        System.out.println(x2);   //J02_Xyz@5050

        // Solution : we must create array object with the required number of variables as its size

        J02_Xyz[] xa = new J02_Xyz[3];    // only variables created, we need to create objects
        xa[0] = new J02_Xyz();
        xa[1] = new J02_Xyz();
        xa[2] = new J02_Xyz();

        // Read and Display o index object
        System.out.println("details of 1st object :");
        System.out.println(xa[0].i1);
        System.out.println(xa[0].ch);
        System.out.println(xa[0].sa);
        System.out.println(xa[0].sa[0]);
        System.out.println(xa[0].sa[1]);
        System.out.println(xa[0].s);
        System.out.println(xa[0].a1);
        System.out.println(xa[0].a1.l);
        System.out.println(xa[0].a1.bo);
        
        // Read and display all objects of array using loop 
        
        for (int i = 0; i < xa.length; i++) {          // for loop for displaying array of object
            
            System.out.println("\nobject " + (i+1) + " details");
            System.out.println(xa[i].i1);
            System.out.println(xa[i].ch);
            System.out.println(xa[i].sa);

            for (int j = 0; j < xa[i].sa.length; j++) {   // for loop for displaying array
                
                System.out.println(xa[i].sa[j]);
                System.out.println(xa[i].sa[j]);
            }
            System.out.println(xa[i].s);
            System.out.println(xa[i].a1);
            System.out.println(xa[i].a1.l);
            System.out.println(xa[i].a1.bo);

            
        }

    }
}
