package UpOrDownCounter;

/**
 * Created by Sondre on 10.02.2016.
 */
public class UpOrDownCounter {
    int start;
    int end;
    int counter;
    boolean upOrDown;

    UpOrDownCounter(int start, int end) {
        this.start = start;
        this.end = end;
        if (start == end) {
            throw new IllegalArgumentException("Start and end must be different value");
        }
        else if (start > end){
            upOrDown = false;
        }
        else{
            upOrDown = true;
        }
    }
    int getCounter(){
        return counter;
    }

    boolean count(){
        if (counter != end) {
            if (upOrDown) {
                counter += 1;
            } else {
                counter -= 1;
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "UpOrDownCounter{" +
                "start=" + start +
                ", end=" + end +
                ", counter=" + counter +
                ", upOrDown=" + upOrDown +
                '}';
    }
}
