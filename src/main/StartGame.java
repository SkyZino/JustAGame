package main;

import characters.CharList;
import characters.CreateCharacters;

import java.util.Scanner;

public class StartGame {
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начало игры");
        do {
            System.out.println("Ты можешь:");
            System.out.println("1 - Создать персонажа.");
            System.out.println("2 - Посмотреть информацию о созданных персонажах.");
            System.out.println("0 - Закончить игру.");
            int playerChoice = scanner.nextInt();
            switch (playerChoice) {
                case 1:
                    CreateCharacters.createChar();
                    break;
                case 2:
                    CharList.getInfo();
                    break;
                case 0:
                    System.out.println("Игра окончена");
                    return;
            }
        }while(true);
    }
}
