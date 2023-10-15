package lessons.lesson18;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("t1");
        t1.start();

        MyThread t2 = new MyThread("t2");
        t2.start();

        Thread T3 = new Thread(new MyRunnable("t3"));
        T3.start();

        Thread t4 = new Thread(new Runnable() {


            @Override
            public void run() {
                for (int i = 1; i < 11; i++) {
                    System.out.println(": " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

    }
}
