package lessons.innerclasses;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle t = new Triangle("T1",1,1,1,5,4,1);
        t.printPerimeter();

        Triangle.MyPoint p = t.new MyPoint(3,1);

        Musician m = new Guitarist();
        m.playMusic();

        Musician musician = new Musician() {
            @Override
            public void playMusic() {
                System.out.println("Playing piano");
            }
        };
        musician.playMusic();
        Musician pp = new Musician() {
            @Override
            public void playMusic() {
                System.out.println("Playing piano");
            }
        };
        pp.playMusic();
    }
}
