package lessons.Inheritance;

class B extends A {
    @Override
    void meth() {
        super.meth();
        System.out.println("This is overriding");
    }
}