package characters.bad;

import characters.GeneralTemplate;

import java.util.Scanner;

public class Bandit extends GeneralTemplate {
    private static Scanner scanner = new Scanner(System.in);

    public void createBandit(Bandit bandit) {
        System.out.print("Введите имя: ");
        bandit.setName(scanner.next());

        do {
            System.out.print("Введите возраст(не меньше 18): ");
            bandit.setAge(scanner.nextInt());
        } while(this.age < 18);

        do {
            System.out.print("Введите Хп(от 10 до 40): ");
            int hp = scanner.nextInt();
            if (hp < 40) {
                bandit.setHp(hp);
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

    public void banditInfo() {
        getInfoAboutCharacter();
    }
}
