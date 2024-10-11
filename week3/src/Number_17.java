public class Number_17 {
    public static void main(String[] args){
        int num1=1;
        //In số đầu tiên
        System.out.print(num1);
        //Vòng lặp in các số
        for (int i=0;i<5;i++) {
            num1 = num1*2 + 1;
            System.out.print(",  " +num1);
        }
    }
}
