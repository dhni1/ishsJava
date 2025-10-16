public class GameDemo {
    public static void main(String[] args) {
        Pikachu myPikachu = new Pikachu(100);
        Pikachu yourPikachu = new Pikachu(100);

        System.out.println("Game start~");
        myPikachu.attack(yourPikachu);
    }
}
