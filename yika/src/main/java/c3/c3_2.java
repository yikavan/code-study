package c3;

class Rect {
    protected double width, height;

    Rect() {
        this.width = 10;
        this.height = 10;
    }

    Rect(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    double area() {
        return this.width * this.height;
    }

    double perimeter() {
        return (this.width + this.height) * 2;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }
}

class PlainRect extends Rect {
    double startX, startY;

    PlainRect() {
        setWidth(0);
        setHeight(0);
        setX(0);
        setY(0);
    }

    PlainRect(double startX, double startY, double width, double height) {
        setWidth(width);
        setHeight(height);
        setX(startX);
        setY(startY);
    }

    void setX(double startX) {
        this.startX = startX;
    }

    void setY(double startY) {
        this.startY = startY;
    }

    boolean isInside(double x, double y) {
        if (x >= startX && x <= (startX + width) && y < startY && y >= (startY - height)) {
            return true;
        } else {
            return false;
        }
    }
}

public class c3_2 {

    public static void main(String[] args) {

    }
}