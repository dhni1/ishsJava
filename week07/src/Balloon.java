public class Balloon implements Flyable{
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName() +": 날아갑니다~~");
    }
}
