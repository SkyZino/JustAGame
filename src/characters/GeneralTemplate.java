package characters;

public class GeneralTemplate {
    protected String name;
    protected int age;
    protected int hp;
    protected int mp;

    protected void setName(String name) {
        this.name = name;
    }

    protected void setAge(int age) {
            if (age >= 18){
                this.age = age;
            } else {
                System.out.println("Тебе должно быть не меньше 18");
            }
        }

    protected void setHp(int hp) {
            if (hp >= 10 && hp <= 40){
                this.hp = hp;
            } else {
                System.out.println("Hp должно быть не меньше 10 и не больше 40");
            }
        }


    protected void setMp(int mp) {
            if (mp >= 10 && mp <= 20){
                this.mp = mp;
            } else {
                System.out.println("Mp должно быть не меньше 10 и не больше 20");
            }
        }

    protected void getInfoAboutCharacter() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hp: " + hp);
        System.out.println("Mp: " + mp);
    }
}
