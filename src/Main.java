public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        int clientOS1 = 0;
        int clientDeviceYear = 2015;
        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        int year = 1964;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня.");
        } else {
            System.out.println("Доставки нет.");
        }
        int monthNumber = 7;
        switch (monthNumber) {
            case 1:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону зима.");
                break;
            case 2:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону зима.");
                break;
            case 3:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону весна.");
                break;
            case 4:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону весна.");
                break;
            case 5:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону весна.");
                break;
            case 6:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону лето.");
                break;
            case 7:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону лето.");
                break;
            case 8:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону лето.");
                break;
            case 9:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону осень.");
                break;
            case 10:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону осень.");
                break;
            case 11:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону осень.");
                break;
            case 12:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону зима.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}


