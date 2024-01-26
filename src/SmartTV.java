class SmartTV extends Gadget {
    public void receiveNotification(String message) {
        System.out.println("Смарт-телевизор получил увед: " + message);
    }

    public void batteryStatus() {
        System.out.println("Уровень заряда аккумулятора смарт-телевизора: N/A");
    }

    public void streamVideo(String url) {
        System.out.println("Воспроизведение видео по адресу: " + url);
    }

    public void changeChannel(int channel) {
        System.out.println("Переключение канала на: " + channel);
    }

    public void connectionComplete() {
        System.out.println("К смарт-телевизору подключились.");
    }
}