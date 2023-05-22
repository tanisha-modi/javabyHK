public class J01_Example {
    public static void main(String[] args) {
        System.out.println(Sample.a);
    }
}
class Sample{
    static int a = 10;
    static {                      // static block 
        System.out.println("hi");
    }
}
// static block is executed first 
// output :
// hi 
// 10 