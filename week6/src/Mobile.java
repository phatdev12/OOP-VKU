import java.awt.Color;

public class Mobile {
    public String ownername;
    public Color color;
    public String number;
    public String model;
    public Mobile(String ownername, Color color, String number, String model){
        this.ownername = ownername;
        this.color = color;
        this.number = number;
        this.model = model;
    }

    public String setOwnerName(String ownername) {
        return this.ownername = ownername;
    }

    public String getOwnername(){
        return ownername;
    }

    public Color setColor(Color color) {
        return this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public String setNumber(String number) {
        return this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    public String setModel(String model) {
        return this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "ownername='" + ownername + '\'' +
                ", color=" + color +
                ", number='" + number + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}