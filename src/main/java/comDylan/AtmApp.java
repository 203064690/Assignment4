package comDylan;

/**
 * Created by dylanb on 14/03/2018.
 */
public class AtmApp {

    public static final int MAX_TRANSACTIONS = 3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Transaction[] transaction = new Transaction[MAX_TRANSACTIONS];

        transaction[0] = new BalanceInquiry(987654);
        transaction[1] = new Withdrawal(654789, 1000);
        transaction[2] = new Deposit(321456, 1500);

        for(int counter = 0; counter < transaction.length; ++counter){
            System.out.println("transaction: "+transaction[counter]);
            transaction[counter].execute();
        }
    }


}
