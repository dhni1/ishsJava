package fly;

import pokemons.Pokemon;

public class NoFly implements Flyable {
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName() +": 힝ㅠ");
    }
}
