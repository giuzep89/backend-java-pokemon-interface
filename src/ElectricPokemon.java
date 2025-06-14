import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final String type = "electric";
    private final List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int HP, String food, String sound) {
        super(name, level, HP, food, sound);
    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunderPunch");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "water":
                damage = 34;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "grass":
                damage = 27;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "fire":
                damage = 19;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "electric":
                damage = 10;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
        }

    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with electroBall");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "water":
                damage = 33;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "grass":
                damage = 26;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "fire":
                damage = 18;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "electric":
                damage = 9;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
        }
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunder");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()) {
            case "water":
                damage = 36;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "grass":
                damage = 28;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "fire":
                damage = 21;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "electric":
                int bonusHP = 10;
                System.out.println(gymPokemon.getName() + " gains " + bonusHP + " hp");
                updatedHP = gymPokemon.getHP() + bonusHP;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
        }
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with voltTackle");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "water":
                damage = 38;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "grass":
                damage = 30;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "fire":
                damage = 21;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "electric":
                damage = 11;
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
        return type;
    }
}
