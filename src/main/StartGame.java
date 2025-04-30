package main;

import characters.CharList;
import characters.CreateCharacters;
import battle.StartBattle;

import java.util.Scanner;

public class StartGame {
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начало игры");
        do {
            System.out.println("Ты можешь:");
            System.out.println("1 - Создать персонажа.");
            System.out.println("2 - Посмотреть информацию о созданных персонажах.");
            System.out.println("3 - Провести бой.");
            System.out.println("0 - Закончить игру.");
            int playerChoice = scanner.nextInt();
            switch (playerChoice) {
                case 1:
                    CreateCharacters.createChar();
                    break;
                case 2:
                    CharList.getInfoAboutAllCharacters();
                    break;
                case 3:
                    StartBattle.startBattle();
                    break;
                case 0:
                    System.out.println("Игра окончена");
                    return;
            }
        }while(true);
    }
}
