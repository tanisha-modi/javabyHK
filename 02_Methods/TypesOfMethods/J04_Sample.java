interface Example {
    public abstract void m1();     // interface only contains abstract method declaration 
}

class J04_Sample implements Example{
    public void m1(){
        System.out.println("Method Implementation");
    }
    public static void main(String[] args) {
        System.out.println("main method");
        // Example.m1();

        // Example e1 = new Example();    // example is abstract, can not be installed
        // e1.m1();

        // J04_Sample.m1();
        J04_Sample s1 = new J04_Sample();   // iss class me define kiya h usii ka object bnega aur invoke krega, interface ka nhi (non-static)
        s1.m1();

    }
}

