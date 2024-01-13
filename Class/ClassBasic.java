public class Easy {
    public static void main(String[] args) throws Exception {
        Monster monster = new Monster(333); 

        monster.getHp();
        monster.setDamage(111);
        monster.getHp(); 
    }
}

class Monster {
    public int _hp;

    public Monster (int hp){
        _hp = hp; 
    }

    public void setDamage(int hp) {
        _hp -= hp; 
        if(_hp <0) _hp = 0;
    }

    public void getHp () {
        System.out.println(_hp);
    }
}