package house;

public class Lamp {
    private int brightness;

    public void turnOn(){

    }
    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if(brightness <= 10)
            this.brightness = brightness;
    }

}
