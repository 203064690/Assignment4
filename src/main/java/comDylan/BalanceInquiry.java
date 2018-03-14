package comDylan;

/**
 * Created by dylanb on 14/03/2018.
 */
public class BalanceInquiry extends Transaction{

    public BalanceInquiry(int num){
        super(num);
    }

    public String toString()  {
        return super.toString()+" Enquiry class";
    }

    public void execute(){
        System.out.println("executing BalanceInquiry for account " +super.getAccountNumber());
    }
}
