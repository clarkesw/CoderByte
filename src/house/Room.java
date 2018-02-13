package house;

public class Room {
    private Seat couch;
    private Bed bed;

    public void makeBed(){
        bed.makeBed();
    }
    public Lamp getLamp() {
        return lamp;
    }

    private Lamp lamp;

    public Seat getCouch() {
        return couch;
    }

    public void setCouch(Seat couch) {
        this.couch = couch;
    }
}
