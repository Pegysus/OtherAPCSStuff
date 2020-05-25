public class Hawk extends Animal implements Flyer {
    public Hawk() {
        super(true, true);
    }
    public Hawk(String a) {
        super(true, true);
    }
    public void sound() {
        System.out.println("Screeches");
    }
    public void hair() {
        System.out.println("feathers");
    }
    public void eat() {
        System.out.println("small animals");
    }
    public void takeoff() {
        System.out.println("glides");
    }
    public void land() {
        System.out.println("perches on a tree top");
    }
}