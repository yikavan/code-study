package c3;

interface InterfaceA {

    void printCapitalLetter();
}

interface InterfaceB {
    void printLowercaseLetter();
}

class Print implements InterfaceA, InterfaceB {

    public void printLowercaseLetter() {
        int i;
        for (i = 0; i < 26; ++i) {
            System.out.print((char) ('a' + i) + "\t");
        }
        System.out.println();
    }

    public void printCapitalLetter() {
        int i;
        for (i = 0; i < 26; ++i) {
            System.out.print((char) ('A' + i) + "\t");
        }
        System.out.println();
    }

}

class E {
    public static void main(String[] args) {
        InterfaceA a = new Print();
        a.printCapitalLetter();
        InterfaceB b = new Print();
        b.printLowercaseLetter();

    }
}

public class c3_4 {

    public static void main(String[] args) {

    }
}