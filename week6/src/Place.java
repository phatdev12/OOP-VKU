public class Place {
    public String cityName;
    public String countryName;
    public Currency currency;
    public String cityHallTel;

    public Place(String cityName, String countryName, Currency currency, String cityHallTel) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.currency = currency;
        this.cityHallTel = cityHallTel;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setCityHallTel(String cityHallTel) {
        this.cityHallTel = cityHallTel;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getCityHallTel() {
        return cityHallTel;
    }

    @Override
    public String toString() {
        return "Place{" +
                "cityName='" + cityName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", currency=" + currency +
                ", cityHallTel='" + cityHallTel + '\'' +
                '}';
    }
}
