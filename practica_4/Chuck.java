public class Chuck extends Pajaro {
    private String color = "yellow";
    private String attack = "ZoOoO0M!!!";
    private int strength = 40;

    public Chuck(){}
    public void attack() {
        System.out.println("Chuck attack: " + this.attack);
    }

    public void getColor() {
        System.out.println("The color is " + color + "the strength is " + strength);
    }
}
