package comDylan.LSP_Violation;

/**
 * Created by dylanb on 14/03/2018.
 */
public class LSP_Violation_Main {

    private static LSP_Violation getLSP_Violation(){
        // it can be an object returned by some factory ...
        return new LSP_Violation();
    }

    public static void main (String args[]){
        LSP_Violation obj = LSP_Violation_Main.getLSP_Violation();

        obj.setAccountNumber(4545);
        obj.setDeposit(324);
        // user knows that ob it's a deposit.
        // It assumes that he's able to set the AccountNumber and DepositAmount as for the base class

        System.out.println(obj.getDeposit());
    }
}
