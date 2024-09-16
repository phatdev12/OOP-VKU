import java.util.Scanner;

public class StrLength {
    public static void init(Scanner obj) {
        System.out.print("Nhap chuoi: ");
        String text = obj.next();
        System.out.println("\"" + text + "\"" + " co kich thuoc: " + text.length());
    }
}
