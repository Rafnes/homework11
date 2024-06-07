import java.time.LocalDate;

public class Main {
    public static void checkIfYearIsLeap(int year) {
        boolean isFourth = year % 4 == 0;
        boolean isHundredth = year % 100 == 0;
        boolean isFourHundredth = year % 400 == 0;
        boolean isValid = year > 1584;
        if (isValid && isFourHundredth || (isFourth && !isHundredth)) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
    }

    public static void showAppInstallProposition(int clientOS, int clientDeviceYear) {
        int yearToCompare = 2015;
        if (clientOS == 0 && clientDeviceYear < yearToCompare) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= yearToCompare) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < yearToCompare) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= yearToCompare) {
            System.out.println("Установите приложение для Android по ссылке");
        }
    }

    public static int calculateDaysToDeliver(int deliveryDistance) {
        int daysToDeliver = 0;
        if (deliveryDistance <= 20) {
            daysToDeliver = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            daysToDeliver = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            daysToDeliver = 3;
        }
        return daysToDeliver;
    }

    public static void main(String[] args) {
        //Задание 1
        int year = 2104;
        checkIfYearIsLeap(year);

        //Задание 2
        showAppInstallProposition(1, 2022);

        //Задание 3
        int deliveryDistance = 25;
        if (deliveryDistance <= 0) {
            System.out.println("Расстояние должно быть больше 0");
            return;
        } else if (deliveryDistance > 100) {
            System.out.println("На расстояние свыше 100 км доставка не производится");
            return;
        } else {
            int daysToDeliver = calculateDaysToDeliver(deliveryDistance);
            System.out.println("Потребуется дней на доставку: " + daysToDeliver);
        }
    }
}