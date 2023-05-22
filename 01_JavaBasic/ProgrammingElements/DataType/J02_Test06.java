// Develop a user defined data type to store one long value, two charaters as group(array), one boolean value, one sTring. 
// Provide two separate copies of memories for the variables created in this class, then read and display from both memory copies.

class Sample{
    long l = 245666678L;
    char[] ca = { 'a', 'b'};
    boolean b = true;
    String s = "krishna";

}
public class J02_Test06 {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample();

        System.out.println(s1.l);
        System.out.println(s1.ca);  // as String
        System.out.println(java.util.Arrays.toString(s1.ca));
        System.out.println(s1.ca[0]);
        System.out.println(s1.ca[1]);
        System.out.println(s1.s);

        System.out.println();
        System.out.println(s2.l);
        System.out.println(s2.ca);
        System.out.println(java.util.Arrays.toString(s2.ca));
        System.out.println(s2.ca[0]);
        System.out.println(s2.ca[1]);
        System.out.println(s2.s);
    }
}
