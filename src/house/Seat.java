package house;

public class Seat extends Furnature{

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    private int numPeople;

    public Seat(String color, int size) {
        super(color, size);
    }

}
