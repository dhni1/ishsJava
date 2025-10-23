public class Charizard extends Pokemon {
    public Charizard(int hp, int attackPower, Wings wings){
        super("리자몽", hp, attackPower, wings);  // 부모클래스의 생성자 호출
        System.out.println("자몽자몽~");
    }

    @Override
    public void attack(Pokemon target) {
        int damage = getAttackPower() + 5;
        System.out.println(getName() + " -> " + target.getName() + "에게 '불대문자' 사용! (데미지: " + damage + ")"); // name is private
        //target.setHp(target.getHp()-damage);;
        target.receiveDamage(damage);
//        System.out.println(name + " -> " + target.getName() + "에게 '전기충격' 사용");  // name is protected
        System.out.println(target.getName() + "의 남은 Hp: " + target.getHp());
    }
}