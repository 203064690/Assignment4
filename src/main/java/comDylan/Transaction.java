package comDylan;

/**
 * Created by dylanb on 14/03/2018.
 */
public abstract class Transaction {

    private int accountNumber;

    public Transaction(int num){
        setAccountNumber(num);
    }

    public void setAccountNumber(int num){
        accountNumber = num;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String toString()  {
        return "Account: " +accountNumber;
    }

    public abstract void execute();
}