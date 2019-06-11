package c3;

class Person {
    String name;// 姓名
    String address;// 地址
    String telphone;// 电话号码
    String email;// 电子邮件地址
}

class Employee extends Person {
    String office;// 办公室
    double wage;// 工资
    String hiredate;// 受雇日期
}

class Faculty extends Employee {
    String degree;// 学位
    String level;// 级别

}

class Staff extends Employee {
    String duty;// 职务称号
}

public class c3_1 {

    public static void main(String[] args) {

    }
}