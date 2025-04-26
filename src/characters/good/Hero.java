package characters.good;
import characters.GeneralTemplate;

public class Hero extends GeneralTemplate {
    private int mp;

   public Hero() {
       super();
       this.mp = 10;
   }

    public Hero(int hp, int power, String name, int mp) {
        super(hp, power, name);
        this.mp = mp;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Мана персонажа: " + this.mp);
    }
}
