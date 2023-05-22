// Below program shows creating parameter and local variables, their purpose, memory allocation and destroying
// alias names, lifetime, scope

public class J11_Addition {
    static void add(int a, int b){
        int c = a + b;
        System.out.println("a : " + a);  //10
        System.out.println("b : " + b);  //20
        System.out.println("c : " + c);  //30
    }
}
// After execution of Addition, a and b and c memory will be destroyed   ..coz they are parameter and local variable