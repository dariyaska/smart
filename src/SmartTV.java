class SmartTV extends Gadget {
    void receiveNotification(String message) {
        System.out.println("Смарт-телевизор получил увед: " + message);
    }

    void batteryStatus() {

    }

    void streamVideo(String url) {
        System.out.println("Воспроизведение видео по адресу: " + url);
    }

    void changeChannel(int channel) {
        System.out.println("Переключение канала на: " + channel);
    }

    void connectToDevice(SmartDevice anotherDevice) {
        System.out.println("Установка соединения с другим устройством.");

    }
}