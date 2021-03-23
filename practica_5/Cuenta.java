public class Cuenta {
    private String nombre;
    private float saldo;
    private int PIN;

    public Cuenta(String nombre, float saldo, int PIN) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.PIN = PIN;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPIN() {
        return this.PIN;
    }

    public void addSaldo(float saldo) {
        this.saldo += saldo;
    }
    public void retirarSaldo(float saldo) {
        this.saldo -= saldo;
    }
}
