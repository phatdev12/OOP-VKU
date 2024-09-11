import java.util.Scanner;

public class ASCIIToChar {
    private static byte ascii;

    private static void print() {
        System.out.println("ASCII code " + ascii + " la " + ((char) ascii));
    }

    /**
     *
     * @param obj
     */
    public static void init(Scanner obj) {
        System.out.print("Nhap ASCII: ");
        ascii = obj.nextByte();
        print();
    }
}
