package characters.good;

import characters.GeneralTemplate;

public class Hero extends GeneralTemplate {
    private int mp;

    public Hero() {
        super(10, 10, "Hero");
        this.mp = 10;
    }

    public Hero(int hp, int power, String name, int mp) {
        super(hp, power, name);
        this.mp = mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    @Override
    public int hit() {
        return power - 4;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Mp: " + mp);
    }
}
