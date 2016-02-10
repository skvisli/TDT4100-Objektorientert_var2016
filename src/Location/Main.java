package Location;

/**
 * Created by Sondre on 10.02.2016.
 */
public class Main {

    public static void main(String[] args) {
        Location loc = new Location();
        loc.x = 0;
        loc.y = 0;
        loc.right();
        loc.up();
        loc.up();
        System.out.println(loc.toString());
    }
}
