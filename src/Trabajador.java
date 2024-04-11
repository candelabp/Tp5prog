public class Trabajador {
    //atributos
    private int dni;
    private Empresa empresa;

    //constructores
    public Trabajador(){
    }

    public Trabajador(int dni, Empresa empresa) {
        this.dni = dni;
        this.empresa = empresa;
    }

    //get y set
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    //metodos
    public String obtenerRazonSocialEmpleador() {
        return empresa.getrSocial();
    }
}
