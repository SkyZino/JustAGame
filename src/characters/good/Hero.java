package characters.good;

import characters.GeneralTemplate;

import java.util.Scanner;

public class Hero extends GeneralTemplate {
    private static Scanner scanner = new Scanner(System.in);

    public Hero() {
        createHero();
    }

    public void createHero() {
        System.out.print("Введите имя: ");
        setName(scanner.next());

        do {
            System.out.print("Введите возраст(не меньше 18): ");
            setAge(scanner.nextInt());
        } while(this.age < 18);

        do {
            System.out.print("Введите Хп(от 10 до 40): ");
            int hp = scanner.nextInt();
            if (hp <= 40) {
                setHp(hp);
            }
        } while(hp < 10 || hp > 40);


        do {
            System.out.print("Введите Мп(от 10 до 20): ");
            int mp = scanner.nextInt();
            if (mp <= 20) {
                setMp(mp);
            }
        } while(mp < 10 || mp > 20);
    }

//    public void Info() {
//        getInfoAboutCharacter();
//    }
}
