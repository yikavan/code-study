package c3;

/**
 * c3_5
 */
class ThreadA extends Thread {
    int pauseTime;
    String name;

    ThreadA(int pauseTime, String name) {
        this.pauseTime = pauseTime;
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 20; ++i) {
            try {
                System.out.println(this.name + "    " + i);
                Thread.sleep(pauseTime);
            } catch (Exception e) {
                System.out.println("线程" + name + "错误");
            }
        }
    }
}

public class c3_5 {

    public static void main(String[] args) {
        ThreadA Thread1 = new ThreadA(300, "a1");
        Thread1.start();
        ThreadA Thread2 = new ThreadA(300, "b2");
        Thread2.start();
    }
}