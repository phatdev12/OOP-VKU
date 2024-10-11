public class Number_8 {
    public static void main(String[] args) {
        int sum=0;
        int count=0;

        for (int i=1;i <=100;i++) {
            sum += i;
            count ++ ;
        }
        double average = (double) sum/count ;
        System.out.println("The average of numbers from 1 to 100 is: " + average);
    }
}
