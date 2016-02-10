package Diverse;

/**
 * Created by Sondre on 10.02.2016.
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int num1 = 100, num2 = 200;
        int max;

       /*
        if (num1 > num2){
            max = num1;
        }
        else{
            max = num2;
        }
        */

        max = num1 > num2 ? num1: num2; // This does the same job.
                                        // If comparison is true, executes first
                                        // If comparison is false, executes second
    }
}
