import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        System.out.println(Hamso.init(x));

        Char.init();

        StringBuff.init();
    }
} 