public class profesor extends persona {
    int numeroEmp;


    public profesor(String nombre, String correo, int numeroEmp) {
        super(nombre, correo);
        this.numeroEmp = numeroEmp;
    }


    public void setNumero(int numeroEmp) {
        this.numeroEmp = numeroEmp;
    }


    public int getNumero() {
        return numeroEmp;
    }
}
