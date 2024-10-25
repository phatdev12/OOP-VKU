public class Currency {
    public String name;
    public double currentDollarRate;

    public Currency(String name, double currentDollarRate) {
        this.name = name;
        this.currentDollarRate = currentDollarRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentDollarRate(double currentDollarRate) {
        this.currentDollarRate = currentDollarRate;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", currentDollarRate=" + currentDollarRate +
                '}';
    }
}
