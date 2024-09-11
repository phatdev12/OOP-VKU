import java.util.Scanner;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner obj;

        // #1 Hello VKU freshmen
        HelloWorld.init("Hello VKU freshmen");

        // #2 ASCIIToChar
        obj = new Scanner(System.in);
        ASCIIToChar.init(obj);

        // #3 CharToASCII
        obj = new Scanner(System.in);
        CharToASCII.init(obj);

        // #4 BasicOperators
        obj = new Scanner(System.in);
        BasicOperators.init(obj);

        // #5 Circle
        obj = new Scanner(System.in);
        Circle.init(obj);
    }
}