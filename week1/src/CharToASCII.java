import java.util.Scanner;

public class CharToASCII {
    private static char character;

    private static void print() {
        System.out.println("Ky tu " + character + " co ASCII la " + ((byte) character));
    }

    /**
     *
     * @param obj
     */
    public static void init(Scanner obj) {
        System.out.print("Nhap ky tu: ");
        character = obj.next().charAt(0);
        print();
    }
}
