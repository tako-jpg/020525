public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите приложение для системы iOS по ссылке");
        }
        if (clientOs == 1) {
            System.out.println("Установите приложение для системы Android по ссылке");
        }
        System.out.println("Задача 2");
        int clientDeviceYear = 2013;
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложение для системы iOS по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите приложение для системы iOS по ссылке");
        }
        if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложение для системы Android по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите приложение для системы Android по ссылке");
        }
        System.out.println("Задача 3");
        int year = 2025;
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 101;
        int timeOneZoneDelivery = 1;

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");

        } else if (deliveryDistance > 60) {
            timeOneZoneDelivery += 2;
        } else if (deliveryDistance > 20) {
            timeOneZoneDelivery += 1;
        }
        System.out.println("Потребуется дней доставки:  " + timeOneZoneDelivery);

        System.out.println("Задача 5");
        int monthNumber = 1;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сезон зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}