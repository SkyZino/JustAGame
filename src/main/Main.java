package main;

import characters.good.Hero;

public class Main {
    public static void main(String[] args) {
        createHero();
    }

    private static void createHero() {
        Hero hero = new Hero();
        hero.createHero();
        hero.heroInfo();
    }
}
