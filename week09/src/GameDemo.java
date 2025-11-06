import fly.NoFly;
import fly.Wings;
import pokemons.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
        Skill[] pikachuSkills = {
                new Skill("Nuzzle", 20),
                new Skill("ThunderShock", 40),
                new Skill("Quick Attack", 40)
        };

        Skill[] squirtleSkills = {
                new Skill("Tackle", 40),
                new Skill("Water Gun", 40),
                new Skill("Rapid Spin", 50)
        };

        Skill[] charizardSkills = {
                new Skill("Scratch", 40),
                new Skill("Dragon Breath", 60),
                new Skill("Flare Blitz", 120)
        };


        Pokemon playerPokemon = null;
        Scanner scanner = new Scanner(System.in);

        while (true){
            try{
                System.out.print("Select Player Pokemon\n1) Pikachu  2) Squirtle  3) Charizard : ");
                int number = scanner.nextInt();  // string
                if (number-1 == 0){
                    playerPokemon = new Pikachu(100, 27, new NoFly(), pikachuSkills);
                    break;
                }else if(number-1 == 1){
                    playerPokemon = new Squirtle(120, 21, new NoFly(), squirtleSkills);
                    break;
                }else if (number-1 == 2){
                    playerPokemon = new Charizard(200, 40, new Wings(), charizardSkills);
                    break;
                }else
                    System.out.println("Select in Menu");
            }catch (InputMismatchException err) {
                System.out.println("숫자로 입력하세요. 메뉴에서 고르세요.");
                scanner.nextLine();
            }
        }


        int randomNumber = (int)(Math.random() * 3); // 0 ~ 2
        Pokemon enemyPokemon = null;
        System.out.println("A Wild Pokemon Appeared!");
        if(randomNumber == 0)
            enemyPokemon = new Pikachu(100, 27, new NoFly(), pikachuSkills);
        else if (randomNumber == 1)
            enemyPokemon = new Squirtle(120, 21, new NoFly(), squirtleSkills);
        else if (randomNumber == 2)
            enemyPokemon = new Charizard(200, 40, new Wings(), charizardSkills);

        System.out.println("Battle Start!");
        System.out.println("===================");

        while(true) {
            for (int i = 0; i < playerPokemon.skills.length; i++) {
                System.out.println((i + 1) + ". " + playerPokemon.skills[i].getName() + " (" + playerPokemon.skills[i].getDamage() + ")");
            }


            System.out.print("Select skill : ");
            int skillNumber = scanner.nextInt() - 1;

            playerPokemon.attack(enemyPokemon, skillNumber);
            enemyPokemon.attack(playerPokemon, (int)(Math.random() * 3));

            if (enemyPokemon.isFainted() || playerPokemon.isFainted())
                break;
        }
        System.out.println("Battle End");
    }
}