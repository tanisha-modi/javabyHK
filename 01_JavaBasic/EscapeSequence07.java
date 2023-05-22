class EscapeSequence07{
    public static void main(String[] args){
        // System.out.println("D:\abc\pqr\data.txt");  //Illegal Escape character
        System.out.println("D:\\abc\\pqr\\data.txt");
        System.out.println("D:\test\new.txt");  // path does not get printed properly coz \t and \n are escape character
      //  System.out.println("\");
        System.out.println("\\");


    }
}