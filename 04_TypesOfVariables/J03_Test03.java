public class J03_Test03 {
    public static void main(String[] args) {
        // declaration : creating new var without value is called variable declaration 
        int i1;

        // definition : creating new variable with value is called variable definition [dec + initialize]
        int i2 = 20;

        // initialization : storing value in a variable 1st time is called variable initialization
        i1 = 10;

        // variable assignment : modifying existing variable value is called variable assignment
        i1 = 15;
        i2 = 25;

        // taking value from the existing variable is called reading variable 
        System.out.println(i1);     // 15  // reading i1 var for printing purpose 

        System.out.println(i2);     // 25 // reading i2 value for printing purpose 

        int i3 = i1;
        // reading i1 var for performing 
        // i3 var dec and initialized with the value of i1
        // i3 is defined with example copy of i1 

        int i4 = i1 + i2;

    }
}
