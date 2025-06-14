import java.util.Arrays;
import java.util.List;


public abstract class Pokemon {
    private final String name;
    private final int level;
    private int HP;
    private final String food;
    private final String sound;


    public Pokemon(String name, int level, int HP, String food, String sound) {
        this.name = name;
        this.level = level;
        this.sound = sound;
        this.food = food;
        this.HP = HP;
    }


    public  String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public int getHp() {
        return this.HP;
    }

    public void feed(){
        int feedingTime = getHp() + 20;
        setHP(feedingTime);
    }

    public abstract String getType();

    public abstract List<String> getAttacks();
}
