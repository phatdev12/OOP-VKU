import java.util.Arrays;

public class Hotel {
    public Room[] rooms;
    public String name;
    public Place place;

    public Hotel(Room[] rooms, String name, Place place) {
        this.rooms = rooms;
        this.name = name;
        this.place = place;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public String getName() {
        return name;
    }

    public Place getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + Arrays.toString(rooms) +
                ", name='" + name + '\'' +
                ", place=" + place +
                '}';
    }
}
