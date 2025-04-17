package characters;

import characters.GeneralTemplate;
import characters.bad.Bandit;
import characters.good.Hero;

import java.util.ArrayList;

public class MyArrayPersonCollection {
    static private ArrayList<GeneralTemplate> charactersList = new ArrayList<>();

    public static void add(Hero hero) {
        charactersList.add(hero);
    }

    public static void add(Bandit bandit) {
        charactersList.add(bandit);
    }

    public static void getInfoAboutAllCharacters() {
        System.out.println("Все созданные персонажи");
        for (GeneralTemplate character : charactersList) {
            character.getInfo();
            System.out.println();
        }
    }
}
