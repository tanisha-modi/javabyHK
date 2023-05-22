// Develop a program to overload methods : define multiple methods with the same name 
// but with different parameters, call & execute them.

class J03_overloadMethod {
    static void m1(){
        System.out.println("m1 with no parameter");
    }
    static void m1(int x){
        System.out.println("m1 with one parameter "+ x);
    }
    static void m1(int x, int y){
        System.out.println("m1 with two parameter "+ x +" , "+ y);
    }

    public static void main(String[] args){
        System.out.println("main");
        m1();
        m1(12);
        m1(12, 15);
    }
    
}
