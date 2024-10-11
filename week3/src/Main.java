public class Main {
    public static void main(String[] args) {
        int[] stars = {10, 8, 6, 4, 6, 8, 10};
        for(int i = 0; i < stars.length; i++) {
            for (int k = 0; k < (10-stars[i]) / 2; k++) {
                System.out.print("  ");
            }
            for(int j = 0; j < stars[i]; j++) {
                System.out.print("* ");
            }



            System.out.println();
        }
    }
}
