package lessons.lesson18;

public class ThreadTest2 {
    static int[] a = {12, 3, 6, 80, 99};
    static int max = a[0];

    public static void main(String[] args) {

        Thread maxThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < a.length; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (max < a[i]) {
                        max = a[i];
                    }
                }
            }
        });
        maxThread.start();
        System.out.println("Hello");

//        try {
//            maxThread.join(6000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(max);
        if (!maxThread.isAlive()) ;
        System.out.println(max);
    }
}
