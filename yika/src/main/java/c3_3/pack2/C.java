package c3_3.pack2;

import c3_3.pack1.A;

class B {
    public void f() {
        System.out.println("执行pack2包中的类B的方法f");
    }
}

class C {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.f();
        a.d = 3;
    }
}