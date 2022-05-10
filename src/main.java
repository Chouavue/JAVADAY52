public class main {

    public static void main (String[] args){
        BankAccount myAccount1 = new BankAccount("Choua", 500.0);
        BankAccount myAccount2 = new BankAccount("Sally", 5000);
        BankAccount myAccount3 = new BankAccount("Jon", 300);
    
  
    myAccount1.deposit(100);
    myAccount1.accountInfo("" , 0);

    myAccount2.withdrawal(100);
    myAccount2.accountInfo("" , 0);

    myAccount3.deposit(100);
    myAccount3.accountInfo("" , 0);


    }
}


