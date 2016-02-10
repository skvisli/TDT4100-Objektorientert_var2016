package Digit;

/**
 * Created by Sondre on 10.02.2016.
 */
public class Digit {
    int tallsystem;
    int siffer;

    Digit(int tallS){
        tallsystem = tallS;
        siffer = 0;
    }

    int getValue(){return siffer;}
    int getTallsystem(){return tallsystem;}

     boolean increment(){
         siffer += 1;
         if (siffer == tallsystem){
             siffer = 0;
             return true;
         }
         return false;
     }

    @Override
    public String toString() {
        return "Digit{" +
                "tallsystem=" + tallsystem +
                ", siffer=" + siffer +
                '}';
    }
}
