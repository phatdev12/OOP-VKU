import java.util.Scanner;

public class Trigonometry {
    public static void init(Scanner obj) {
        System.out.print("Nhap so: ");
        double number = obj.nextDouble();
        double sin = Math.sin(number);
        double cos = Math.cos(number);
        double sqrt = Math.sqrt(number);

        System.out.println("Sin cua " + number + " la: " + sin);
        System.out.println("Cos cua " + number + " la: " + cos);
        System.out.println("Can bac hai cua " + number + " la: " + sqrt);
    }
}
