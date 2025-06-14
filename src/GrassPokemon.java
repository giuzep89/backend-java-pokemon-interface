import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private final String type = "grass";
    private final List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    public GrassPokemon(String name, int level, int HP, String food, String sound) {
        super(name, level, HP, food, sound);
    }


    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leafStorm");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "electric":
                damage = 40;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "fire":
                damage = 31;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "water":
                damage = 23;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "grass":
                damage = 12;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
        }
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with solarBeam");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "electric":
                damage = 39;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "fire":
                damage = 30;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "water":
                damage = 22;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "grass":
                damage = 12;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
        }
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leechSeed");
        int damage;
        int updatedHP;
        int leechedHP;
        switch (gymPokemon.getType()){
            case "electric":
                damage = 15;
                System.out.println(pokemon.getName() + " leeches " + damage + " hp from " + gymPokemon.getName());
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                leechedHP = pokemon.getHP() + damage;
                pokemon.setHP(leechedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "fire":
                damage = 10;
                System.out.println(pokemon.getName() + " leeches " + damage + " hp from " + gymPokemon.getName());
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                leechedHP = pokemon.getHP() + damage;
                pokemon.setHP(leechedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "water":
                damage = 8;
                System.out.println(pokemon.getName() + " leeches " + damage + " hp from " + gymPokemon.getName());
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                leechedHP = pokemon.getHP() + damage;
                pokemon.setHP(leechedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "grass":
                damage = 5;
                System.out.println(pokemon.getName() + " leeches " + damage + " hp from " + gymPokemon.getName());
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                leechedHP = pokemon.getHP() + damage;
                pokemon.setHP(leechedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
        }
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leaveBlade");
        int damage;
        int updatedHP;
        switch (gymPokemon.getType()){
            case "electric":
                damage = 34;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "fire":
                damage = 26;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "water":
                damage = 18;
                System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
                updatedHP = gymPokemon.getHP() - damage;
                gymPokemon.setHP(updatedHP);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHP() + " HP left");
                break;
            case "grass":
                damage = 8;
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
