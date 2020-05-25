public abstract class Animal {
    protected boolean wings;
    protected boolean legs;
    public Animal(boolean w, boolean l) {
        wings = w;
        legs = l;
    }
    public void sound() {
        
    }
    public abstract void hair();
    public abstract void eat();
}