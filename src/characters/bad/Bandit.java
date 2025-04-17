package characters.bad;

import characters.GeneralTemplate;

public class Bandit extends GeneralTemplate {

    public Bandit() {
        super(15, 10, "Bandit");
    }

    public Bandit(int hp, int power, String name) {
        super(hp, power, name);
    }

    @Override
    public int hit() {
        return power;
    }
}
