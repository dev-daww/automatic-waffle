public class Terrence extends Pajaro {
    private String color = "reddish";
    private String attack = "Wuack!";
    private int strength = 90;

    public Terrence(){}
    public void attack() {
        System.out.println("Terrence attack: " + this.attack);
    }
    public void getColor() {
        System.out.println("The color is " + color + "the strength is " + strength);
    }
}
