package c2;

class Student {
    int No, age;
    String name;

    Student(int stuNo, String name, int age) {
        setNo(stuNo);
        setName(name);
        setAge(age);
    }

    void setNo(int stuNo) {
        this.No = stuNo;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void outPut() {
        System.out.println("学号:" + No + "\t姓名:" + name + "\t年龄" + age);
    }
}

public class c2_5 {

    public static void main(String[] args) {
        Student stu1 = new Student(114514, "袁野", 24);
        Student stu2 = new Student(1919810, "宪呗", 21);
        Student stu3 = new Student(21354, "邱杰文", 22);
        stu1.outPut();
        stu2.outPut();
        stu3.outPut();
        stu1.setAge(15);
        stu2.setName("阿杰");
        stu3.setNo(314514);
        stu1.outPut();
        stu2.outPut();
        stu3.outPut();
    }
}