package oop.Heroes;

public class Worrior extends Hero {


    public Worrior(Integer energy, Integer life) {
        super(energy, life);
    }

    @Override
    public void tekeDamage() {
        life--;

    }

    @Override
    public void attack() {
        energy--;

    }
}

