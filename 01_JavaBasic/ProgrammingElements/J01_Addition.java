 

public class J01_Addition {
     
    static int add(int a, int b)
        throws IllegalArgumentException{
            if((a<0)||(b<0)){
                throw new IllegalArgumentException("Do not pass negative values");
            }
            else{
                return a+b;
            }
        }
    
        
}
