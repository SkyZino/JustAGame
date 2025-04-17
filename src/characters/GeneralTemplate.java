package characters;

public abstract class GeneralTemplate {
    protected String name;
    protected int power;
    protected int hp;


    public GeneralTemplate(int hp, int power, String name) {
        this.hp = hp;
        this.power = power;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public abstract int hit();

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Power: " + power);
        System.out.println("Hp: " + hp);
    }
}
