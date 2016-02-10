package Digit;

/**
 * Created by Sondre on 10.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Digit dig = new Digit(10);
        for (int i = 0; i < 9; i++){
            dig.increment();
        }
        System.out.println(dig.toString());
    }
}
