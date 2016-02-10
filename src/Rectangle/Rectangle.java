package Rectangle;

/**
 * Created by Sondre on 10.02.2016.
 * Let you create rectangles with two xy coordinates. minXY is left-upper corner, maxXY is right-bottom corner.
 * Lets you check if a rect is contained within another
 * Lets you add xy points and/or whole rectangles
 */
public class Rectangle {

    int minX;
    int minY;
    int maxX;
    int maxY;
    int width;
    int height;

    public Rectangle() {
        this.minX = 0;
        this.minY = 0;
        this.maxX = 0;
        this.maxY = 0;
        this.width = 0;
        this.height = 0;
    }

    public int getMinX() {
        return minX;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    boolean isEmpty(){
        if (width == 0 || height == 0){
            return true;
        }
        else{
            return false;
        }
    }

    //---------------------- Comparing functions -------------------------

    //rect contains point xy
    boolean contains(int x, int y){
        if (compare(x, minX) >= 0 && compare(x, maxX) <= 0){
            if (compare(y, minY) >= 0 && compare(y, maxY) <= 0){
                return true;
            }
        }
        return false;
    }

    //rect contains another rect
    boolean contains(Rectangle rect){
        if (contains(rect.getMinX(), rect.getMinY()) && (contains(rect.getMaxX(), rect.getMaxY()))){
            return true;
        }
        return false;
    }

    /*
    *Compares two numbers. Returns
    *1 if x > y
    *0 if x == y
    *-1 if x < y
    */
    int compare(int x, int y){
        Integer i;
        i = x;
        return i.compareTo(y);
    }

    //---------------------- Manipulating functions-------------------------

    //Extends rect so it contains point xy
    boolean add(int x, int y){
        if (!contains(x, y)){
            if(x < minX){
                width += minX - x;
                minX = x;
            }
            if (y < minY){
                height += minY - y;
                minY = y;
            }
            if (x > maxX){
                width += x - maxX;
                maxX = x;
            }
            if (y > maxY){
                height += y - maxY;
                maxY = y;
            }
            return true;
        }
        return false;
    }

    //Extend rect so it contains rect2
    boolean add(Rectangle rect){
        if (!contains(rect)){
            add(rect.getMinX(), rect.getMinY());
            add(rect.getMaxX(), rect.getMaxY());
            return true;
        }
        return false;
    }

    //---------------------- toString -------------------------

    @Override
    public String toString() {
        return "Rectangle{" +
                "minX=" + minX +
                ", minY=" + minY +
                ", maxX=" + maxX +
                ", maxY=" + maxY +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
