package Codsoft.ATM_Interface;
import java.util.Scanner;

class atmmachine{
    private account userAccount;
    atmmachine(account a){
        userAccount = a;
    }
    Scanner sc = new Scanner(System.in);
    private int opt;
    void displayoption(){
            System.out.println("\n*** Enter your choice ***\n    -----------------");
            System.out.print("    |1 for checkbalance|\n    |2 for deposite    |\n    |3 for withdraw    |\n    |4 for exit        |\n -->> ");
            opt = sc.nextInt();
    }
    void transaction(){
        switch(opt){
            case 1 :
                System.out.println("\ncurrent balance is -->> Rs "+userAccount.getbalance()+"/-");
                break;
            case 2 :
                System.out.print("\nEnter doposite amount -->> ");
                double depositeamount = sc.nextDouble();
                userAccount.deposite(depositeamount);
                System.out.println("\nMoney deposited.\nCurrent account balance Rs "+userAccount.getbalance()+"/-");
                break;
            case 3 :
                System.out.print("\nEnter the withdrawl amount -->> ");
                double withdrawlamount = sc.nextDouble();
                if(userAccount.withdrawl(withdrawlamount))   System.out.println("\nWithdrawl successful.\nCurrent balance is Rs - "+userAccount.getbalance()+"/-");
                else    System.out.println("\nOOPS!!  Insufficiant amount.Unable to withdrawl.\nTry again...");
                break;
            case 4 :
                System.out.print("\nExiting...Thank you !!");
                System.exit(0);

            default : System.out.println("Invalid input!!");
        }
    } 
}
class account{
    private double balance;
    account(double initialbal){
        balance = initialbal;
    }
    double getbalance(){
        return balance;
    }
    boolean withdrawl(double amount){
        if(amount<=balance && amount>0){
            balance-=amount;
            return true;
        }
        return false;
    }
    void deposite(double amount){
        balance+=amount;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("-<<< Welcome to ATM machine >>>-");
        account a1 = new account(10000);

        atmmachine atm = new atmmachine(a1);
        while(true){
            atm.displayoption();
            atm.transaction();
       }
    }
}


/*


+ ## TASK 3  ATM Interface
1. create a class to represent the ATM machine.
2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
checking the balance.
3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
checkBalance().
4. Create a class to represent the user's bank account, which stores the account balance.
5. Connect the ATM class with the user's bank account class to access and modify the account
balance.
6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
7. Display appropriate messages to the user based on their chosen options and the success or failure
of their transactions.


 */