package characters.bad;
import characters.GeneralTemplate;

public class Bandit extends GeneralTemplate {

    public Bandit() {
        super();
        this.defence = 2;
    }

    public Bandit(int hp, int power, String name, int defence) {
        super(hp, power, name, defence);
    }

    @Override
    public void getInfo() {
        System.out.println("Информация о бандите.");
        super.getInfo();
    }
}
