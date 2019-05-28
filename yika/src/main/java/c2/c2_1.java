package c2;

class Lader {
    private double a, b, h, area;

    Lader(double a, double b, double h) {
        seta(a);
        setb(b);
        seth(h);
        this.area = (a + b) * h / 2;
    }

    void seta(double a) {
        this.a = a;
    }

    double geta() {
        return a;
    }

    void setb(double b) {
        this.b = b;
    }

    double getb() {
        return b;
    }

    void seth(double h) {
        this.h = h;
    }

    double geth() {
        return h;
    }

    void setarea() {
        area = (a + b) * h / 2;
    }

    double getarea() {
        return area;
    }

}

class Circle {
    private double r, area, perimeter;
    static double pi = 3.1415926;

    private void setarea() {
        area = r * r * pi;
    }

    private void setper() {
        perimeter = 2 * pi * r;
    }

    Circle() {
        r = 1;
        setarea();
        setper();
    }

    Circle(double r) {
        this.r = r;
        setarea();
        setper();
    }

    double getr() {
        return r;
    }

    double getarea() {
        return area;
    }

    double getper() {
        return perimeter;
    }
}

public class c2_1 {

    public static void main(String[] args) {
        Lader la = new Lader(1, 2, 3);
        Circle cir = new Circle();
        System.out.println("依次输出梯形的上底，下底，高，面积:"+la.geta()+','+la.getb()+','+la.geth()+','+la.getarea());
        System.out.println("现在输出默认圆形的半径，周长，面积:"+cir.getr()+','+cir.getper()+','+cir.getarea());
        cir=new Circle(6);
        System.out.println("现在输出设定的圆形的半径，周长，面积:"+cir.getr()+','+cir.getper()+','+cir.getarea());
    }
}