import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final String type = "water";
    private final List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int HP, String food, String sound) {
        super(name, level, HP, food, sound);
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with surf");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "fire":
                damage = 27;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "electric":
                damage = 14;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "grass":
                damage = 10;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "water":
                damage = 8;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
        }
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with hydroPump");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "fire":
                damage = 37;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "electric":
                damage = 29;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "grass":
                damage = 21;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "water":
                damage = 11;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
        }
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with hydroCanon");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "fire":
                damage = 38;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "electric":
                damage = 30;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "grass":
                damage = 21;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "water":
                damage = 12;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
        }
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with rainDance");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "fire":
                damage = 37;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "electric":
                System.out.println("rainDance has no effect on " + gymPokemon.getName());
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "grass":
                int bonusHP = 23;
                System.out.println(gymPokemon.getName() + " gains " + bonusHP + " hp");
                updatedHP = gymPokemon.getHP() + bonusHP;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "water":
                damage = 13;
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
