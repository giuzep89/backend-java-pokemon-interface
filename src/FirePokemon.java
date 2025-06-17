import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{
    private final static String TYPE = "fire";
    private final List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");

    public FirePokemon(String name, int level, int HP, String food, String sound) {
        super(name, level, HP, food, sound, TYPE);
    }



    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with inferno");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "grass":
                damage = 39;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "water":
                damage = 30;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "electric":
                damage = 22;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "fire":
                damage = 12;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
        }
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with pyroball");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "grass":
                damage = 37;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "water":
                damage = 29;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "electric":
                damage = 20;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "fire":
                damage = 10;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
        }
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with firelash");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "grass":
                damage = 36;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "water":
                damage = 28;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "electric":
                damage = 20;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "fire":
                damage = 9;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
        }
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with flamethrower");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "grass":
                damage = 35;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "water":
                damage = 27;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "electric":
                damage = 19;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "fire":
                damage = 10;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
        }
    }


    @Override
    public List<String> getAttacks() {
        return this.attacks;
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
