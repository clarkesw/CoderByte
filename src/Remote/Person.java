package Remote;

public class Person {
    public static void main(String[] args){

        SuroundSound sound = new SuroundSound();
        TV niceLargeScreenTV = new TV();

        // The user's control
        RemoteControll remote = RemoteControll.getInstance();

        remote.setDeviceSelected(sound);
        remote.turnOn();

        remote.setDeviceSelected(niceLargeScreenTV);
        remote.turnOn();
    }
}
