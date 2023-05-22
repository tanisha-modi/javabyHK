 
public  class J01_Calculator{
    public static void main(String[] args){
        try{
            int res = J01_Addition.add(-5,6);
            System.out.println("Result : "+ res);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
 