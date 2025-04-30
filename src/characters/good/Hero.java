package characters.good;
import characters.GeneralTemplate;

public class Hero extends GeneralTemplate {
    private int mp;

   public Hero() {
       super();
       this.mp = 10;
       this.defence = 1;
   }

    public Hero(int hp, int power, String name,int defence, int mp) {
        super(hp, power, name, defence);
        this.mp = mp;
    }

    @Override
    public void getInfo() {
        System.out.println("Информация о герое.");
        super.getInfo();
        System.out.println("Мана персонажа: " + this.mp);
    }
}
