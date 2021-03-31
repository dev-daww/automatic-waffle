public class Lizard extends Animal {
    public Lizard(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating meat");
    }

    public void hunt() {
        System.out.println(name + " is hunting");
    }
}