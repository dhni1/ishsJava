import fly.NoFly;
import fly.Wings;
import pokemons.*;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringJoiner;

public class GameDemo {
    public static void main(String[] args) {
//        int randomNumber = (int)(Math.random() * 3); // 0 ~ 2
//        System.out.println(randomNumber);
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

        try{
            while (true){
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
            }
        }catch (InputMismatchException err){
            System.out.println("숫자로 입력하세요. 메뉴에서 고르세요.");
            System.out.println(err.getMessage());
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

        for(int i = 0; i < playerPokemon.skills.length; i++){
            System.out.println((i+1) + ". " + playerPokemon.skills[i].getName() + " ("+ playerPokemon.skills[i].getDamage()+")");
        }

        System.out.print("Select skill : ");
        int skillNumber = scanner.nextInt() - 1;

        enemyPokemon.setHp(enemyPokemon.getHp()-playerPokemon.skills[skillNumber].getDamage());
        System.out.println(enemyPokemon.getName() + " HP is " + enemyPokemon.getHp() + " left");


//        pokemons.Pokemon playerPokemon = new pokemons.Pikachu(100, 27, new fly.NoFly());
//        pokemons.Pokemon playerPokemon = new pokemons.Charizard(200, 40, new fly.Wings());
//        pokemons.Pokemon playerPokemon = new pokemons.Squirtle(120, 21, new fly.NoFly());


//        fly.Jetpack jetpack = new fly.Jetpack();
//
//        pokemons.Pikachu p1 = new pokemons.Pikachu(100, 27, new fly.NoFly());
//        //p1.setFlyingTool(new fly.NoFly());
//        p1.performFlyable();
//        p1.setFlyingTool(jetpack);  // 젯팩 추진기 득템
//        p1.performFlyable();
//
//        pokemons.Pikachu p2 = new pokemons.Pikachu(100, 28);
//        //pokemons.Charizard c1 = new pokemons.Charizard(200, 40, new fly.Jetpack());
//        pokemons.Charizard c1 = new pokemons.Charizard(200, 40, new fly.Wings());
//        //c1.setFlyingTool(new fly.Wings());
//        c1.performFlyable();
//        pokemons.Squirtle s1 = new pokemons.Squirtle(120, 21);
//
//        System.out.println("배틀 시작!");
//        System.out.println(p1);
//        System.out.println(c1);
//        System.out.println("==============");
//
//        int turn = 1;
//        while(!p1.isFainted() && !c1.isFainted()){
//            System.out.println("턴 " + turn + "시작.");
//            p1.attack(c1);
//            if(c1.isFainted()){
//                System.out.println(c1.getName() + "이(가) 기절했습니다! " + p1.getName() + " 승리!");
//                break;
//            }
//            c1.attack(p1);
//            if(p1.isFainted()){
//                System.out.println(p1.getName() + "이(가) 기절했습니다! " + c1.getName() + " 승리!");
//                break;
//            }
//            System.out.println("==============");
//            turn++;
//        }
//        System.out.println("배틀 종료");
    }
}