public class ex17 {
    public static void main(String[] args) {
        System.out.print(1 + ", ");
        System.out.print(7 + ", ");
        for(int i = 7, j = 9, h = 3; j<=42; j+=h) {
            i = i+j;
            System.out.print(i + ", ");
            h+=9;
        }

        for(int i = 79, j = 94, h = 52; j<=1000; j+=h) {
            i = i+j;
            System.out.print(i + ", ");
            h+=9;
        }
    }
}
