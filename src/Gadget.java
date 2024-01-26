abstract class Gadget implements SmartDevice {
    public void turnOn() {
        System.out.println("Устройство включено.");
    }

    public void turnOff() {
        System.out.println("Устройство выключено.");
    }

    public void connectToInternet() {
        System.out.println("Устройство подключено к интернету.");
    }

    abstract void receiveNotification(String message);
    abstract void batteryStatus();
}