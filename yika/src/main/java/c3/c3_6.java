package c3;

interface Interface_3_6_A {
    int method(int n);
}

class c_3_6_A implements Interface_3_6_A {

    public int method(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        return sum;
    }

}

class c_3_6_B implements Interface_3_6_A {

    public int method(int n) {
        int sum = 1;
        while (n > 1) {
            sum *= n;
            n--;
        }
        return sum;
    }

}

class c3_6_E {
    public static void main(String[] args) {
        Interface_3_6_A test;
        test = new c_3_6_A();
        System.out.println(test.method(4));
        test = new c_3_6_B();
        System.out.println(test.method(4));
    }
}