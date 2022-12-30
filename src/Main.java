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
        int year = 2021;
        if (((year % 4==0) && (year % 100 !=0)) || (year % 400 ==0)) {
            System.out.println(year + " год является високосным.");
        } else {
                System.out.println( year + " год не является високосным.");
            }
        }
    }


