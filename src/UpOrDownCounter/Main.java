package UpOrDownCounter;

/**
 * Created by Sondre on 10.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        UpOrDownCounter UDCounter = new UpOrDownCounter(0, -5);
        System.out.println(UDCounter.toString());

        UDCounter.count();
        UDCounter.count();
        UDCounter.count();
        UDCounter.count();
        UDCounter.count();
        UDCounter.count();
        UDCounter.count();
        UDCounter.count();
        System.out.println(UDCounter.toString());
    }

}
