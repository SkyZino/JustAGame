package characters;

import java.util.Scanner;

import characters.bad.Bandit;
import characters.good.Hero;
import characters.CharList;


public class CreateCharacters {
    private static Scanner scanner = new Scanner(System.in);

    public static void createChar() {
        do {
            System.out.println("Нажмите 1, чтобы создать персонажа.");
            System.out.println("Нажмите 0, чтобы закончить создание персонажа.");
            short playerChoice = scanner.nextShort();
            switch (playerChoice) {
                case 1:
                    create();
                    break;
                case 0:
                    return;
            }
        } while (true);
    }

    private static void create() {
        System.out.println("Нажмите 1, для создания героя.");
        System.out.println("Нажмите 2, для создания бандита.");
        short playerChoice = scanner.nextShort();
        switch (playerChoice) {
            case 1:
                Hero hero = new Hero();
                System.out.print("Дайте имя герою: ");
                hero.setName(scanner.next());
                System.out.println("Герой создан");
                CharList.addCharacter(hero);
                break;
            case 2:
                Bandit bandit = new Bandit();
                System.out.print("Дайте имя герою: ");
                bandit.setName(scanner.next());
                System.out.println("Бандит создан");
                CharList.addCharacter(bandit);
                break;
        }
    }
}
