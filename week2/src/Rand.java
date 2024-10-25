import java.util.Random;

public class Rand {
    public static void init() {
        Random rand = new Random();
        System.out.println(rand.nextInt(100));
    }
}
