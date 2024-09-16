import java.util.Scanner;

public class Square {
    public static void init(Scanner obj) {
        System.out.print("Nhap chieu rong: ");
        double width = obj.nextDouble();
        System.out.print("Nhap chieu cao: ");
        double height = obj.nextDouble();

        System.out.println("Dien tich: " + (width*height));
        System.out.println("Chu vi: " + (2*(width+height)));
    }

}
