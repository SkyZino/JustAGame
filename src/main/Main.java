package main;

import characters.MyArrayPersonCollection;
import characters.good.Hero;
import characters.bad.Bandit;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Начало игры");
        System.out.println("Сейчас ты можешь(введи цифру для того, чтобы выбрать): ");
        startGame();
    }

    private static void startGame() {
        int selectedNumber;
        do {
            getStartInfo();
            selectedNumber = scanner.nextInt();

        }while(doWhatThePlayerHasChosen(selectedNumber));
    }

    private static void getStartInfo() {
        System.out.println("1. Создать героя. ");
        System.out.println("2. Создать бандита. ");
        System.out.println("3. Посмотреть всех созданных персонажей. ");
        System.out.println("4. Посмотреть информацию о герое. ");
        System.out.println("5. Посмотреть информацию о бандите. ");
        System.out.println("0. Выйти из игры. ");
    }

    private static boolean doWhatThePlayerHasChosen(int selectedNumber) {
        switch (selectedNumber) {
            case 1:
                Hero hero = new Hero();
                System.out.println("Персонаж создан");
                MyArrayPersonCollection.add(hero);
                break;
            case 2:
                Bandit bandit = new Bandit();
                System.out.println("Персонаж создан");
                MyArrayPersonCollection.add(bandit);
                break;
            case 3:
                for (int i = 0; i < MyArrayPersonCollection.getSize(); i++) {
                    MyArrayPersonCollection.getInfoAboutCreatedChar(i);
                }
                break;
        }
        return true;
    }
}
