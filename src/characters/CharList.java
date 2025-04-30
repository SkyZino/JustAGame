package characters;

import java.util.ArrayList;

import characters.good.Hero;
import characters.bad.Bandit;

public class CharList {
    private static ArrayList<GeneralTemplate> charList = new ArrayList<>();

    public static void getInfoAboutAllCharacters() {
        for (GeneralTemplate character : charList) {
            character.getInfo();
            System.out.println();
        }
    }

    public static void getInfoAboutHeros() {
        for (GeneralTemplate character : charList) {
            if(character instanceof Hero) {
                System.out.println("Номер героя: " + charList.indexOf(character));
                character.getInfo();
                System.out.println();
            }
        }
    }

    public static void getInfoAboutBandits() {
        for (GeneralTemplate character : charList) {
            if(character instanceof Bandit) {
                System.out.println("Номер бандита: " + charList.indexOf(character));
                character.getInfo();
                System.out.println();
            }
        }
    }

    public static GeneralTemplate getCharacter(int index) {
        return charList.get(index);
    }

    public static void addCharacter(GeneralTemplate  character) {
        charList.add(character);
    }

    public static void removeCharacter(GeneralTemplate  character) {
        charList.remove(character);
    }
}
