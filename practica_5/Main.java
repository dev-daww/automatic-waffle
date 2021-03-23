public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Bancomer", 10000);
        Cuenta cuenta = new Cuenta("Juan", 1000, 1234);
        banco.addCuenta(cuenta);
        System.out.println("El nuevo saldo total del banco es:" +
            banco.getDinero());

        // Depositar
        banco.depositar("Juan", 1000, 1234);
        System.out.println("El nuevo saldo total del banco es:" +
            banco.getDinero());

        // Retirar
        banco.retirar("Juan", 1000, 1234);
        System.out.println("El nuevo saldo total del banco es:" +
            banco.getDinero());
    }
}
