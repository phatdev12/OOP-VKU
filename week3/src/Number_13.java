public class Number_13 {
    public static void main(String[] args) {
        int n = 10;  // Chiều cao tổng cộng của mẫu hình (cả phần trên và dưới)

        // Vẽ nửa trên của hình
        for (int i = 0; i <= 2 ; i++) {
            // In dấu sao ở mỗi dòng
            for (int j = 0; j < n; j++) {
                if (j >= i && j < n - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Vẽ nửa dưới của hình
        for (int i = 3; i >= 0; i--) {
            // In dấu sao ở mỗi dòng
            for (int j = 0; j < n; j++) {
                if (j >= i && j < n - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}