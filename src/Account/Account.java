package Account;

/**
 * Created by Sondre on 10.02.2016.
 */
public class Account {
    double balance;
    double interestRate;

    void deposit(double x){
        balance += x;
    }

    void addInterest(){
        balance += balance * interestRate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
