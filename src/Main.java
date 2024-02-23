import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte androidOS = 1;  // Установите версию приложения для Android по ссылке
        byte iOS = 0;        // Установите версию приложения для iOS по ссылке
        byte clientOS = 1;   //Объявите переменную clientOS, которая равна 0 или 1
        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == androidOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная ОС");
        }
        System.out.println("Задача 2");
        int yearCreate = 2015;         //Для пользователей телефонов 2015 года выпуска и позже
        int clientDeviceYear = 2014;   //год создания телефона
        if (clientOS == iOS) {
            if (clientDeviceYear <= yearCreate) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == androidOS) {
            if (clientDeviceYear <= yearCreate) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println("Задача 3");
//        Напишите программу, которая определяет, является ли год високосным или нет.
//        Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.
//        Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
//        « …. год является високосным» или «... год не является високосным».
//        Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
//        Также високосным является каждый четырехсотый год.
//        Год должен быть больше, чем 1584 (в котором был введен високосный год).

        int year = 2100;
        if ((year % 400) == 0 || (year % 4 == 0 && (year % 100) != 0 && year > 1584))
            System.out.println(year + "год является високосным");
        else System.out.println(year + "год не является високосным");


        System.out.println("Задача 4");
//    В банке для клиентов организовывается доставка карт на дом.
//     Чтобы известить клиента о том, когда будет доставлена его карта, нужно знать расстояние от офиса до адреса доставки.
//      Правила доставки такие:
//     Доставка в пределах 20 км занимает сутки.
//     Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
//     Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
//     Свыше 100 км доставки нет.
//     То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
//     Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.
//     Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
        int deliveryDistance = 95;
        int deliveryUp20 = 20;
        int deliveryUp60 = 60;
        int deliveryUp100 = 100;
        int deliveryDay = 0;
        if (deliveryDistance > deliveryUp100) {
            System.out.println("Доставки нет");
        }
        if (deliveryDistance > 0) {
            deliveryDay = ++deliveryDay;
        }
        if (deliveryDistance >= deliveryUp20) {
            deliveryDay = ++deliveryDay;
        }
        if (deliveryDistance > deliveryUp60) {
            deliveryDay = ++deliveryDay;
        }
        System.out.println("На доставку на "+deliveryDistance+"км потребуется дней: " + deliveryDay);


        System.out.println("Задача 5");
        byte monthNumber = 1;
        switch (monthNumber) {
            case 1:
                System.out.println("Месяц Январь принадлежит к сезону зима.");
                break;
            case 2:
                System.out.println("Месяц Февраль принадлежит к сезону зима.");
                break;
            case 3:
                System.out.println("Месяц Март принадлежит к сезону весна.");
                break;
            case 4:
                System.out.println("Месяц Апрель принадлежит к сезону весна.");
                break;
            case 5:
                System.out.println("Месяц Май принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println("Месяц Июнь принадлежит к сезону лето.");
                break;
            case 7:
                System.out.println("Месяц Июль принадлежит к сезону лето.");
                break;
            case 8:
                System.out.println("Месяц Август принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println("Месяц Сентябрь принадлежит к сезону осень.");
                break;
            case 10:
                System.out.println("Месяц Октябрь принадлежит к сезону осень.");
                break;
            case 11:
                System.out.println("Месяц Ноябрь принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println("Месяц Декабрь принадлежит к сезону зима.");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }
}