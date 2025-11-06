package pokemons;

import fly.NoFly;

import java.util.ArrayList;

public class Squirtle extends Pokemon {
    public Squirtle(int hp, int attackPower, NoFly noFly, ArrayList<Skill> skills){
        super("Squirtle", hp, attackPower, noFly, skills);  // 부모클래스의 생성자 호출
        System.out.println("꼬북꼬북!");
    }

    @Override
    public void attack(Pokemon target, int choice) {
        int damage = getAttackPower() + 2 + this.skills.get(choice).getDamage();
        System.out.println(getName() + " -> " + target.getName() + "에게 " + this.skills.get(choice).getName() + " 사용! (데미지: " + damage + ")"); // name is private
        target.receiveDamage(damage); // target.setHp(target.getHp()-damage);
//        System.out.println(name + " -> " + target.getName() + "에게 '물대포' 사용");  // name is protected
        System.out.println(target.getName() + "의 남은 Hp: " + target.getHp());
    }
}