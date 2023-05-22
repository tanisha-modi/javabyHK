// Develop a program to show 1 User Defined Method for calling other User Defined Method

class J04_CallUDMformOtherUDM{
    static void m1(){
        System.out.println("m1");
        m2();
    }
    static void m2(){
        System.out.println("m2");
    }
    public static void main(String[] args){
        System.out.println("main");
        m1();
    }
}
