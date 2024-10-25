public class Room {
    public int beds;
    public boolean tv;
    public boolean telephone;

    public Room(int beds, boolean tv, boolean telephone) {
        this.beds = beds;
        this.tv = tv;
        this.telephone = telephone;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public void setTelephone(boolean telephone) {
        this.telephone = telephone;
    }

    public int getBeds() {
        return beds;
    }

    public boolean getTv() {
        return tv;
    }

    public boolean getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return "Room{" +
                "beds=" + beds +
                ", tv=" + tv +
                ", telephone=" + telephone +
                '}';
    }
}
