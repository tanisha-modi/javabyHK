 // Develop a program to create the RWO BankAccount in PW with its properties, bankName, branchName, ifsc, 
 // accName, accNum, balance, and address
 
 // create two new accounts for the customers HK and BB with their values. Display their values on console.
  
  class J03_Bank {
    public static void main(String[] args) {


        J03_BankAccount acc1 = new J03_BankAccount();
        J03_BankAccount acc2 = new J03_BankAccount();
        
        // initializing acc1 with HK values
        acc1.bankName = "HDFC";
        acc1.branchName = "Ameerpet";
        acc1.ifsc = "HD124AM";

        acc1.accNum = 875348;  // no need of L at last as it is only 6 digit no
        acc1.accName = "HK";
        acc1.balance = 999999;

        acc1.address = new J03_Address();
        acc1.address.doorno = "1/2-A/B";
        acc1.address.aptname = "HK Heaven";
        acc1.address.flatNum = "G101"; 
        acc1.address.streetNum = "1";
        acc1.address.landMark = "AMW";
        acc1.address.city = "Hyderabad";
        acc1.address.state = "Telangana";
        acc1.address.pincode = 500016;

        // display object 1 values
        System.out.println(" object 1 values --");
        System.out.println("acc1.bankName : " + acc1.bankName);
        System.out.println("acc1.branchName : " + acc1.branchName);
        System.out.println("acc1.ifsc : " + acc1.ifsc);
        System.out.println("acc1.accNum : " + acc1.accNum);
        System.out.println("acc1.accName : " + acc1.accName);
        System.out.println("acc1.balance : " + acc1.balance);
        System.out.println("acc1.address : " + acc1.address);
        System.out.println("acc1.address.doorno" + acc1.address.doorno);
        System.out.println("acc1.address.aptname : " + acc1.address.aptname);
        System.out.println("acc1.address.flatNum : " + acc1.address.flatNum);
        System.out.println("acc1.address.streetNum : " + acc1.address.streetNum);
        System.out.println("acc1.address.landMark : " + acc1.address.landMark);
        System.out.println("acc1.address.city : " + acc1.address.city);
        System.out.println("acc1.address.state : " + acc1.address.state);
        System.out.println("acc1.address.pincode : " + acc1.address.pincode);
        
        
        // initializing acc2 with BB values
        acc2.bankName = "HDFC";
        acc2.branchName = "Ameerpet";
        acc2.ifsc = "HD124AM";
        
        acc2.accNum = 456981;  // no need of L at last as it is only 6 digit no
           acc2.accName = "BB";
           acc2.balance = 999124;
           
           acc2.address = new J03_Address();
        //    acc2.address.doorno = "1/5-A/B";
        //    acc2.address.aptname = "BB Heaven";
        //    acc2.address.flatNum = "G102"; 
           acc2.address.streetNum = "1";
        //    acc2.address.landMark = "AMW";
           acc2.address.city = "Hyderabad";
           acc2.address.state = "Telangana";
           acc2.address.pincode = 500016;
           
           // display object 2 values
           System.out.println("\n\n");
           System.out.println(" object 2 values --");
           System.out.println("acc2.bankName : " + acc2.bankName);
           System.out.println("acc2.branchName : " + acc2.branchName);
           System.out.println("acc2.ifsc : " + acc2.ifsc);
           System.out.println("acc2.accNum : " + acc2.accNum);
        System.out.println("acc2.accName : " + acc2.accName);
        System.out.println("acc2.balance : " + acc2.balance);
        System.out.println("acc2.address : " + acc2.address);
        System.out.println("acc2.address.doorno" + acc2.address.doorno);  // when value is not defined, then it will print null by default (no garbage value)
        System.out.println("acc2.address.aptname : " + acc2.address.aptname);
        System.out.println("acc2.address.flatNum : " + acc2.address.flatNum);
        System.out.println("acc2.address.streetNum : " + acc2.address.streetNum);
        System.out.println("acc2.address.landMark : " + acc2.address.landMark);
        System.out.println("acc2.address.city : " + acc2.address.city);
        System.out.println("acc2.address.state : " + acc2.address.state);
        System.out.println("acc2.address.pincode : " + acc2.address.pincode);
    }
}



