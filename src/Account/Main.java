package Account;

/**
 * Created by Sondre on 10.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.balance = 100;
        acc.interestRate = 0.03;

        acc.deposit(100);
        acc.addInterest();
        System.out.println(acc.toString());
    }
}
