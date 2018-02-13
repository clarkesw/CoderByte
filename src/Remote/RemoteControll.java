package Remote;

public class RemoteControll {

    private static final RemoteControll INSTANCE = new RemoteControll();
    private Device device = null;
    private boolean power;

    public static RemoteControll getInstance(){
        return INSTANCE;
    }

    public void setDeviceSelected(Device device) {
        this.device = device;
    }

    public void turnOn() {
        power = true;
        System.out.println("turn on "+ device.toString());
    }

    public void turnOff() {
        power = false;
    }


}
