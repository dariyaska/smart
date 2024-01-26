class SmartWatch extends Gadget {
    void receiveNotification(String message) {
        System.out.println("Умные часы получили уведомление: " + message);
    }

    void batteryStatus() {
        System.out.println("Уровень заряда аккумулятора умных часов: 81%");
    }

    void trackHeartRate() {
        System.out.println("Отслеживание пульса.");
    }

    void showTime() {
        System.out.println("Отображение текущего времени.");
    }

    void connectToDevice(SmartDevice anotherDevice) {
        System.out.println("Установка соединения с другим устройством.");

    }
}
