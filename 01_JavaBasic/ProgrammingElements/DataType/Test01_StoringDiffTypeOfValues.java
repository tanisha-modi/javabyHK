// Develop a program to store different of value in the program

class Test01_StoringDiffTypeOfValues {
    public static void main(String[] args){
        // 10        CE : ';' expected
        // 10;       CE : not a statement
        // x = 10;   CE : can not find symbol
        int x ;      // 1. type of the memory ->interger type memory 
                     // 2. size of the memory -> 4 bytes
                     // 3. type of the value and range of the value allowed to store
        x = 10;
        
        // x = 10.5; CE: double can not stored in int, precision lose

        int y = x + 10;       // + is allowed
        // int z = x && 10;   // && is not allow
        // int p = x + 10.5   // CE : possible on in precision
        // public q = 20;     // CE : Illegal start of expression coz public is not data type
        
        // x = true;          // CE : boolen cannot be converted into int
    }
}