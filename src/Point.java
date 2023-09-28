public class Point {
    private int xCoord;
    private int yCoord;

    //Constructors
    public Point(int val) {
        xCoord = val;
        yCoord = val;
    }

    public Point() {
        xCoord = 0;
        yCoord = 0;
    }

    public int getX() {
        return xCoord;
    }

    public int getY() {
        return yCoord;
    }

    public int setX(int newX) {
        return xCoord = newX;
    }

    public int setY(int newY) {
        return yCoord = newY;
    }

    public String coordinate(){
        return "(" + xCoord + ", " + yCoord + ")";
    }
}
