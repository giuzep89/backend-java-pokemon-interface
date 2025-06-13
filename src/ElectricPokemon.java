import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final String type = "electric";
    private final List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int HP, String food, String sound) {
        super(name, level, HP, food, sound);
    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon + " attacks " + gymPokemon + " with thunderPunch");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "water":
                damage = 15;
                System.out.println(gymPokemon + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "grass":
                damage = 10;
                System.out.println(gymPokemon + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "fire":
                damage = 8;
                System.out.println(gymPokemon + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "electric":
                damage = 5;
                System.out.println(gymPokemon + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon + " has " + gymPokemon.getHP() + " HP left");
                break;
        }

    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon + " attacks " + gymPokemon + " with electroBall");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "water":
                damage = 15;
                System.out.println(gymPokemon + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "grass":
                damage = 10;
                System.out.println(gymPokemon + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "fire":
                damage = 8;
                System.out.println(gymPokemon + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "electric":
                damage = 5;
                System.out.println(gymPokemon + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon + " has " + gymPokemon.getHP() + " HP left");
                break;
        }
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon + " attacks " + gymPokemon + " with voltTackle");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "water":
                damage = 15;
                System.out.println(gymPokemon + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "grass":
                damage = 10;
                System.out.println(gymPokemon + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "fire":
                damage = 8;
                System.out.println(gymPokemon + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "electric":
                damage = 5;
                System.out.println(gymPokemon + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon + " has " + gymPokemon.getHP() + " HP left");
                break;
        }
    }

    @Override
    public List<String> getAttacks() {
        return this.attacks;
    }

    @Override
    public String getType() {
        return type;
    }
}
