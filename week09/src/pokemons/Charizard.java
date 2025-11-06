package pokemons;

import fly.Wings;

import java.util.ArrayList;

public class Charizard extends Pokemon {
    public Charizard(int hp, int attackPower, Wings wings, ArrayList<Skill> skills){
        super("Charizard", hp, attackPower, wings, skills);  // 부모클래스의 생성자 호출
        System.out.println("크와앙");
    }

    @Override
    public void attack(Pokemon target, int choice) {
        int damage = getAttackPower() + 5 + this.skills.get(choice).getDamage();
        System.out.println(getName() + " -> " + target.getName() + "에게 " + this.skills.get(choice).getName() + " 사용! (데미지: " + damage + ")"); // name is private
        //target.setHp(target.getHp()-damage);;
        target.receiveDamage(damage);
//        System.out.println(name + " -> " + target.getName() + "에게 '전기충격' 사용");  // name is protected
        System.out.println(target.getName() + "의 남은 Hp: " + target.getHp());
    }
}