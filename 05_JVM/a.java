class Addition{
    static void add(){
        byte a = 10;
        byte b = 20;
        // byte c = a + b; // must type cast to byte toh save the iadd(int add ) in c 
        byte c = (byte)(a + b);
        System.out.println(c);

    }
}

public class a {
    public static void main(String[] args) {
        Addition.add();
    }
}
