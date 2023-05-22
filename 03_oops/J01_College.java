 

//Develop a project to create the RWO student in PW as part of Naresh IT application

public class J01_College {
    public static void main(String[] args) {
        
        // creating two instancesto represent 
        // student objects HK and BB
        J01_Student s1 = new J01_Student();
        J01_Student s2 = new J01_Student();

        // initializing s1 instance 
        // with HK object value
        s1.sno = 101;
        s1.sname = "HK";
        s1.course = "CJ";
        s1.fee = 2500;


        // initializing s2 instance 
        // with BB object value
        s2.sno = 102;
        s2.sname = "BB";
        s2.course = "Acting";
        s2.fee = 3500;

        // Display values of object s1
        System.out.println("s1 object values -");
        System.out.println("s1.sno\t: "+ s1.sno);
        System.out.println("s1.sname\t: "+ s1.sname);
        System.out.println("s1.course\t: "+ s1.course);
        System.out.println("s1.fee\t: "+ s1.fee);


        // Display values of object s2
        System.out.println();
        System.out.println("s2 object values -");
        System.out.println("s2.sno\t: "+ s2.sno);
        System.out.println("s2.sname\t: "+ s2.sname);
        System.out.println("s2.course\t: "+ s2.course);
        System.out.println("s2.fee\t: "+ s2.fee);



    }
}
