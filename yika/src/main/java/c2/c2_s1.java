package c2;

public class c2_s1 {

    public static void main(String[] args) {
        Army a=new Army(19);
        a.addWeapon(new Tank());
        a.addWeapon(new Flighter());
        a.addWeapon(new WarShip());
        a.moveAll();
        a.attackAll();
    }
}