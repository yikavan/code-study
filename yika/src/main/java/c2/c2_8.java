package c2;

class vehicle {
    String Id;
    int speed;
    double max;

    vehicle() {
        setId("XX1234");
        setSpeed(100);
        setMax(100);
    }

    vehicle(String Id, int speed, double max) {
        setId(Id);
        setSpeed(speed);
        setMax(max);
    }

    void accelerate() {
        speed++;
    }

    void slowDown() {
        speed--;
    }

    void setId(String Id) {
        this.Id = Id;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setMax(double max) {
        this.max = max;
    }

    void showAllInformation() {
        System.out.println("车牌:" + Id + "\t车速:" + speed + "\t载重量:" + max);
    }

}

public class c2_8 {

    public static void main(String[] args) {
        vehicle car1 = new vehicle();
        vehicle car2 = new vehicle("5086", 150, 200);
        car1.setId("9752");
        car1.accelerate();
        car2.slowDown();
        car1.showAllInformation();
        car2.showAllInformation();
    }
}