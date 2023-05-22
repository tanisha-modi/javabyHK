import javax.swing.event.SwingPropertyChangeSupport;

// below program shows the performance issue with unnecessary variables creation.
// In this program, we are creating a variable in loop 1 M times (Unnecessarily) in loop 
// then displaying the time taken to execute this loop 
// second time we created the same variable one time and accessing it 1 M times in loop.

public class J07_Test07 {
    public static void main(String[] args) {
        long time1, time2;

        time1 = System.currentTimeMillis();  // System.currentTimeMillis();   // gives current time in milli seconds
        
        for (int i = 0; i < 1000000; i++) {
            int p = 10;
        }
        
        time2 = System.currentTimeMillis();
        System.out.println("first case :");
        System.out.println(time2 - time1);
        System.out.println(time2);
        
        
        System.out.println("second case :");
        int p = 10;
        time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            p = p +i;
        }
        time2 = System.currentTimeMillis();

        System.out.println("time taken to run the loop : " + (time2 - time1));


    }
}
