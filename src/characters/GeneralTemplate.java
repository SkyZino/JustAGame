package characters;

public abstract class GeneralTemplate {
    protected int hp;
    protected int power;
    protected String name;
    protected int defence;

    public GeneralTemplate() {
        this(10, 3, "Character", 0);
    }

    public GeneralTemplate(int hp, int power, String name, int defence) {
        this.hp = hp;
        this.power = power;
        this.name = name;
        this.defence = defence;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public int getDefence() {
        return defence;
    }

    public void getInfo() {
        System.out.println("Имя персонажа: " + this.name);
        System.out.println("Здоровье персонажа: " + this.hp);
        System.out.println("Сила персонажа: " + this.power);
        System.out.println("Защита персонажа: " + this.defence);
    }
}
