public class Number_19 {
    public static void main(String[] args) {
        int n = 10; // Number of terms to print
        int currentValue = 1; // Starting value of the series

        // Print the series
        for (int i = 0; i < n; i++) {
            System.out.print(currentValue + " ");
            currentValue *= 3; // Multiply the current value by 3 for the next term
        }
    }
}
