package hf7;

public class MonsterTestDrive {
    public static void main (String[]args){
        Monster[] monsters = new Monster[3];
        monsters[0] =new Vampire();
        monsters[1] =new Dragon();
        monsters[2] =new Monster();
        for (int i=0; i<Monsters.length; i++){
            monsters[i].frighten(i);
        }

    }
}
class Monster {
    boolean frighten(int z) {
        System.out.println("arragh");
        return true;
    }

    class Vampire extends Monster {
        boolean frighten(byte b) {
            System.out.println("a bite");
            return true;
        }
    }
}
class Dragon extends Monster{
    boolean frighten(int degree){
        System.out.println("breathe fire");
        return true;
    }
}
