import java.util.ArrayList;

public class Banco {
    private String nombre;
    private float dinero;
    private ArrayList < Cuenta > cuenta = new ArrayList < Cuenta > ();


    public Banco(String nombre, float dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    public void addCuenta(Cuenta cuenta) {
        this.cuenta.add(cuenta);
        this.dinero += cuenta.getSaldo();
    }

    public float getDinero() {
        return this.dinero;
    }

    public void depositar(String nombre, float cantidad, int PIN) {
        for (int i = 0; i < cuenta.size(); i++) {
            if (cuenta.get(i).getNombre() == nombre) {
                if (cuenta.get(i).getPIN() == PIN) {
                    this.dinero += cantidad;
                    cuenta.get(i).addSaldo(cantidad);
                } else {
                    System.out.println("PIN incorreto");
                }
            }
        }
    }

    public void retirar(String nombre, float cantidad, int PIN) {
        for (int i = 0; i < cuenta.size(); i++) {
            if (cuenta.get(i).getNombre() == nombre) {
                if (cuenta.get(i).getPIN() == PIN) {
                    this.dinero -= cantidad;
                    cuenta.get(i).retirarSaldo(cantidad);
                } else {
                    System.out.println("PIN incorreto");
                }
            }
        }
    }
}
