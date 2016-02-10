package Location;

/**
 * Created by Sondre on 10.02.2016.
 */
public class Location {
    int x, y;

    void move(int dx, int dy){
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    void up(){move(0, -1);}
    void down(){move(0, 1);}
    void left(){move(-1, 0);}
    void right(){move(1, 0);}



}
