public class Wings implements Flyable{
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName() +": (펄럭)");
    }
}
