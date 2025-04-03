package characters;


import characters.good.Hero;
import characters.bad.Bandit;

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

//    public static void remove(int personNumber) {
//        for (int i = personNumber; i < size - 1; i++) {
//            arrayList[i] = arrayList[i + 1];
//        }
//        size--;
//        arrayList[size] = null;
//    }

    private static void arrayExpansion() {
        GeneralTemplate[] doubleArr = new GeneralTemplate[arrayList.length * 2];
        for (int i = 0; i < arrayList.length; i++) {
            doubleArr[i] = arrayList[i];
        }
        arrayList = doubleArr;
    }

    public static int getSize() {
        return size;
    }
}
