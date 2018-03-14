package comDylan;

/**
 * Created by dylanb on 14/03/2018.
 */
public class Withdrawal extends Transaction{

    private double amount;

    public Withdrawal(int num, double amt){
        super(num);
        setWithdrawal(amt);
    }

    public void setWithdrawal(double amt){
        amount = amt;
    }

    public double getWithdrawal(){
        return amount;
    }

    public String toString()  {
        return super.toString()+" Withdrawal class";
    }

    public void execute(){
        System.out.println("executing WithDrawal for account " +super.getAccountNumber() + " for the amount of R"+amount);
    }

}
