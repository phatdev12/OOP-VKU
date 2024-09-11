import java.util.Scanner;

public class Circle {
    private static final float pi = 3.1415f;
    private static double r;

    private static void area() {
        System.out.println("Dien tich hinh tron la: " + (r*r*pi));
    }

    private static void perimeter() {
        System.out.println("Chu vi hinh tron la: " + (2*r*pi));
    }

    public static void init(Scanner obj) {
        System.out.print("Nhap ban kinh: ");
        r = obj.nextDouble();
        area();
        perimeter();
    }
}
