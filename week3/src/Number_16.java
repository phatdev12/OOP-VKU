public class Number_16 {
    public static void main(String[] args) {
        // Khởi tạo biến ban đầu
        int num1 = 0;
        int num2 = 3;

        // In số đầu tiên
        System.out.print(num1);

        // Vòng lặp để tạo các số tiếp theo trong dãy
        for (int i = 0; i < 6; i++) {
            num1 += num2;
            System.out.print(", " + num1);
            num2 += 2; // Tăng dần giá trị 2
        }
    }
}
