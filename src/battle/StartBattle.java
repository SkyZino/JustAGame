package battle;

import java.util.Scanner;
import java.util.Random;
import characters.CharList;
import characters.GeneralTemplate;
import characters.good.Hero;
import characters.bad.Bandit;

public class StartBattle {
    private static Scanner scanner = new Scanner(System.in);
    private static Random rand = new Random();
    public static void startBattle() {
        System.out.println("Начало битвы!");
        System.out.println("Выберете героя: ");
        CharList.getInfoAboutHeros();
        Hero hero = (Hero) CharList.getCharacter(scanner.nextInt());
        CharList.getInfoAboutBandits();
        Bandit bandit = (Bandit) CharList.getCharacter(scanner.nextInt());
        spentBattle(hero, bandit);
    }

    public static void spentBattle(Hero hero, Bandit bandit) {
        System.out.println("Проводим бой между");
        hero.getInfo();
        System.out.println();
        bandit.getInfo();
        do {
            System.out.println();
            System.out.println("Здоровье героя на начало раунда: " + hero.getHp());
            System.out.println("Здоровье бандита на начало раунда: " + bandit.getHp());
            System.out.print("Ход героя: ");
            int heroAction = chooseAction(hero);
            System.out.print("Ход бандита: ");
            int banditAction = chooseAction(bandit);

            if(heroAction == 0 && banditAction == 0) {
                System.out.println("Никто не получил урона");
            } else if (heroAction == 1 && banditAction == 1) {
                hero.setHp((hero.getHp() - bandit.getPower()));
                System.out.println("Герой получил: " + bandit.getPower() + " урона");
                bandit.setHp((bandit.getHp() - hero.getPower()));
                System.out.println("Бандит получил: " + hero.getPower() + " урона");
            }else if (heroAction > banditAction) {
                System.out.println("Бандит получил: " + (hero.getPower() - bandit.getDefence()) + " урона");
                bandit.setHp((hero.getPower() - bandit.getDefence()));
            } else if(heroAction < banditAction) {
                System.out.println("Герой получил: " + (bandit.getPower() - hero.getDefence()) + " урона");
                hero.setHp((bandit.getPower() - hero.getDefence()));
            }

            if(hero.getHp() <= 0) {
                System.out.println("Здоровье героя дошло до 0");
                System.out.println("Герой умер.");
                CharList.removeCharacter(hero);
                return;
            } else if(bandit.getHp() <= 0) {
                System.out.println("Здоровье бандита дошло до 0");
                System.out.println("Бандит умер.");
                CharList.removeCharacter(bandit);
                return;
            }
        }while(true);
    }

    private static int chooseAction(GeneralTemplate character) {
        int action = rand.nextInt(2);
        if (action == 0) {
            System.out.println("Блок");
            return action;
        } else if(action == 1) {
            System.out.println("Удар");
            return action;
        } else {
            System.out.println("Умения");
            return action;
        }
    }
}
