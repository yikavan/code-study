package c2;

class People {
    String name, sex;
    int age;
    double height;

    People(String name, String sex, int age, double height) {
        setName(name);
        setsex(sex);
        setage(age);
        setheight(height);
    }

    void speak(String words) {
        System.out.println(words);
    }

    double addab(double a, double b) {
        return a + b;
    }

    void setName(String name) {
        this.name = name;
    }

    void setsex(String sex) {
        this.sex = sex;
    }

    void setage(int age) {
        this.age = age;
    }

    void setheight(double height) {
        this.height = height;
    }

}

public class c2_7 {

    public static void main(String[] args) {
        People a = new People("张三", "男", 18, 1.80);
        a.speak("你好！");
        System.out.println("23+45=" + a.addab(23, 45));
        a.setName("李四");
        System.out.println("名字是" + a.name);

    }
}