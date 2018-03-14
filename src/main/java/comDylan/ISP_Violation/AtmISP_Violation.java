package comDylan.ISP_Violation;

/**
 * Created by dylanb on 14/03/2018.
 * This is an example of violating LSP
 */
public class AtmISP_Violation implements ISP_Interface {
    public void execute(){
        System.out.println("executing BalanceInquiry for account ");
    }
}
