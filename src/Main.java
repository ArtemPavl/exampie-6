public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание к уроку 6");
        // Задания 1 и 2
        System.out.println("Задания 1 и 2");
        int clientOS = 1;
        int yearClientOS = 2011;
        if (clientOS == 0){
            if (yearClientOS < 2015){
                System.out.println("Установите облегченную " +
                        "версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (yearClientOS < 2015) {
                System.out.println("Установите облегченную " +
                        "версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        // Задание 3
        System.out.println("Задание 3");
        int year = 1900;
        if ( year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println(year + " год является висакосным");
            }else if (year % 400 == 0){
                System.out.println(year + " год является висакосным");
            }else if (year % 100 == 0) {
                System.out.println(year + " год не является висакосным");
            }
        } else {
            System.out.println(year + " год не является висакосным");
        }

        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: " + day);
        }else if (deliveryDistance >= 20 && deliveryDistance < 60){
            day++;
            System.out.println("Потребуется дней: " + day);
        }else if (deliveryDistance >= 60 && deliveryDistance < 100){
            day = day + 2;
            System.out.println("Потребуется дней: " + day);
        }

        //Задание 5
        /*Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит. Например, 1 месяц (он же январь) принадлежит к сезону зима.

Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.

Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).*/
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}