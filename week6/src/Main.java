import java.awt.Color;

public class Main {
    public static void main(String[] args) {
//            Point2D center = new Point2D(1.0, 2.0);
//            Color color = new Color(255, 255, 255);
//            Circle2D circle = new Circle2D(center, 5.0, color);
//
//            circle.display();

            Color color = new Color(255, 255, 255);
            Mobile mobile = new Mobile("tthuy", color, "0868457184", "IPhone 15 pro max");
            System.out.println(mobile.toString());
    }
}