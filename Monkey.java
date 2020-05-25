public class Monkey extends Animal implements NonFlyer {
    public Monkey() {
        super(false, true);
    }
    public Monkey(String a) {
        super(false, true);
    }
    public void sound() {
        System.out.println("Chatters");
    }
    public void hair() {
        System.out.println("fur");
    }
    public void eat() {
        System.out.println("fruit");
    }
    public void movement() {
        System.out.println("jumps");
    }
}