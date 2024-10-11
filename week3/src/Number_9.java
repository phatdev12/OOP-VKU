public class Number_9 {
    public static void main(String[] args) {
        int LDB = 0;
        for (int i=1;i<=100;i++) {
            if (i % 7 ==0) {
                LDB = i;
            }
        }
        System.out.println("So chia het cho 7 la : " + LDB);
    }
}
