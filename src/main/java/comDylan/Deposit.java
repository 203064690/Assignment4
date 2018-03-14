package comDylan;

/**
 * Created by dylanb on 14/03/2018.
 */
public class Deposit extends Transaction{

    private double amount;

    public Deposit(int num, double amt){
        super(num);
        setDeposit(amt);
    }

    public void setDeposit(double amt){
        amount = amt;
    }

    public double getDeposit(){
        return amount;
    }

    public String toString()  {
        return super.toString()+" Deposit class";
    }

    public void execute(){
        System.out.println("executing Deposit for account " +super.getAccountNumber() + " for the amount of R"+amount);
    }

}
