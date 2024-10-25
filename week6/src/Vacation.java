import java.util.Date;

public class Vacation {
    public int length;
    public Date date;
    public String place;

    public Vacation(int length, Date date, String place) {
        this.length = length;
        this.date = date;
        this.place = place;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getLength() {
        return length;
    }

    public Date getDate() {
        return date;
    }

    public String getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "length=" + length +
                ", date=" + date +
                ", place='" + place + '\'' +
                '}';
    }
}

