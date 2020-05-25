public class Snake extends Animal implements NonFlyer {
    public Snake() {
        super(false, true);
    }
    public Snake(String a) {
        super(false, true);
    }
    public void sound() {
        System.out.println("Hisses");
    }
    public void hair() {
        System.out.println("none");
    }
    public void eat() {
        System.out.println("rats");
    }
    public void movement() {
        System.out.println("slithers");
    }
}