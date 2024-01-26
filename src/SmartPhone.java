class SmartPhone extends Gadget {
    public void receiveNotification(String message) {
        System.out.println("Телефон получил увед: " + message);
    }

    public void batteryStatus() {
        System.out.println("Уровень зарядки телефона: 82%");
    }

    public void makeCall(String number) {
        System.out.println("Звонит на этот номер " + number);
    }

    public void sendSMS(String message) {
        System.out.println("Отправляется SMS: " + message);
    }

    public void connectionComplete() {
        System.out.println("К телефону подключились.");
    }
}