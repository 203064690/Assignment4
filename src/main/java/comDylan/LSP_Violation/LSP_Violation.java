package comDylan.LSP_Violation;

/**
 * Created by dylanb on 14/03/2018.
 */
public class LSP_Violation {
    double amount;
    int accountNumber;

    public void setAccountNumber(int num){
        accountNumber = num;
    }

    public void setDeposit(double amt){
        amount = amt;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getDeposit(){
        return amount;
    }
}
