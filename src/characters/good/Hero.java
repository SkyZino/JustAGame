package characters.good;

import characters.GeneralTemplate;

import java.util.Scanner;

public class Hero extends GeneralTemplate {
    private static Scanner scanner = new Scanner(System.in);

    public void createHero(Hero hero) {
        System.out.print("Введите имя: ");
        hero.setName(scanner.next());

        do {
            System.out.print("Введите возраст(не меньше 18): ");
            hero.setAge(scanner.nextInt());
        } while(this.age < 18);

        do {
            System.out.print("Введите Хп(от 10 до 40): ");
            int hp = scanner.nextInt();
            if (hp < 40) {
                hero.setHp(hp);
            }
        } while(hp < 10 || hp > 40);


        do {
            System.out.print("Введите Мп(от 10 до 20): ");
            int mp = scanner.nextInt();
            if (mp < 20) {
                setHp(hp);
            }
        } while(mp < 10 || mp > 20);
    }

    public void heroInfo() {
        getInfoAboutCharacter();
    }
}
