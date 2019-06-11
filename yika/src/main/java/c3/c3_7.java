package c3;

interface Compute {
    int computer(int n, int m);
}

class c3_7_add implements Compute {

    public int computer(int n, int m) {
        return n + m;
    }

}

class c3_7_minus implements Compute {

    public int computer(int n, int m) {
        return n - m;
    }

}

class c3_7_div implements Compute {

    public int computer(int n, int m) {
        return n / m;
    }

}

class c3_7_cross implements Compute {

    public int computer(int n, int m) {
        return n * m;
    }

}

class UseCompute {
    public void useCom(Compute com, int one, int two) {
        System.out.println("the result is " + com.computer(one, two));
    }
}

class c3_7_test {

    public static void main(String[] args) {
        Compute comp;
        UseCompute uscomp = new UseCompute();
        comp = new c3_7_add();
        uscomp.useCom(comp, 2, 9);
        comp = new c3_7_cross();
        uscomp.useCom(comp, 2, 9);
        comp = new c3_7_div();
        uscomp.useCom(comp, 2, 9);
        comp = new c3_7_minus();
        uscomp.useCom(comp, 2, 9);
    }

}