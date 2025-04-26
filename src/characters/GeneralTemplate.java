package characters;

public abstract class GeneralTemplate {
    protected int hp;
    protected int power;
    protected String name;

    public GeneralTemplate() {
        this(10, 10, "Character");
    }

    public GeneralTemplate(int hp, int power, String name) {
        this.hp = hp;
        this.power = power;
        this.name = name;
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

    public void getInfo() {
        System.out.println("Имя персонажа: " + this.name);
        System.out.println("Здоровье персонажа: " + this.hp);
        System.out.println("Сила персонажа: " + this.power);
    }
}
