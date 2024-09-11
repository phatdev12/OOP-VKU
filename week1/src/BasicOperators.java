import java.util.Scanner;

public class BasicOperators {
    private static int a;
    private static int b;

    private static void add() {
        System.out.println(a + " + " + b + " = " + (a+b));
    }

    private static void sub() {
        System.out.println(a + " - " + b + " = " + (a-b));
    }

    private static void mul() {
        System.out.println(a + " x " + b + " = " + (a*b));
    }

    private static void div() {
        System.out.println(a + " / " + b + " = " + (a/b));
    }

    private static void mod() {
        System.out.println(a + " mod " + b + " = " + (a%b));
    }

    public static void init(Scanner obj) {
        System.out.print("Nhap so a: ");
        a = obj.nextInt();
        System.out.print("Nhap so b: ");
        b = obj.nextInt();

        add();
        sub();
        mul();
        div();
        mod();
    }
}
