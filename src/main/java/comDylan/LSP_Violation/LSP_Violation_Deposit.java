package comDylan.LSP_Violation;

/**
 * Created by dylanb on 14/03/2018.
 */
public class LSP_Violation_Deposit extends LSP_Violation{

    public void setAccountNumber(int num){
        accountNumber = num;
        amount = num;
    }

    public void setDeposit(double amt){
        accountNumber = (int) amt;
        amount = amt;
    }
}
