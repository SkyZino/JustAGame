package characters.good;

import characters.GeneralTemplate;

import java.util.Scanner;

public class Hero extends GeneralTemplate {
    private Scanner scanner = new Scanner(System.in);

    public void createHero() {
        System.out.print("Введите имя: ");
        setName(scanner.next());

        System.out.print("Введите возраст(не меньше 18): ");
        do {
            setAge(scanner.nextInt());
        } while(age < 18);

        System.out.print("Введите Хп(от 10 до 40): ");
        do {
            setHp(scanner.nextInt());
        } while(hp < 10 || hp > 40);

        System.out.print("Введите Мп(от 10 до 20): ");
        do {
            setMp(scanner.nextInt());
        } while(mp < 10 || mp > 20);
    }

    public void heroInfo() {
        getInfoAboutCharacter();
    }
}
