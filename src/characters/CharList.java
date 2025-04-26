package characters;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class CharList {
    private static ArrayList<GeneralTemplate> charList = new ArrayList<>();

    public static void getInfo() {
        for (GeneralTemplate character : charList) {
            character.getInfo();
            System.out.println();
        }
    }

    public static void addCharacter(GeneralTemplate  character) {
        charList.add(character);
    }
}
