import java.lang.Character;

public class Char {
    public static void init() {
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toString('Y'));
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.reverseBytes('A'));
        System.out.println(Character.toTitleCase('A'));
        System.out.println(Character.isUnicodeIdentifierPart('A'));
    }
}
