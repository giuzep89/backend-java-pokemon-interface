import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{
    private final String type = "fire";
    private final List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");

    public FirePokemon(String name, int level, int HP, String food, String sound) {
        super(name, level, HP, food, sound);
    }



    public void inferno(Pokemon gymPokemon, Pokemon pokemon) {
    }

    public void pyroBall(Pokemon gymPokemon, Pokemon pokemon) {
    }

    public void fireLash(Pokemon gymPokemon, Pokemon pokemon) {
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
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
