// package TypesOfMethods;

public class J01_Calc {
    public static void main(String[] args) {
        Addition.main(new String[0]);
        Substraction.main(new String[]{"a", "b"});
    }
}

class Addition{
    public static void main(String[] args) {
        int a = 10;
        int b = 20; int c = a + b;
        System.out.println("Result : " + c);
    }
}

class Substraction{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a-b;
        System.out.println("Result : "+ c);
    }
}
