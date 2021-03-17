public class Eagle extends Pajaro {
    private String color = "brown";
    private String attack = "Cuco!";
    private int strength = 60;

    public Eagle(){}
    public void attack() {
        System.out.println("Eagle attack: " + this.attack);
    }

    public void getColor() {
        System.out.println("The color is " + color + "the strength is " + strength);
    }
}
