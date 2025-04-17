package main;

//import characters.battle.Battle;
import characters.MyArrayPersonCollection;
import main.СreateCharacters;


import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        СreateCharacters.createCharacters();
        MyArrayPersonCollection.getInfoAboutAllCharacters();
    }
}
