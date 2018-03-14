package comDylan.SRP_Violation;

/**
 * Created by dylanb on 14/03/2018.
 * Example of violation for SRP
 */
public class AtmSRP_Violation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("transaction: "+BalanceInquiry(987654));
        System.out.println("transaction: "+Withdrawal(654789, 1000));
        System.out.println("transaction: "+Deposit(321456, 1500));
    }

    public static String transaction(int num){
        int accountNumber;

        accountNumber = num;
        return "executing Transaction for account "+accountNumber;
    }

    public static String Withdrawal(int num, double amt){
        double amount;
        int accountNumber;

        amount = amt;
        accountNumber = num;
        String msg = transaction(accountNumber);
        return accountNumber+" Withdrawal class \n"+msg  +" for the amount of "+amount;
    }

    public static String Deposit(int num, double amt){
        double amount;
        int accountNumber;

        amount = amt;
        accountNumber = num;
        String msg = transaction(accountNumber);
        return accountNumber+" Deposit class \n"+msg +" for the amount of "+amount;
    }

    public static String BalanceInquiry(int num){
        int accountNumber;

        accountNumber = num;
        String msg = transaction(accountNumber);
        return accountNumber+" Enquiry class \n"+msg;
    }
}
