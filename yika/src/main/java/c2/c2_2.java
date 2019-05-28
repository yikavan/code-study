package c2;

class XiYouJiRenWu {
    double height;
    String name, weapon;

    XiYouJiRenWu() {
        setHeight(160);
        setName("Anonymous");
        setWeapon("折凳");
    }

    XiYouJiRenWu(double height, String name, String weapon) {
        setHeight(height);
        setName(name);
        setWeapon(weapon);
    }

    void setHeight(double height) {
        this.height = height;
    }

    void setName(String name) {
        this.name = name;
    }

    void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    void printName() {
        System.out.print(name + ' ');
    }

    void printWeapon() {
        System.out.print(weapon + ' ');
    }

}

public class c2_2 {
    public static void main(String[] args) {
        XiYouJiRenWu zhuBaJie = new XiYouJiRenWu(180, "猪八八", "九尺钉耙");
        XiYouJiRenWu sunWuKong = new XiYouJiRenWu();
        zhuBaJie.printName();
        zhuBaJie.printWeapon();
        System.out.println();
        sunWuKong.printName();
        sunWuKong.printWeapon();
        System.out.println();
        sunWuKong.setName("孙哥哥");
        sunWuKong.setWeapon("定海神针");
        sunWuKong.printName();
        sunWuKong.printWeapon();
    }

}