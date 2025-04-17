package main;

import java.util.Scanner;

import characters.GeneralTemplate;
import characters.MyArrayPersonCollection;
import characters.bad.Bandit;
import characters.good.Hero;


class СreateCharacters {

    private static Scanner scanner = new Scanner(System.in);
    public static void createCharacters() {
        System.out.println("Какого персонажа хочешь создать?");
        System.out.println("1 - Герой.\n2 - Бандит.");
        int selectedNumber = scanner.nextInt();
        do {
            switch(selectedNumber) {
                case 1:
                    Hero hero = creat();
                    MyArrayPersonCollection.add(hero);
                    break;
                case 2:
                    Bandit bandit = new Bandit();
                    MyArrayPersonCollection.add(bandit);
                    break;
                case 0:
                    return;
            }
            System.out.println("Можете создать еще одного персонажа или выйти.");
            System.out.println("1 - Герой.\n2 - Бандит.\n0 - Выход.");
            selectedNumber = scanner.nextInt();
        } while(true);
    }

    private static Hero creat() {
        System.out.println("1 - Создать персонажа и изменить характеристики.");
        System.out.println("2 - Создать шаблонного персонажа.");
        do {
            int number = scanner.nextInt();
            if (number == 1) {
                Hero hero = new Hero();
                setParameters(hero);
                System.out.print("Укажите значение маны: ");
                hero.setMp(scanner.nextInt());
                return hero;
            } else if(number == 2){
                return new Hero();
            } else {
                System.out.println("Указано неверное значение");
            }
        }while(true);
    }

    private static void setParameters(GeneralTemplate person) {
        System.out.print("Укажите имя: ");
        person.setName(scanner.next());
        System.out.print("Укажите значение здоровья: ");
        person.setHp(scanner.nextInt());
        System.out.print("Укажите значение силы: ");
        person.setPower(scanner.nextInt());
    }
}
