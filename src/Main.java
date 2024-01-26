public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        SmartWatch watch = new SmartWatch();
        SmartTV tv = new SmartTV();

        phone.turnOn();
        phone.connectToInternet();
        phone.makeCall("+77753352892");


        watch.turnOn();
        watch.connectToInternet();
        watch.connectionComplete();
        watch.trackHeartRate();


        tv.turnOn();
        tv.connectToInternet();
        tv.connectionComplete();
        tv.streamVideo("https://youtu.be/baaNwRAhHBo?si=lb1fKyDYhcFPGjtI");

    }
}

