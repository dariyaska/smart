class SmartWatch extends Gadget {
    public void receiveNotification(String message) {
        System.out.println("Умные часы получили уведомление: " + message);
    }

    public void batteryStatus() {
        System.out.println("Уровень заряда аккумулятора умных часов: 81%");
    }

    public void trackHeartRate() {
        System.out.println("Отслеживание пульса.");
    }

    public void showTime() {
        System.out.println("Отображение текущего времени.");
    }

    public void connectionComplete() {
        System.out.println("К умным часам подключились.");
    }
}