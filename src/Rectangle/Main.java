package Rectangle;

/**
 * Created by Sondre on 10.02.2016.
 */
public class Main {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle();
        rect.add(5, 5);
        System.out.println(rect.toString());

        Rectangle rect2 = new Rectangle();
        rect2.add(-3, 6);
        System.out.println(rect.contains(rect2));

        rect.add(rect2);
        System.out.println(rect.toString());
    }

}
