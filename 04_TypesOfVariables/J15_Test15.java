// Below program shows sharing p variable as static variable 

public class J15_Test15 {
    static int p;
    public static void main(String[] args){
        p = 10;
        System.out.println("from main p : " + p );
        m1();
        m2();
    }
    static void m1(){
        System.out.println("from m1 P : " + p );
    }
    static void m2(){
        System.out.println("from m2 p : " + p);
    }
}
