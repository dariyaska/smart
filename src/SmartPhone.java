class SmartPhone extends Gadget {
    void receiveNotification(String message) {
        System.out.println("Телефон получил увед: " + message);
    }

    void batteryStatus() {
        System.out.println("Уровень зарядки телефона: 82%");
    }

    void makeCall(String number) {
        System.out.println("Звонит на этот номер " + number);
    }

    void sendSMS(String message) {
        System.out.println("Отправляется SMS: " + message);
    }

    void connectToDevice(SmartDevice anotherDevice) {
        System.out.println("Установка соединения с другим устройством.");

    }
}
