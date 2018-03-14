package comDylan.DIP_Violation;

/**
 * Created by dylanb on 14/03/2018.
 * Below is an example which violates the Dependency Inversion Principle
 * This is the Higher class and needs to be changed when adding another lower class
 */
public class DIP_Violation_Main {
    DIP_Violation deposit;

    public void setDeposit(DIP_Violation dep){
        deposit = dep;
    }

    public void depo(){
        deposit.execute();
    }
}
