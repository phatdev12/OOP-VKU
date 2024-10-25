import java.awt.Color;

public class Circle2D {
    private double radius;
    private Color color;
    private Point2D center;

    public Circle2D(Point2D center, double radius, Color color) {
        this.radius = radius;
        this.center = center;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public double setRadius(double radius) {
        return this.radius = radius;
    }

    public Color getColor() {
        return this.color;
    }

    public Color setColor(Color color) {
        return this.color = color;
    }

    public Point2D getCenter() {
        return this.center;
    }

    public Point2D setCenter(Point2D center) {
        return this.center = center;
    }

    public void display() {
        System.out.println("Radius: " + this.getRadius());
        System.out.println("Center: " + "("+this.getCenter().getX()+")," + "("+this.getCenter().getY()+")");
    }
}
