public class Number_14 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            // In khoảng trống bên trái
            for (int j = i; j < n; j++) {
                System.out.print("    ");
            }
            // In dấu sao
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*   ");
            }
            // Xuống dòng
            System.out.println();
        }
    }
}
