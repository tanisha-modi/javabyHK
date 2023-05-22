// class J07_overloading {
//     void m1(){}   //overloaded method 
//     void m1(int i1){}             // --> method overloading 
//     void m1(float f1){}
//     void m1(int i1, float f1){}
//     void m1(float f1, int i1){}
// }

// Real time example of method overloading 

class J07_overloading{
    void add(int a, int b){

        System.out.println(a + b);
    }
    void add(float a, float b){

        System.out.println(a + b);
    }

    void add(String a, String b){

        System.out.println(a + b);
    }
    public static void main(String[] args) {
        J07_overloading n1 = new J07_overloading();
        // calling the methods using object 
    }
}