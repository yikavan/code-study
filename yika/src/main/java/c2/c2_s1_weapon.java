package c2;

abstract class Weapon {
    abstract void attack();

    abstract void move();
}

class Tank extends Weapon {

    @Override
    void attack() {
        System.out.println("the " + "tank" + " attacks!");
    }

    @Override
    void move() {
        System.out.println("the " + "tank" + " moves!");
    }

}

class Flighter extends Weapon {

    @Override
    void attack() {
        System.out.println("flighter" + " has benn thrown a bomb!");
    }

    @Override
    void move() {
        System.out.println("flighter" + " has moved.");

    }

}

class WarShip extends Weapon {

    @Override
    void attack() {
        System.out.println("our " + "warship" + " is launching a torpedo!");
    }

    @Override
    void move() {
        System.out.println("our " + "warship" + " is swimming");

    }

}

class Army {
    Weapon[] w;
    int now = 0;
    int max;

    Army(int max) {
        setMax(max);
        w = new Weapon[max];
    }

    void setMax(int max) {
        this.max = max;
    }

    void addWeapon(Weapon wa) {
        w[now++] = wa;
    }

    void attackAll() {
        for (int i = 0; i < now; ++i) {
            w[i].attack();
        }
    }

    void moveAll() {
        for (int i = 0; i < now; ++i) {
            w[i].move();
        }

    }
}
