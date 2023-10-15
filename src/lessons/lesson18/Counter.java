package lessons.lesson18;

public class Counter {
    private String name;

    public Counter(String name) {
        this.name = name;
    }

    public void count(){
        for (int i = 0; i < 10; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
