public class Students {
    public double sum;
    public int month;
    public double tax;

    public Students(double sum, int month, double tax) {
        this.sum = sum;
        this.month = month;
        this.tax = tax;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getSum() {
        return sum;
    }

    public int getMonth() {
        return month;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public String toString() {
        return "Students{" +
                "sum=" + sum +
                ", month=" + month +
                ", tax=" + tax +
                '}';
    }
}
