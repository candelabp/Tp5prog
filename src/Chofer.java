public class Chofer {
    //atributos
    String nombre;
    public Taxi taxi;

    //constructores
    public Chofer(String nombre) {
        this.nombre = nombre;
    }

    public Chofer() {
    }

    public Chofer(String nombre, Taxi taxi) {
        this.nombre = nombre;
        this.taxi = taxi;
    }

    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodos
    public int vencimientoLic(int fechaActual){
        int dias= fechaActual + 30;
        return dias;
    }

    public String obtenerMateiculaTaxi(){
        return taxi.getMatricula();
    }
}
