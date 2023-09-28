public class RectangleRunner {
    public static void main(String[] args) {


// creating one instance/object from the Rectangle class
        Rectangle rect1 = new Rectangle( 150, 200);
        Rectangle rect2 = new Rectangle(125);
        Rectangle rect3 = new Rectangle();

        rect1.setWidth(75);
        rect2.setWidth(75);
        rect3.setWidth(75);
        rect2.setLength(75);

        int rect1Area = rect1.calculateArea();
        int rect2Area = rect2.calculateArea();
        int rect3Area = rect3.calculateArea();
        int neededSeed = rect1Area + rect2Area + rect3Area;
        System.out.println("These seeds need " + neededSeed + " square feet of seed.");

        /* Rectangle rect1 = new Rectangle( 150, 200);
        int l1 = rect1.getLength();
        System.out.println("Plot 1 Length: " + l1);
        int w1 = rect1.getWidth();
        System.out.println("Plot 1 Width: " + w1);
        int area1 = rect1.calculateArea();
        System.out.println("Plot 1 Area: " + area1);


        System.out.println();
        Rectangle rect2 = new Rectangle(125);
        int l2 = rect2.getLength();
        System.out.println("Plot 2 Length: " + l2);
        int w2 = rect2.getWidth();
        System.out.println("Plot 2 Width: " + w2);
        int area2 = rect2.calculateArea();
        System.out.println("Plot 2 Area: " + area2);


        System.out.println();
        Rectangle rect3 = new Rectangle();
        int l3 = rect3.getLength();
        System.out.println("Plot 3 Length: " + l3);
        int w3 = rect3.getWidth();
        System.out.println("Plot 3 Width: " + w3);
        int area3 = rect3.calculateArea();
        System.out.println("Plot 3 Area: " + area3); */
    }

}
