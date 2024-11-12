import java.util.Scanner;
public class Exercise_2 {
    public static boolean checkPrime(int n) {
        if(n<=1) return false;
        if(n==2 || n==3) return true;
        if(n%2 == 0 || n%3 == 0) return false;

        for(int i = 5; i*i<=n; i+=6) {
            if(n%i == 0 || n%(i+2) == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int[] a = {2, 4, 7, 12, 19};
     for(int i = 0; i <= 4; i++) {
         if (a[i] > 0) {
             System.out.println(a[i] + "is positive number");
         } else if (a[i] < 0) {
             System.out.println(a[i] + "is negetive number");
         }
         if(checkPrime(a[i])) {
             System.out.println(a[i] + "is a prime number");
         }
     }
    }
}