public class AnimalTest {
    public static void main(String[] args) {
        Snake s = new Snake("cobra");
        Bat b = new Bat("fox");
        Hawk h = new Hawk("redtail");
        Monkey m = new Monkey("spider");
        //Animal a = new Animal(true,false);
        Animal z = new Hawk();
        NonFlyer f = new Monkey();
        s.movement();
        System.out.println("Snakes have legs? "+s.legs+" Snakeshave wings? "+s.wings);
        b.takeoff();
        z.eat();
        z.hair();
        z.sound();
        f.movement();
    }
}