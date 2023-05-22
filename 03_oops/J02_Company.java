// Develop a project to create the RWO Employee in PW.
// with its properties eno, ename, dept, two mobile numbers
// create 2 emp HK and BB with their values, display the values on console 

class J02_Company {
    public static void main(String[] args){
        J02_Employee e1 = new J02_Employee();
        J02_Employee e2 = new J02_Employee();

        e1.eno = 001;
        e1.ename = "hk";
        e1.dept = "java";
        e1.salary = 25000;
        e1.mobile = new long[2];
        e1.mobile[0] = 1234567890L;
        e1.mobile[1] = 3214567890L;



        // e1.mobile1 = {1234567890L};
        // e1.mobile2 = {3214569870L};
   
        System.out.println(e1.eno);
        System.out.println(e1.ename);
        System.out.println(e1.dept);
        System.out.println(e1.salary);
        System.out.println(e1.mobile[0]);
        System.out.println(e1.mobile[1]);


        System.out.println("\n\n");
        System.out.println(java.util.Arrays.toString(e1.mobile));  // array jesa print hoga 


        e2.eno = 002;
        e2.ename = "bk";
        e2.dept = "python";
        e2.salary = 35000;
        e2.mobile = new long[]{1234000890L,3214999890L};
         
   
        System.out.println("\n"+ e2.eno);
        System.out.println(e2.ename);
        System.out.println(e2.dept);
        System.out.println(e2.salary);
        System.out.println(e2.mobile[0]);
        System.out.println(e2.mobile[1]);

    }
}
