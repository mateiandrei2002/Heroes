package oop.Heroes;

public class BattleTest {
    public static void main(String[] args) {
        Worrior batman = new Worrior(10,10);
        Mage joker = new Mage(15,8);
        battle(batman,joker);



    }
    public static void battle(Hero aHero, Hero anotherHero){
        aHero.attack();
        anotherHero.tekeDamage();
        System.out.println(aHero);

        anotherHero.attack();
        aHero.tekeDamage();
        System.out.println(anotherHero);
        aHero.attack();
        anotherHero.tekeDamage();
        anotherHero.attack();
        aHero.tekeDamage();

    }
}
