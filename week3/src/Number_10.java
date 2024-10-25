public class Number_10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i<= 100; i ++) {
            if (i%7 ==0){
                sum +=  i;
            }
        }
        System.out.println("Tong cua tat ca tu 1 den 100 chia het cho 7 : " +sum);
    }
}
