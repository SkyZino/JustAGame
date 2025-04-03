package characters;


import characters.good.Hero;
import characters.bad.Bandit;

import java.util.Objects;

public class MyArrayPersonCollection {
    private static GeneralTemplate[] arrayList = new GeneralTemplate[5];
    private static int size = 0;

    public static void getInfoAboutCreatedChar(int objectNumber) {
        arrayList[objectNumber].getInfoAboutCharacter();
        System.out.println();
    }

    public static void add(Hero person) {
        arrayList[size] = person;
        size++;
        if(size == arrayList.length) {
            arrayExpansion();
        }
    }

    public static void add(Bandit person) {
        arrayList[size] = person;
        size++;
        if(size == arrayList.length) {
            arrayExpansion();
        }
    }

    public static void remove(int personNumber) {
        for (int i = personNumber; i < size - 1; i++) {
            arrayList[i] = arrayList[i + 1];
        }
        size--;
        arrayList[size] = null;
    }

    public static int getSize() {
        return size;
    }

    public static void getHeroInfoFromTheArray(String selectedPerson) {
        for (int i = 0; i < size - 1; i++) {
            if (Objects.equals(selectedPerson, "hero")) {
                if(arrayList[i] instanceof Hero) {
                    System.out.println();
                    getInfoAboutCreatedChar(i);
                }
            } else if (Objects.equals(selectedPerson, "bandit")) {
                if(arrayList[i] instanceof Bandit) {
                    System.out.println();
                    getInfoAboutCreatedChar(i);
                }
            }

        }
    }

    public static GeneralTemplate getPersonByName(String name) {
        for (int i = 0; i < size - 1; i++) {
            if(arrayList[i].name.equals(name)){
                return arrayList[i];
            }
        }
        return null;
    }

    private static void arrayExpansion() {
        GeneralTemplate[] doubleArr = new GeneralTemplate[arrayList.length * 2];
        for (int i = 0; i < arrayList.length; i++) {
            doubleArr[i] = arrayList[i];
        }
        arrayList = doubleArr;
    }
}
