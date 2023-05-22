public class EscapeSequence09 {
    public static void main(String[] args){
        System.out.println("a\0b");
        System.out.println("a\1b");
        System.out.println("a\2b");
        System.out.println("a\3b");
        System.out.println("a\4b");
        System.out.println("a\5b");
        System.out.println("a\6b");
        System.out.println("a\7b");
        // System.out.println("a\8b");
        // System.out.println("a\9b");   // illegal escape character
        System.out.println("a\10b");
        System.out.println("axyz\101\10b");
    }
}
