public class Chofer {
    String nombre;
    //metodos
    public int vencimientoLic(int fechaActual){
        int dias= fechaActual + 30;
        return dias;
    }
    //constructores

    public Chofer(String nombre) {
        this.nombre = nombre;
    }

    public Chofer() {
    }
    //get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
