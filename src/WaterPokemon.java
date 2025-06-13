import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final String type = "water";
    private final List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int HP, String food, String sound) {
        super(name, level, HP, food, sound);
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
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
