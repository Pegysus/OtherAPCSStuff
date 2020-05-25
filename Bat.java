public class Bat extends Animal implements Flyer{
    public Bat() {
        super(true, true);
    }
    public Bat(String a) {
        super(true, true);
    }
    public void hair() {
        System.out.println("fur");
    }
    public void eat() {
        System.out.println("fruit and insects");
    }
    public void takeoff() {
        System.out.println("launches from the tree");
    }
    public void land() {
        System.out.println("hangs on a rafter");
    }
}