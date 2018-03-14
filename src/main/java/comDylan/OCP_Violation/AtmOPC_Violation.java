package comDylan.OCP_Violation;

/**
 * Created by dylanb on 14/03/2018.
 * Violation of Open/Closed Principle
 * Control statment are not good practise for OCP.
 * If anything changes, you need to modify code
 */
public class AtmOPC_Violation {
    private int accountNumber;
    private String Option;

    public AtmOPC_Violation(int num, String opt){
        setAccountNumber(num);
        this.Option = opt;
    }

    public void setAccountNumber(int num){
        accountNumber = num;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
//Example of violation of OPC
    public String toString()  {
        String msg ="";
        if (Option.equals("BalanceInquiry")) {
            msg ="Transaction type is Enquiry";
        }else if(Option.equals("Withdrawal")){
            msg ="Transaction type is Withdrawal";
        }else if(Option.equals("Deposit")){
            msg ="Transaction type is Deposit";
        }
        return msg;
    }


}
