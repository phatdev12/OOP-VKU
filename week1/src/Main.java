import java.util.Scanner;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // #1 Hello VKU freshmen
        HelloWorld.init("Hello VKU freshmen");

        // #2 ASCIIToChar
        ASCIIToChar.init(obj);

        // #3 CharToASCII
        CharToASCII.init(obj);

        // #4 BasicOperators
        BasicOperators.init(obj);

        // #5 Circle
        Circle.init(obj);

        // #6 Trigonometry
        Trigonometry.init(obj);

        // #7 StrLength
        StrLength.init(obj);

        // #8 Square
        Square.init(obj);
    }
}