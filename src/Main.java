import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char ch;
        int i = 0;
        int num;
        int nst;
        String name;
        String surfer;
        double pr;
        final String[] namestate = {"Создан","В работе","Готов"};

        System.out.println("Добро пожаловать! ");
        Scanner scanner = new Scanner(System.in);
        Zakaz[] zakarr = new Zakaz[100];
        for( int j = 0; j < 100; j++ )
            zakarr[j] = new Zakaz();

        do {
            System.out.println("q - выход, a - новый заказ, s - поиск заказа по названию, p - вывод всех заказов, g - изменить состояние заказа ");
            ch = scanner.next().charAt(0);
            if (String.valueOf(ch).equals("q")) {
                System.exit(0);
            }
            if (String.valueOf(ch).equals("g")) {
                System.out.print("Введите номер заказа - ");
                num = scanner.nextInt();
                do {
                    System.out.print("Выберете состояние: 0 - Создан,1 - В работе,2 - Готов ");
                    nst = scanner.nextInt();
                } while (nst > 2);
                for (int j = 0; (j <= i); j++) {
                    if (zakarr[j].getNum() == num) {
                        zakarr[j].setState(nst);
                        System.out.print("Состояние заказа изменено!");
                        break;
                    }
                }
            }
            if (String.valueOf(ch).equals("a")) {
                // запросить данные
                System.out.print("Введите название нового заказа - ");
                name = scanner.next();
                System.out.print("Введите стоимость заказа - ");
                pr = scanner.nextDouble();
                zakarr[i].setNamezakaz(name);
                zakarr[i].setPrice(pr);
                System.out.println("Заказ № " + zakarr[i].getNum() + " создан!");
                i++;
            }
            if (String.valueOf(ch).equals("s")) {
                System.out.print("Введите часть названия заказа - ");
                surfer = scanner.next();
                for (int j = 0; (j <= i); j++) {
                    if (zakarr[j].getNamezakaz().toUpperCase().contains(surfer.toUpperCase())) {
                        System.out.println("Номер заказа " + zakarr[j].getNum() + " Название " + zakarr[j].getNamezakaz() + " Стоимость " + zakarr[j].getPrice() + " Состояние " + namestate[zakarr[j].getState()]);
                    }
                }
            }
            if (String.valueOf(ch).equals("p")) {
                for (int j = 0; (j <= i); j++) {
                    System.out.println("Номер заказа " + zakarr[j].getNum() + " Название " + zakarr[j].getNamezakaz() + " Стоимость " + zakarr[j].getPrice() + " Состояние " + namestate[zakarr[j].getState()]);
                }
            }
        } while (i < 100);
    }

}
